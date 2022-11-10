package com.example.poke_api;

import static com.example.poke_api.utils.Constants.DEBUG_POKEMON;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.poke_api.network.PokeApi;
import com.example.poke_api.responses.PokemonResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String baseUrl="https://pokeapi.co/api/v2/";

        //Lamamos a la instancia de builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Instanciamos la API de pokemon
        PokeApi api = retrofit.create(PokeApi.class);
        Call<PokemonResponse> call = api.getPokemonList();


        //Encolamos llamada asíncrona
        call.enqueue(new Callback<PokemonResponse>() {
            @Override
            public void onResponse(Call<PokemonResponse> call, Response<PokemonResponse> response) {
                if(response.isSuccessful()){
//                    assert response.body() != null;
                    String pokemon = response.body().getPokemonList().get(2).getName();
                    Log.d(DEBUG_POKEMON, "Te elijo a tí: " + pokemon);
                }
            }

            @Override
            public void onFailure(Call<PokemonResponse> call, Throwable t) {

            }
        });
    }


}