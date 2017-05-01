package com.listview.azhar.customlistviewopenactivitypassdata001.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.listview.azhar.customlistviewopenactivitypassdata001.DetailActivity;
import com.listview.azhar.customlistviewopenactivitypassdata001.R;
import com.listview.azhar.customlistviewopenactivitypassdata001.data.SpaceCraft;

import java.util.ArrayList;

/**
 * Created by Azhar on 4/28/2017.
 */

public class CustomAdapter extends BaseAdapter {

    ArrayList<SpaceCraft> spaceCraftArrayList;
    Context context;
    LayoutInflater layoutInflater;

    public CustomAdapter(ArrayList<SpaceCraft> spaceCraftArrayList, Context context) {
        this.spaceCraftArrayList = spaceCraftArrayList;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return spaceCraftArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return spaceCraftArrayList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.model,parent,false);
        }
        TextView nameText = (TextView)convertView.findViewById(R.id.nameTxt);
        ImageView spacecraftImage = (ImageView)convertView.findViewById(R.id.spacecraftImage);

        final String name = spaceCraftArrayList.get(position).getName();
        final int image = spaceCraftArrayList.get(position).getImage();

        nameText.setText(name);
        spacecraftImage.setImageResource(image);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           openDetailActivityPassData(name,image);
            }
        });
        return convertView;
    }

    private void openDetailActivityPassData(String name, int image){

        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("image",image);
        context.startActivity(intent);

    }
}
