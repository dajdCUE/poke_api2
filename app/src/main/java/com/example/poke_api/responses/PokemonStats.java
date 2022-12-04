package com.example.poke_api.responses;


import java.util.Map;

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
    private Sprites sprites;
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

// Ability.java



class Ability {
    private Species ability;
    private boolean isHidden;
    private long slot;

    public Species getAbility() { return ability; }
    public void setAbility(Species value) { this.ability = value; }

    public boolean getIsHidden() { return isHidden; }
    public void setIsHidden(boolean value) { this.isHidden = value; }

    public long getSlot() { return slot; }
    public void setSlot(long value) { this.slot = value; }
}

// Species.java


// GameIndex.java


 class GameIndex {
    private long gameIndex;
    private Species version;

    public long getGameIndex() { return gameIndex; }
    public void setGameIndex(long value) { this.gameIndex = value; }

    public Species getVersion() { return version; }
    public void setVersion(Species value) { this.version = value; }
}

// HeldItem.java


 class HeldItem {
    private Species item;
    private VersionDetail[] versionDetails;

    public Species getItem() { return item; }
    public void setItem(Species value) { this.item = value; }

    public VersionDetail[] getVersionDetails() { return versionDetails; }
    public void setVersionDetails(VersionDetail[] value) { this.versionDetails = value; }
}

// VersionDetail.java


 class VersionDetail {
    private long rarity;
    private Species version;

    public long getRarity() { return rarity; }
    public void setRarity(long value) { this.rarity = value; }

    public Species getVersion() { return version; }
    public void setVersion(Species value) { this.version = value; }


}

class Species {
    private String name;
    private String url;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}

// Move.java


 class Move {
    private Species move;
    private VersionGroupDetail[] versionGroupDetails;

    public Species getMove() { return move; }
    public void setMove(Species value) { this.move = value; }

    public VersionGroupDetail[] getVersionGroupDetails() { return versionGroupDetails; }
    public void setVersionGroupDetails(VersionGroupDetail[] value) { this.versionGroupDetails = value; }
}

// VersionGroupDetail.java


 class VersionGroupDetail {
    private long levelLearnedAt;
    private Species moveLearnMethod;
    private Species versionGroup;

    public long getLevelLearnedAt() { return levelLearnedAt; }
    public void setLevelLearnedAt(long value) { this.levelLearnedAt = value; }

    public Species getMoveLearnMethod() { return moveLearnMethod; }
    public void setMoveLearnMethod(Species value) { this.moveLearnMethod = value; }

    public Species getVersionGroup() { return versionGroup; }
    public void setVersionGroup(Species value) { this.versionGroup = value; }
}

// GenerationV.java



 class GenerationV {
    private Sprites blackWhite;

    public Sprites getBlackWhite() { return blackWhite; }
    public void setBlackWhite(Sprites value) { this.blackWhite = value; }
}

// GenerationIv.java


 class GenerationIv {
    private Sprites diamondPearl;
    private Sprites heartgoldSoulsilver;
    private Sprites platinum;

    public Sprites getDiamondPearl() { return diamondPearl; }
    public void setDiamondPearl(Sprites value) { this.diamondPearl = value; }

    public Sprites getHeartgoldSoulsilver() { return heartgoldSoulsilver; }
    public void setHeartgoldSoulsilver(Sprites value) { this.heartgoldSoulsilver = value; }

    public Sprites getPlatinum() { return platinum; }
    public void setPlatinum(Sprites value) { this.platinum = value; }
}

// Versions.java



 class Versions {
    private GenerationI generationI;
    private GenerationIi generationIi;
    private GenerationIii generationIii;
    private GenerationIv generationIv;
    private GenerationV generationV;
    private Map<String, Home> generationVi;
    private GenerationVii generationVii;
    private GenerationViii generationViii;

    public GenerationI getGenerationI() { return generationI; }
    public void setGenerationI(GenerationI value) { this.generationI = value; }

    public GenerationIi getGenerationIi() { return generationIi; }
    public void setGenerationIi(GenerationIi value) { this.generationIi = value; }

    public GenerationIii getGenerationIii() { return generationIii; }
    public void setGenerationIii(GenerationIii value) { this.generationIii = value; }

    public GenerationIv getGenerationIv() { return generationIv; }
    public void setGenerationIv(GenerationIv value) { this.generationIv = value; }

    public GenerationV getGenerationV() { return generationV; }
    public void setGenerationV(GenerationV value) { this.generationV = value; }

    public Map<String, Home> getGenerationVi() { return generationVi; }
    public void setGenerationVi(Map<String, Home> value) { this.generationVi = value; }

    public GenerationVii getGenerationVii() { return generationVii; }
    public void setGenerationVii(GenerationVii value) { this.generationVii = value; }

    public GenerationViii getGenerationViii() { return generationViii; }
    public void setGenerationViii(GenerationViii value) { this.generationViii = value; }
}

