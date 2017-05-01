package com.listview.azhar.listviewopendailogfragmentpassdata.data;

import com.listview.azhar.listviewopendailogfragmentpassdata.R;

import java.util.ArrayList;

/**
 * Created by Azhar on 5/1/2017.
 */

public class SpaceCraftCollections {


    public static ArrayList<SpaceCraft> getAllData(){
        ArrayList<SpaceCraft> craftArrayList = new ArrayList<>();

        SpaceCraft spaceCraft1 = new SpaceCraft();
        spaceCraft1.setName("AZHAR");
        spaceCraft1.setImage(R.drawable.i1);
        craftArrayList.add(spaceCraft1);

        SpaceCraft spaceCraft2 = new SpaceCraft();
        spaceCraft2.setName("Anwar");
        spaceCraft2.setImage(R.drawable.i2);
        craftArrayList.add(spaceCraft2);

        SpaceCraft spaceCraft3 = new SpaceCraft();
        spaceCraft3.setName("ANIS");
        spaceCraft3.setImage(R.drawable.i3);
        craftArrayList.add(spaceCraft3);

        SpaceCraft spaceCraft4 = new SpaceCraft();
        spaceCraft4.setName("AFRUZA");
        spaceCraft4.setImage(R.drawable.i4);
        craftArrayList.add(spaceCraft4);

        SpaceCraft spaceCraft5 = new SpaceCraft();
        spaceCraft5.setName("ALIA");
        spaceCraft5.setImage(R.drawable.i5);
        craftArrayList.add(spaceCraft5);

        SpaceCraft spaceCraft6 = new SpaceCraft();
        spaceCraft6.setName("ayesha");
        spaceCraft6.setImage(R.drawable.i6);
        craftArrayList.add(spaceCraft6);


        return craftArrayList;
    }
}
