package com.listview.azhar.customrecyclerviewpassdata002.data;

import com.listview.azhar.customrecyclerviewpassdata002.R;

import java.util.ArrayList;

/**
 * Created by Azhar on 4/28/2017.
 */

public class SpaceCraftCollection {

    public static ArrayList<SpaceCraft> getAllSpace(){

        ArrayList<SpaceCraft> spaceCrafts = new ArrayList<>();


        SpaceCraft spaceCraft1 = new SpaceCraft();
        spaceCraft1.setName("Azhar");
        spaceCraft1.setImage(R.drawable.i1);
        spaceCrafts.add(spaceCraft1);

        SpaceCraft spaceCraft2 = new SpaceCraft();
        spaceCraft2.setName("Azhar");
        spaceCraft2.setImage(R.drawable.i2);
        spaceCrafts.add(spaceCraft2);

        SpaceCraft spaceCraft3 = new SpaceCraft();
        spaceCraft3.setName("Azhar");
        spaceCraft3.setImage(R.drawable.i3);
        spaceCrafts.add(spaceCraft3);

        SpaceCraft spaceCraft4 = new SpaceCraft();
        spaceCraft4.setName("Azhar");
        spaceCraft4.setImage(R.drawable.i4);
        spaceCrafts.add(spaceCraft4);

        SpaceCraft spaceCraft5 = new SpaceCraft();
        spaceCraft5.setName("Azhar");
        spaceCraft5.setImage(R.drawable.i5);
        spaceCrafts.add(spaceCraft5);

        SpaceCraft spaceCraft6 = new SpaceCraft();
        spaceCraft6.setName("Azhar");
        spaceCraft6.setImage(R.drawable.i6);
        spaceCrafts.add(spaceCraft6);


        return spaceCrafts;

    }
}
