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

    //Getters

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    //Setters
    public void setCount(int count) {
        this.count = count;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
