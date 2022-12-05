package com.example.poke_api.models;

import com.google.gson.annotations.SerializedName;

public class Stat {

    @SerializedName("base_stat")
    private int baseStat;
    private long effort;
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

    public void setBaseStat(int baseStat) {
        this.baseStat = baseStat;
    }

    public long getEffort() {
        return effort;
    }

    public void setEffort(long value) {
        this.effort = value;
    }


}
