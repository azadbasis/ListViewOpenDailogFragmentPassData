package com.listview.azhar.customrecyclerviewpassdata002.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.listview.azhar.customrecyclerviewpassdata002.DetailActivity;
import com.listview.azhar.customrecyclerviewpassdata002.R;
import com.listview.azhar.customrecyclerviewpassdata002.data.SpaceCraft;

import java.util.ArrayList;

/**
 * Created by Azhar on 4/28/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    ArrayList<SpaceCraft> spaceCraftArrayList;

    public CustomAdapter(ArrayList<SpaceCraft> spaceCraftArrayList, Context context) {
        this.spaceCraftArrayList = spaceCraftArrayList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
       SpaceCraft spaceCraft = spaceCraftArrayList.get(position);
        final String name = spaceCraft.getName();
        final int image = spaceCraft.getImage();
        holder.nameTxt.setText(name);
        holder.spacecraftImage.setImageResource(image);

        holder.setOnClickListener(new ItemClick() {
            @Override
            public void onItemClick(int position) {
             openDetailActivity(name,image);
            }
        });


    }

    @Override
    public int getItemCount() {
        return spaceCraftArrayList.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ItemClick itemClick;
        TextView nameTxt;
        ImageView spacecraftImage;

        public MyViewHolder(View view) {
            super(view);
            nameTxt = (TextView)view.findViewById(R.id.nameTxt);
            spacecraftImage = (ImageView)view.findViewById(R.id.spacecraftImage);
            view.setOnClickListener(this);

        }
     public void setOnClickListener(ItemClick itemClick){
this.itemClick = itemClick;
}

        @Override
        public void onClick(View view) {
       this.itemClick.onItemClick(this.getLayoutPosition());
        }
    }

    private void openDetailActivity(String name, int image)
    {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("NAME",name);
        intent.putExtra("IMAGE",image);
        context.startActivity(intent);
    }
}
