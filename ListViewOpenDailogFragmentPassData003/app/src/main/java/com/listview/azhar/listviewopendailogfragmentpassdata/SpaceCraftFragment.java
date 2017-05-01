package com.listview.azhar.listviewopendailogfragmentpassdata;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Azhar on 5/1/2017.
 */

public class SpaceCraftFragment extends DialogFragment {


    TextView nameTextDetail;
    ImageView imageViewDetail;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.spacecraftdetail,container,false);

        nameTextDetail = (TextView)view.findViewById(R.id.nameTextDetail);
        imageViewDetail = (ImageView)view.findViewById(R.id.spaceCraftImageDetail);
        String name = this.getArguments().getString("NAME");
        int image = this.getArguments().getInt("IMAGE");
        nameTextDetail.setText(name);
        imageViewDetail.setImageResource(image);
        return view;
    }
}
