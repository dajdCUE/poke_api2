package com.example.poke_api.models;

import com.example.poke_api.models.Species;

public class GameIndex {
    private long gameIndex;
    private Species version;

    public long getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(long value) {
        this.gameIndex = value;
    }

    public Species getVersion() {
        return version;
    }

    public void setVersion(Species value) {
        this.version = value;
    }
}
