package com.example.poke_api.network;

import com.example.poke_api.responses.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeApi {

    @GET("pokemon")
    Call<PokemonResponse> getPokemonList();
}
