package com.example.poke_api.ui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.poke_api.R;
import com.example.poke_api.activities.pokemonPage;
import com.example.poke_api.models.Pokemon;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder>{

    //Variables locales
    private final List<Pokemon> pokemonList;
    private Context context;

    public PokemonAdapter(List<Pokemon> pokemonList, Context context) {
        this.pokemonList = pokemonList;
        this.context = context;
    }


    @NonNull
    @Override
    public PokemonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creamos vista que se encarge de inflar el item en el ViewHolder
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonAdapter.ViewHolder holder, int position) {
        holder.bind(pokemonList.get(position));
    }

    @Override
    public int getItemCount() {
        return pokemonList.size(); //Devolver elementos de la lista
    }

    // Clase ViewHolder implementada de forma interna al Adapter
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Objetos de referencia para las vistas

        TextView tvName, tvId, tvUrl;
        ImageView ivPokemon;
        // Asociar objetos a vistas a través del constructor de ViewHolder
        ViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvId = itemView.findViewById(R.id.tvId);
            tvUrl = itemView.findViewById(R.id.tvUrl);
            ivPokemon = itemView.findViewById(R.id.ivPokemon);
        }

        // Función BIND para rellenar las vistas con la info de su item correspondiente
        void bind (@NonNull final Pokemon pokemon) {

            //Poblamos las vistas con la información recibida de Retrofit
            tvName.setText(pokemon.getName());
            tvId.setText(pokemon.getId());
            tvUrl.setText(pokemon.getUrl());


            String urlSprite = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/"+pokemon.getId()+".gif";

// Insertamos imagen desde URL con Glide en el ImageView
            Glide.with(context)
                    .load(urlSprite)
                    .centerCrop()
                    .error(R.drawable.pokeball_background)
                    .fitCenter()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(ivPokemon);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(context, pokemonPage.class);
                    i.putExtra("id", pokemon.getId());
                    context.startActivity(i);
                }
            });

        }

    }
}