// Sprites.java


 class Sprites {
    private String backDefault;
    private Object backFemale;
    private String backShiny;
    private Object backShinyFemale;
    private String frontDefault;
    private Object frontFemale;
    private String frontShiny;
    private Object frontShinyFemale;
    private Other other;
    private Versions versions;
    private Sprites animated;

    public String getBackDefault() { return backDefault; }
    public void setBackDefault(String value) { this.backDefault = value; }

    public Object getBackFemale() { return backFemale; }
    public void setBackFemale(Object value) { this.backFemale = value; }

    public String getBackShiny() { return backShiny; }
    public void setBackShiny(String value) { this.backShiny = value; }

    public Object getBackShinyFemale() { return backShinyFemale; }
    public void setBackShinyFemale(Object value) { this.backShinyFemale = value; }

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public Object getFrontFemale() { return frontFemale; }
    public void setFrontFemale(Object value) { this.frontFemale = value; }

    public String getFrontShiny() { return frontShiny; }
    public void setFrontShiny(String value) { this.frontShiny = value; }

    public Object getFrontShinyFemale() { return frontShinyFemale; }
    public void setFrontShinyFemale(Object value) { this.frontShinyFemale = value; }

    public Other getOther() { return other; }
    public void setOther(Other value) { this.other = value; }

    public Versions getVersions() { return versions; }
    public void setVersions(Versions value) { this.versions = value; }

    public Sprites getAnimated() { return animated; }
    public void setAnimated(Sprites value) { this.animated = value; }
}

// GenerationI.java


 class GenerationI {
    private RedBlue redBlue;
    private RedBlue yellow;

    public RedBlue getRedBlue() { return redBlue; }
    public void setRedBlue(RedBlue value) { this.redBlue = value; }

    public RedBlue getYellow() { return yellow; }
    public void setYellow(RedBlue value) { this.yellow = value; }
}

// RedBlue.java


 class RedBlue {
    private String backDefault;
    private String backGray;
    private String backTransparent;
    private String frontDefault;
    private String frontGray;
    private String frontTransparent;

    public String getBackDefault() { return backDefault; }
    public void setBackDefault(String value) { this.backDefault = value; }

    public String getBackGray() { return backGray; }
    public void setBackGray(String value) { this.backGray = value; }

    public String getBackTransparent() { return backTransparent; }
    public void setBackTransparent(String value) { this.backTransparent = value; }

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public String getFrontGray() { return frontGray; }
    public void setFrontGray(String value) { this.frontGray = value; }

    public String getFrontTransparent() { return frontTransparent; }
    public void setFrontTransparent(String value) { this.frontTransparent = value; }
}

// GenerationIi.java


 class GenerationIi {
    private Crystal crystal;
    private Gold gold;
    private Gold silver;

    public Crystal getCrystal() { return crystal; }
    public void setCrystal(Crystal value) { this.crystal = value; }

    public Gold getGold() { return gold; }
    public void setGold(Gold value) { this.gold = value; }

    public Gold getSilver() { return silver; }
    public void setSilver(Gold value) { this.silver = value; }
}

// Crystal.java


 class Crystal {
    private String backDefault;
    private String backShiny;
    private String backShinyTransparent;
    private String backTransparent;
    private String frontDefault;
    private String frontShiny;
    private String frontShinyTransparent;
    private String frontTransparent;

    public String getBackDefault() { return backDefault; }
    public void setBackDefault(String value) { this.backDefault = value; }

    public String getBackShiny() { return backShiny; }
    public void setBackShiny(String value) { this.backShiny = value; }

    public String getBackShinyTransparent() { return backShinyTransparent; }
    public void setBackShinyTransparent(String value) { this.backShinyTransparent = value; }

    public String getBackTransparent() { return backTransparent; }
    public void setBackTransparent(String value) { this.backTransparent = value; }

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public String getFrontShiny() { return frontShiny; }
    public void setFrontShiny(String value) { this.frontShiny = value; }

    public String getFrontShinyTransparent() { return frontShinyTransparent; }
    public void setFrontShinyTransparent(String value) { this.frontShinyTransparent = value; }

    public String getFrontTransparent() { return frontTransparent; }
    public void setFrontTransparent(String value) { this.frontTransparent = value; }
}

