package com.example.poke_api.models;

import com.google.gson.annotations.SerializedName;

public class Other {
    @SerializedName("dream_world")
    private DreamWorld dreamWorld;


    private Home home;

    @SerializedName("official-artwork")
    private OfficialArtwork officialArtwork;

    public DreamWorld getDreamWorld() {
        return dreamWorld;
    }

    public void setDreamWorld(DreamWorld value) {
        this.dreamWorld = value;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home value) {
        this.home = value;
    }

    public OfficialArtwork getOfficialArtwork() {
        return officialArtwork;
    }

    public void setOfficialArtwork(OfficialArtwork value) {
        this.officialArtwork = value;
    }
}
