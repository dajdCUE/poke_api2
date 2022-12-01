package com.example.poke_api.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.poke_api.R;
import com.example.poke_api.models.Pokemon;
import com.example.poke_api.network.PokeApi;
import com.example.poke_api.responses.PokemonResponse;
import com.example.poke_api.ui.PokemonAdapter;
import com.example.poke_api.utils.Constants;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    // UI elements (fuera del onCreate)
    private RecyclerView rvPokemon;
    private PokemonAdapter pokemonAdapter;
    private List<Pokemon> pokemonList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaración y asociación de objetos base (dentro del onCreate)
        pokemonList = new ArrayList<Pokemon>();
        rvPokemon = findViewById(R.id.rvPokemon);

        // Configurar Adapter (dentro del onCreate)
        pokemonAdapter = new PokemonAdapter(pokemonList, MainActivity.this);

        // Configurar RecyclerView
        rvPokemon.setAdapter(pokemonAdapter);
        rvPokemon.setHasFixedSize(true);

        // Crear un gestor de layout para el RecyclerView (será vertical y lineal simple)
        final LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        // Introducir el LayoutManager generado al RecyclerView
        rvPokemon.setLayoutManager(layoutManager);

        String baseUrl="https://pokeapi.co/api/v2/";

        //Lamamos a la instancia de builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Cargar pokemons en el RecyclerView (lo último)
        loadPokemons(retrofit);





    }

    private void loadPokemons(Retrofit retrofit) {
        //Instanciamos la API de pokemon
        PokeApi api = retrofit.create(PokeApi.class);
        Call<PokemonResponse> call = api.getPokemonList();


        //Encolamos llamada asíncrona
        call.enqueue(new Callback<PokemonResponse>() {
            @Override
            public void onResponse(Call<PokemonResponse> call, Response<PokemonResponse> response) {
                if(response.isSuccessful()){
//
                    PokemonResponse pokemonsResponse = response.body();		// Recuperar el cuerpo de la respuesta
                    List<Pokemon> newPokemons = pokemonsResponse.getPokemonList();	// Almacenar los datos del cuerpo de la respuesta en una lista
                    pokemonList.addAll(newPokemons);					// Añadir la lista a la lista pokemon
                    pokemonAdapter.notifyDataSetChanged();				// Indicar al Adapter que se han añadido nuevos elementos y que debe actualizarse
                }
            }

            @Override
            public void onFailure(Call<PokemonResponse> call, Throwable t) {
                Log.d(Constants.DEBUG_POKEMON,"Algo falla amigo"+t.toString());
            }
        });
    }


}