// Gold.java


 class Gold {
    private String backDefault;
    private String backShiny;
    private String frontDefault;
    private String frontShiny;
    private String frontTransparent;

    public String getBackDefault() { return backDefault; }
    public void setBackDefault(String value) { this.backDefault = value; }

    public String getBackShiny() { return backShiny; }
    public void setBackShiny(String value) { this.backShiny = value; }

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public String getFrontShiny() { return frontShiny; }
    public void setFrontShiny(String value) { this.frontShiny = value; }

    public String getFrontTransparent() { return frontTransparent; }
    public void setFrontTransparent(String value) { this.frontTransparent = value; }
}

// GenerationIii.java


 class GenerationIii {
    private Emerald emerald;
    private Gold fireredLeafgreen;
    private Gold rubySapphire;

    public Emerald getEmerald() { return emerald; }
    public void setEmerald(Emerald value) { this.emerald = value; }

    public Gold getFireredLeafgreen() { return fireredLeafgreen; }
    public void setFireredLeafgreen(Gold value) { this.fireredLeafgreen = value; }

    public Gold getRubySapphire() { return rubySapphire; }
    public void setRubySapphire(Gold value) { this.rubySapphire = value; }
}

// Emerald.java


 class Emerald {
    private String frontDefault;
    private String frontShiny;

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public String getFrontShiny() { return frontShiny; }
    public void setFrontShiny(String value) { this.frontShiny = value; }
}

// Home.java


 class Home {
    private String frontDefault;
    private Object frontFemale;
    private String frontShiny;
    private Object frontShinyFemale;

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public Object getFrontFemale() { return frontFemale; }
    public void setFrontFemale(Object value) { this.frontFemale = value; }

    public String getFrontShiny() { return frontShiny; }
    public void setFrontShiny(String value) { this.frontShiny = value; }

    public Object getFrontShinyFemale() { return frontShinyFemale; }
    public void setFrontShinyFemale(Object value) { this.frontShinyFemale = value; }
}

// GenerationVii.java


 class GenerationVii {
    private DreamWorld icons;
    private Home ultraSunUltraMoon;

    public DreamWorld getIcons() { return icons; }
    public void setIcons(DreamWorld value) { this.icons = value; }

    public Home getUltraSunUltraMoon() { return ultraSunUltraMoon; }
    public void setUltraSunUltraMoon(Home value) { this.ultraSunUltraMoon = value; }
}

// DreamWorld.java


 class DreamWorld {
    private String frontDefault;
    private Object frontFemale;

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public Object getFrontFemale() { return frontFemale; }
    public void setFrontFemale(Object value) { this.frontFemale = value; }
}

// GenerationViii.java


 class GenerationViii {
    private DreamWorld icons;

    public DreamWorld getIcons() { return icons; }
    public void setIcons(DreamWorld value) { this.icons = value; }
}

// Other.java


 class Other {
    private DreamWorld dreamWorld;
    private Home home;
    private OfficialArtwork officialArtwork;

    public DreamWorld getDreamWorld() { return dreamWorld; }
    public void setDreamWorld(DreamWorld value) { this.dreamWorld = value; }

    public Home getHome() { return home; }
    public void setHome(Home value) { this.home = value; }

    public OfficialArtwork getOfficialArtwork() { return officialArtwork; }
    public void setOfficialArtwork(OfficialArtwork value) { this.officialArtwork = value; }
}

// OfficialArtwork.java


 class OfficialArtwork {
    private String frontDefault;

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }
}

// Stat.java


// Type.java


 class Type {
    private long slot;
    private Species type;

    public long getSlot() {
        return slot;
    }

    public void setSlot(long value) {
        this.slot = value;
    }

    public Species getType() {
        return type;
    }

    public void setType(Species value) {
        this.type = value;
    }
}

