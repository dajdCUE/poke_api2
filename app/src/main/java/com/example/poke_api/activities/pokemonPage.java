package com.example.poke_api.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.poke_api.R;
import com.example.poke_api.models.Pokemon;
import com.example.poke_api.network.PokeApi;
import com.example.poke_api.responses.PokemonStats;
import com.example.poke_api.responses.Stat;
import com.example.poke_api.ui.PokemonStatAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class pokemonPage extends AppCompatActivity {

    private RecyclerView rvPokemonStat;
    private PokemonStatAdapter pokemonStatAdapter;
    private List<Stat[]> pokemonStatsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_page);

        TextView tv = (TextView) findViewById(R.id.tv_stats);

        Intent i = getIntent();

        String nombre = i.getStringExtra("nombre");

        String baseUrl="https://pokeapi.co/api/v2/";
        String url_poke = baseUrl+nombre+"/";

        System.out.println(url_poke);



        //String endpointIdPokemon =
        //Lamamos a la instancia de builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url_poke)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        loadPokemonStats(retrofit,nombre);



    }

    private void loadPokemonStats(Retrofit retrofit, String nombre){
        PokeApi api = retrofit.create(PokeApi.class);
        Call<PokemonStats> call = api.getPokemonByName(nombre);

        call.enqueue(new Callback<PokemonStats>() {
            @Override
            public void onResponse(Call<PokemonStats> call, Response<PokemonStats> response) {
                if(response.isSuccessful()){
                    PokemonStats pokemonStats = response.body();
                    Stat[] pokemonStatsList1 = pokemonStats.getStats();
                    pokemonStatsList.add(pokemonStatsList1);
                    for (Stat[] item : pokemonStatsList) {

                        System.out.println(""+item[0].getBaseStat());
                    }


                }
            }

            @Override
            public void onFailure(Call<PokemonStats> call, Throwable t) {

            }
        });
    }
}