package com.example.poke_api.models;

public class Stat {
    private int baseStat;
    private int effort;
    private Species stat;

    public Species getStat() {
        return stat;
    }

    public void setStat(Species stat) {
        this.stat = stat;
    }

    public int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int value) {
        this.baseStat = value;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int value) {
        this.effort = value;
    }


}
