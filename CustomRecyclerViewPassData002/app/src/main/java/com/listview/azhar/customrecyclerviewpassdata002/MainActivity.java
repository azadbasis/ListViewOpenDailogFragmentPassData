package com.listview.azhar.customrecyclerviewpassdata002;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.listview.azhar.customrecyclerviewpassdata002.adapter.CustomAdapter;
import com.listview.azhar.customrecyclerviewpassdata002.data.SpaceCraftCollection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById();

    }

    private void findViewById() {
        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        CustomAdapter customAdapter = new CustomAdapter(SpaceCraftCollection.getAllSpace(),this);
        recyclerView.setAdapter(customAdapter);
    }


}
