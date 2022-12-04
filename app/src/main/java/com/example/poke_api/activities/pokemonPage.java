package com.example.poke_api.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.poke_api.R;
import com.example.poke_api.models.Stat;
import com.example.poke_api.network.PokeApi;
import com.example.poke_api.responses.PokemonStats;
import com.example.poke_api.utils.Constants;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class pokemonPage extends AppCompatActivity {

    private List<Stat> statList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_page);

        TextView tvHp = (TextView) findViewById(R.id.tvHPDef);
        TextView tvName = (TextView) findViewById(R.id.tvNameDef);
        ImageView ivPoke = (ImageView) findViewById(R.id.ivPokStat);

        Intent i = getIntent();

        String id = i.getStringExtra("id");

        String baseUrl="https://pokeapi.co/api/v2/";

        //Lamamos a la instancia de builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        loadPokemonStats(retrofit,id, tvHp, ivPoke, tvName);



    }

    private void loadPokemonStats(Retrofit retrofit, String id, TextView tvHP, ImageView iv, TextView tvName){
        PokeApi api = retrofit.create(PokeApi.class);
        Call<PokemonStats> call = api.getPokemonById(id);

        call.enqueue(new Callback<PokemonStats>() {
            @Override
            public void onResponse(Call<PokemonStats> call, Response<PokemonStats> response) {
                if(response.isSuccessful()){
                    PokemonStats pokemonStats = response.body();

                    //System.out.println(""+pokemonStats.getStatsList().get(0).getBaseStat());

                    //tv.setText(""+pokemonStats.getStatsList().get(0).getStat().getName());
                    //String urlSprite = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/"+id+".gif";


                    String urlSprite = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/"+id+".png";



                    // Insertamos imagen desde URL con Glide en el ImageView
                    Glide.with(getApplicationContext())
                            .load(urlSprite)
                            .centerCrop()
                            .error(R.drawable.pokeball_background)
                            .fitCenter()
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
                            .into(iv);


                    tvName.setText(pokemonStats.getName());
                    if(pokemonStats.getStats()[0].getBaseStat() == 0){
                        System.out.println("esto no funciona");
                    }else{
                        System.out.println("Vamos bien" + pokemonStats.getStats()[0].getBaseStat());
                    }
                    tvHP.setText(String.valueOf(pokemonStats.getStats()[0].getStat().getName()));
                }
            }

            @Override
            public void onFailure(Call<PokemonStats> call, Throwable t) {
                Log.d(Constants.DEBUG_POKEMON,"Algo falla amigo"+t.toString());
            }
        });
    }
}