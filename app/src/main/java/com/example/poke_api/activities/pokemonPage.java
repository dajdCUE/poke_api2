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
import com.example.poke_api.network.PokeApi;
import com.example.poke_api.responses.PokemonStats;
import com.example.poke_api.utils.Constants;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class pokemonPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_page);


        TextView tvName = (TextView) findViewById(R.id.tvNameDef);
        TextView tvHp = (TextView) findViewById(R.id.tvHPDef);
        TextView tvAttack = (TextView) findViewById(R.id.tvAttackDef);
        TextView tvDefense = (TextView) findViewById(R.id.tvDefenseDef);
        TextView tvSpecialAttack = (TextView) findViewById(R.id.tvSpecialAttackDef);
        TextView tvSpeed = (TextView) findViewById(R.id.tvSpeedDef);
        TextView tvNameBig = (TextView) findViewById(R.id.tvNameBig);
        TextView tvPeso = (TextView) findViewById(R.id.tvPeso);
        TextView tvAltura = (TextView) findViewById(R.id.tvAltura);
        ImageView ivPoke = (ImageView) findViewById(R.id.ivPokStat);


        Intent i = getIntent();

        String id = i.getStringExtra("id");

        String baseUrl="https://pokeapi.co/api/v2/";

        //Lamamos a la instancia de builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        loadPokemonStats(retrofit,id, tvHp, ivPoke, tvName, tvAttack, tvDefense, tvSpecialAttack, tvSpeed, tvNameBig, tvPeso, tvAltura);



    }

    private void loadPokemonStats(Retrofit retrofit, String id, TextView tvHP, ImageView iv, TextView tvName, TextView tvAttack,
    TextView tvDefense, TextView tvSpecialAttack, TextView tvSpeed, TextView tvNameBig, TextView tvPeso, TextView tvAltura){


        PokeApi api = retrofit.create(PokeApi.class);
        Call<PokemonStats> call = api.getPokemonById(id);

        call.enqueue(new Callback<PokemonStats>() {
            @Override
            public void onResponse(Call<PokemonStats> call, Response<PokemonStats> response) {
                if(response.isSuccessful()){
                    PokemonStats pokemonStats = response.body();


                    //String urlSprite = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/"+id+".png";

                    String urlSprite = pokemonStats.getSprites().getOther().getOfficialArtwork().getFrontDefault();

                    // Insertamos imagen desde URL con Glide en el ImageView
                    Glide.with(getApplicationContext())
                            .load(urlSprite)
                            .centerCrop()
                            .error(R.drawable.pokeball_background)
                            .fitCenter()
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
                            .into(iv);


                    tvPeso.setText(String.valueOf(pokemonStats.getWeight()) + " Kg");
                    tvAltura.setText(String.valueOf(pokemonStats.getHeight())+ " m");
                    tvNameBig.setText(pokemonStats.getName() + "#" + pokemonStats.getID());
                    tvName.setText(pokemonStats.getName());
                    tvHP.setText(String.valueOf(pokemonStats.getStats()[0].getBaseStat()));
                    tvAttack.setText(String.valueOf(pokemonStats.getStats()[1].getBaseStat()));
                    tvDefense.setText(String.valueOf(pokemonStats.getStats()[2].getBaseStat()));
                    tvSpecialAttack.setText(String.valueOf(pokemonStats.getStats()[3].getBaseStat()));
                    tvSpeed.setText(String.valueOf(pokemonStats.getStats()[5].getBaseStat()));
                }
            }
            @Override
            public void onFailure(Call<PokemonStats> call, Throwable t) {
                Log.d(Constants.DEBUG_POKEMON,"Algo falla amigo"+t.toString());
            }
        });
    }
}