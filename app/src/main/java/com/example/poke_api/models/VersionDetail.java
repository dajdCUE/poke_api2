package com.example.poke_api.models;

import com.example.poke_api.models.Species;

public class VersionDetail {
    private long rarity;
    private Species version;

    public long getRarity() {
        return rarity;
    }

    public void setRarity(long value) {
        this.rarity = value;
    }

    public Species getVersion() {
        return version;
    }

    public void setVersion(Species value) {
        this.version = value;
    }


}
