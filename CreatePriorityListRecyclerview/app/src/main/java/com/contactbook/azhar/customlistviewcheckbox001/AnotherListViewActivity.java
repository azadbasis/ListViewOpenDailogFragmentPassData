package com.contactbook.azhar.customlistviewcheckbox001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AnotherListViewActivity extends AppCompatActivity {

    RecyclerView newRecyclerView;
    CustomAdapter customAdapter;
    ArrayList<Person> personArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_list_view);
        findViewById();
    }

    private void findViewById() {
        newRecyclerView = (RecyclerView)findViewById(R.id.newRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        newRecyclerView.setLayoutManager(layoutManager);
        newRecyclerView.setHasFixedSize(true);
        personArrayList = Person.mySelectedList;


      /*  CheckBox checkBox = (CheckBox)findViewById(R.id.checkbox);
        checkBox.setVisibility(View.GONE);*/
        customAdapter = new CustomAdapter(personArrayList,this);
      //  personArrayList = customAdapter.getSelectedPeople();
        newRecyclerView.setAdapter(customAdapter);
    }
}
