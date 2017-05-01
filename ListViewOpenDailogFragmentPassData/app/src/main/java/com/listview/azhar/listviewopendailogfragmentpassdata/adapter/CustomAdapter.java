package com.listview.azhar.listviewopendailogfragmentpassdata.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.listview.azhar.listviewopendailogfragmentpassdata.R;
import com.listview.azhar.listviewopendailogfragmentpassdata.SpaceCraftFragment;
import com.listview.azhar.listviewopendailogfragmentpassdata.data.SpaceCraft;

import java.util.ArrayList;

/**
 * Created by Azhar on 5/1/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<SpaceCraft> spaceCrafts;
    LayoutInflater layoutInflater;
    FragmentManager fragmentManager;

    public CustomAdapter(Context context, ArrayList<SpaceCraft> spaceCrafts,FragmentManager fragmentManager) {
        this.context = context;
        this.spaceCrafts = spaceCrafts;
        this.fragmentManager = fragmentManager;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return spaceCrafts.size();
    }

    @Override
    public Object getItem(int position) {
        return spaceCrafts.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view == null){
            view = layoutInflater.inflate(R.layout.model,viewGroup,false);
        }
        TextView nameText = (TextView)view.findViewById(R.id.nameTxt);
        ImageView imageView = (ImageView)view.findViewById(R.id.spacecraftImage);

        final String name = spaceCrafts.get(position).getName();
        final int image = spaceCrafts.get(position).getImage();


        nameText.setText(name);
        imageView.setImageResource(image);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         passDataOpenDetailFragment(name,image);
            }
        });
        return view;
    }

    private void passDataOpenDetailFragment(String name,int image){

        Bundle bundle = new Bundle();
        bundle.putString("NAME",name);
        bundle.putInt("IMAGE",image);
        SpaceCraftFragment spaceCraftFragment = new SpaceCraftFragment();
        spaceCraftFragment.setArguments(bundle);

        spaceCraftFragment.show(fragmentManager,"DATA");

    }
}
