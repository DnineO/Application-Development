package com.example.grumpycat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class GrumpyCatAdapter extends RecyclerView.Adapter<GrumpyCatAdapter.CatHolder>{
    private final List<GrumpyCat> cats;

    public GrumpyCatAdapter(List<GrumpyCat> cats){
        this.cats = cats;
    }

    static class CatHolder extends RecyclerView.ViewHolder {
        public final ImageView image;
        public final TextView name;

        public CatHolder(View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.item_image);
            name = itemView.findViewById(R.id.item_name);
        }
    }

    @NonNull
    @Override
    public CatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inFlater = LayoutInflater.from(parent.getContext());

        View itemView = inFlater.inflate(R.layout.item_cat,parent,false);

        return new CatHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CatHolder holder, int position) {
        GrumpyCat grumpyCat = cats.get(position);

        Picasso.get().load(grumpyCat.getImage()).into(holder.image);

        holder.name.setText(grumpyCat.getName());
    }

    public int getItemCount(){
        return cats.size();
    }

}
