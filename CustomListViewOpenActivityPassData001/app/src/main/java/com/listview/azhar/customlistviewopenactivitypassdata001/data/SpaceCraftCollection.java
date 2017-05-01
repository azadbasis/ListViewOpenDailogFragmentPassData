package com.listview.azhar.customlistviewopenactivitypassdata001.data;

import com.listview.azhar.customlistviewopenactivitypassdata001.R;

import java.util.ArrayList;

/**
 * Created by Azhar on 4/28/2017.
 */

public class SpaceCraftCollection {

    public static ArrayList<SpaceCraft> getSpaceeCraft(){

        ArrayList<SpaceCraft> spaceCraftArrayList = new ArrayList<>();

        SpaceCraft   spaceCraft = new SpaceCraft();
        spaceCraft.setName("ANWAR");
        spaceCraft.setImage(R.drawable.i1);
        spaceCraftArrayList.add(spaceCraft);

        SpaceCraft   spaceCraft1 = new SpaceCraft();
        spaceCraft1.setName("AZHAR");
        spaceCraft1.setImage(R.drawable.i2);
        spaceCraftArrayList.add(spaceCraft1);

        SpaceCraft   spaceCraft2 = new SpaceCraft();
        spaceCraft2.setName("ANIS");
        spaceCraft2.setImage(R.drawable.i3);
        spaceCraftArrayList.add(spaceCraft2);

        SpaceCraft   spaceCraft3 = new SpaceCraft();
        spaceCraft3.setName("AFRUZA");
        spaceCraft3.setImage(R.drawable.i4);
        spaceCraftArrayList.add(spaceCraft3);

        SpaceCraft   spaceCraft4 = new SpaceCraft();
        spaceCraft4.setName("ALIA");
        spaceCraft4.setImage(R.drawable.i5);
        spaceCraftArrayList.add(spaceCraft4);

        SpaceCraft   spaceCraft5 = new SpaceCraft();
        spaceCraft5.setName("AYESHA");
        spaceCraft5.setImage(R.drawable.i6);
        spaceCraftArrayList.add(spaceCraft5);

        return spaceCraftArrayList;
    }
}
