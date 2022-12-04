package com.example.poke_api.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.poke_api.R;
import com.example.poke_api.models.Pokemon;
import com.example.poke_api.network.PokeApi;
import com.example.poke_api.responses.PokemonStats;
import com.example.poke_api.utils.Constants;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class pokemonPage extends AppCompatActivity {

    private RecyclerView rvPokemonStat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_page);

        TextView tv = (TextView) findViewById(R.id.tv_stats);

        Intent i = getIntent();

        String id = i.getStringExtra("id");

        String baseUrl="https://pokeapi.co/api/v2/";



        //String endpointIdPokemon =
        //Lamamos a la instancia de builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        loadPokemonStats(retrofit,id, tv);



    }

    private void loadPokemonStats(Retrofit retrofit, String id, TextView tv){
        PokeApi api = retrofit.create(PokeApi.class);
        Call<PokemonStats> call = api.getPokemonById(id);

        call.enqueue(new Callback<PokemonStats>() {
            @Override
            public void onResponse(Call<PokemonStats> call, Response<PokemonStats> response) {
                if(response.isSuccessful()){
                    PokemonStats pokemonStats = response.body();

                    /*Stat[] pokemonStatsList1 = pokemonStats.getStats();
                    pokemonStatsList.add(pokemonStatsList1);
                    for (Stat[] item : pokemonStatsList) {

                        System.out.println(""+item[0].getBaseStat());
                    }*/
                    assert pokemonStats != null;
                    tv.setText(String.valueOf(pokemonStats.getName()));

                }
            }

            @Override
            public void onFailure(Call<PokemonStats> call, Throwable t) {
                Log.d(Constants.DEBUG_POKEMON,"Algo falla amigo"+t.toString());
            }
        });
    }
}