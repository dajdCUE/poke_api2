package com.example.poke_api.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.poke_api.R;
import com.example.poke_api.models.Pokemon;
import com.example.poke_api.network.PokeApi;
import com.example.poke_api.responses.PokemonStats;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class pokemonPage extends AppCompatActivity {

    private List<PokemonStats> pokemonStatsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_page);

        Intent i = getIntent();

        String id = i.getStringExtra("id");

        String baseUrl="https://pokeapi.co/api/v2/";
        String url_poke = baseUrl+id;

        //String endpointIdPokemon =
        //Lamamos a la instancia de builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url_poke)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        loadPokemonStats(retrofit,id);



    }

    private void loadPokemonStats(Retrofit retrofit, String id){
        PokeApi api = retrofit.create(PokeApi.class);
        Call<PokemonStats> call = api.getPokemonByID(id);

        call.enqueue(new Callback<PokemonStats>() {
            @Override
            public void onResponse(Call<PokemonStats> call, Response<PokemonStats> response) {
                if(response.isSuccessful()){
                    PokemonStats pokemonStats = response.body();
                    List<PokemonStats> pokemonStatsList = pokemonStats.getStats();
                    System.out.println(""+pokemonStats.getStats());
                }
            }

            @Override
            public void onFailure(Call<PokemonStats> call, Throwable t) {

            }
        });
    }
}