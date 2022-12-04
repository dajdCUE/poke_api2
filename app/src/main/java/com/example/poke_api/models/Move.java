package com.example.poke_api.models;

public class Move {
    private Species move;
    private VersionGroupDetail[] versionGroupDetails;

    public Species getMove() {
        return move;
    }

    public void setMove(Species value) {
        this.move = value;
    }

    public VersionGroupDetail[] getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public void setVersionGroupDetails(VersionGroupDetail[] value) {
        this.versionGroupDetails = value;
    }
}
