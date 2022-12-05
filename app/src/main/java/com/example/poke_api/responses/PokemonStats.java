package com.example.poke_api.responses;
import com.example.poke_api.models.Ability;
import com.example.poke_api.models.GameIndex;
import com.example.poke_api.models.HeldItem;
import com.example.poke_api.models.Move;
import com.example.poke_api.models.Species;
import com.example.poke_api.models.Sprites;
import com.example.poke_api.models.Stat;
import com.example.poke_api.models.Type;
import com.google.gson.annotations.SerializedName;

public class PokemonStats {
    private Ability[] abilities;
    private long baseExperience;
    private Species[] forms;
    private GameIndex[] gameIndices;
    private long height;
    private HeldItem[] heldItems;
    private long id;
    private boolean isDefault;
    private String locationAreaEncounters;
    private Move[] moves;
    private String name;
    private long order;
    private Object[] pastTypes;
    private Species species;

    @SerializedName("sprites")
    private Sprites sprites;

    @SerializedName("stats")
    private Stat[] stats;
    private Type[] types;
    private long weight;

    public Ability[] getAbilities() { return abilities; }
    public void setAbilities(Ability[] value) { this.abilities = value; }

    public long getBaseExperience() { return baseExperience; }
    public void setBaseExperience(long value) { this.baseExperience = value; }

    public Species[] getForms() { return forms; }
    public void setForms(Species[] value) { this.forms = value; }

    public GameIndex[] getGameIndices() { return gameIndices; }
    public void setGameIndices(GameIndex[] value) { this.gameIndices = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public HeldItem[] getHeldItems() { return heldItems; }
    public void setHeldItems(HeldItem[] value) { this.heldItems = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public boolean getIsDefault() { return isDefault; }
    public void setIsDefault(boolean value) { this.isDefault = value; }

    public String getLocationAreaEncounters() { return locationAreaEncounters; }
    public void setLocationAreaEncounters(String value) { this.locationAreaEncounters = value; }

    public Move[] getMoves() { return moves; }
    public void setMoves(Move[] value) { this.moves = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public long getOrder() { return order; }
    public void setOrder(long value) { this.order = value; }

    public Object[] getPastTypes() { return pastTypes; }
    public void setPastTypes(Object[] value) { this.pastTypes = value; }

    public Species getSpecies() { return species; }
    public void setSpecies(Species value) { this.species = value; }

    public Sprites getSprites() { return sprites; }
    public void setSprites(Sprites value) { this.sprites = value; }

    public Stat[] getStats() { return stats; }
    public void setStats(Stat[] value) { this.stats = value; }

    public Type[] getTypes() { return types; }
    public void setTypes(Type[] value) { this.types = value; }

    public long getWeight() { return weight; }
    public void setWeight(long value) { this.weight = value; }
}