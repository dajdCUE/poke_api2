package com.example.poke_api.responses;

import com.example.poke_api.models.Pokemon;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PokemonResponse {

    //Generamos atributos
    private int count;
    private String next;
    private String previous;

    @SerializedName("results")
    private List<Pokemon> pokemonList;

    
}
