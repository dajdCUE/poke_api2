package com.example.poke_api.models;

public class Stat {
    private long baseStat;
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

    public void setBaseStat(long baseStat) {
        this.baseStat = baseStat;
    }

    public long getEffort() {
        return effort;
    }

    public void setEffort(long value) {
        this.effort = value;
    }


}
