package com.example.poke_api.models;

import com.google.gson.annotations.SerializedName;

public class OfficialArtwork {

    @SerializedName("front_default")
    private String frontDefault;

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String value) {
        this.frontDefault = value;
    }
}
