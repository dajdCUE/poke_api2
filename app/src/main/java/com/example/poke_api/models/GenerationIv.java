package com.example.poke_api.models;

import com.example.poke_api.models.Sprites;

public class GenerationIv {
    private Sprites diamondPearl;
    private Sprites heartgoldSoulsilver;
    private Sprites platinum;

    public Sprites getDiamondPearl() {
        return diamondPearl;
    }

    public void setDiamondPearl(Sprites value) {
        this.diamondPearl = value;
    }

    public Sprites getHeartgoldSoulsilver() {
        return heartgoldSoulsilver;
    }

    public void setHeartgoldSoulsilver(Sprites value) {
        this.heartgoldSoulsilver = value;
    }

    public Sprites getPlatinum() {
        return platinum;
    }

    public void setPlatinum(Sprites value) {
        this.platinum = value;
    }
}
