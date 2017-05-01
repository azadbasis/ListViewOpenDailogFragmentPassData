package com.listview.azhar.customrecyclerviewpassdata002;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    private TextView nametExt;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findViewById();

    }

    private void findViewById() {

        nametExt =(TextView)findViewById(R.id.nameTxtDetail);
        image =(ImageView)findViewById(R.id.spacecraftImageDetail);

        String name = this.getIntent().getExtras().getString("NAME");
        int images = this.getIntent().getExtras().getInt("IMAGE");

        nametExt.setText(name);
        image.setImageResource(images);


    }



}
