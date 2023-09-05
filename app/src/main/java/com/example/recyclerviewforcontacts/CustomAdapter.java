package com.example.recyclerviewforcontacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>  {



    int photo[];
    String name[];
    String cont[];

    public CustomAdapter(int[] photo, String[] name, String[] cont) {

        this.photo=photo;
        this.name=name;
        this.cont=cont;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.recyler_row_item,parent,
                        false);


        return new ViewHolder(view);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img2.setImageResource(photo[position]);
        holder.txtname.setText("" + name[position]);
        holder.txtCont.setText(""  +cont[position]);


    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img2;
        TextView txtname;
        TextView txtCont;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img2=itemView.findViewById(R.id.img1);
            txtname=itemView.findViewById(R.id.txt1);
            txtCont=itemView.findViewById(R.id.txt2);
        }
    }
}
