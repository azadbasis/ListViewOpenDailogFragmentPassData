package com.listview.azhar.customlistviewopenactivitypassdata001;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {


    TextView nameTxtDetail;
    ImageView spacecraftImageDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
findViewById();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void findViewById() {
        nameTxtDetail = (TextView) findViewById(R.id.nameTxtDetail);
        spacecraftImageDetail = (ImageView) findViewById(R.id.spacecraftImageDetail);
        Intent intent = this.getIntent();
        String name = intent.getExtras().getString("name"); 
        int image = intent.getExtras().getInt("image");

        nameTxtDetail.setText(name);
        spacecraftImageDetail.setImageResource(image);
    }

}
