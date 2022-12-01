package com.example.poke_api.network;

import com.example.poke_api.responses.PokemonResponse;
import com.example.poke_api.responses.PokemonStats;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokeApi {

    @GET("pokemon")
    Call<PokemonResponse> getPokemonList();

    @GET("pokemon/{nombre}/")
    Call<PokemonStats> getPokemonByName(@Path("nombre") String nombre);

}
