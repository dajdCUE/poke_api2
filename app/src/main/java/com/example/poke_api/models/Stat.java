package com.example.poke_api.models;

public class Stat {
    private int baseStat;
    private long effort;
    private Species stat;

    public Species getStat() {
        return stat;
    }

    public void setStat(Species stat) {
        this.stat = stat;
    }

    public long getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int value) {
        this.baseStat = value;
    }

    public long getEffort() {
        return effort;
    }

    public void setEffort(long value) {
        this.effort = value;
    }


}
