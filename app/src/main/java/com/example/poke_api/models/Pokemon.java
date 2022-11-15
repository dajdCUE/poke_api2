package com.example.poke_api.models;

public class Pokemon {

    //Generamos atributos
    private String name;
    private String url;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId(){
        String [] pokeUrl = getUrl().split("/");
        return (pokeUrl[pokeUrl.length-1]);
    }
}
