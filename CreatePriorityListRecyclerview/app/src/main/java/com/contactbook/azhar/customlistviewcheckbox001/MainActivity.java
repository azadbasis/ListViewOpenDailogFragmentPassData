package com.contactbook.azhar.customlistviewcheckbox001;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import static com.contactbook.azhar.customlistviewcheckbox001.Person.mySelectedList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    CustomAdapter customAdapter;
    ArrayList<Person> personArrayList;
    private Button submitBN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
    }

    private void findViewById() {
        submitBN = (Button) findViewById(R.id.submitBN);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        personArrayList = filter(getAllPerson());
        customAdapter = new CustomAdapter(personArrayList, this);
        recyclerView.setAdapter(customAdapter);

        submitBN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePick();
            }
        });
    }

    private ArrayList<Person> filter(ArrayList<Person> allPerson) {
        for (Person p : Person.mySelectedList) {
            boolean contains = false;
            Person personToRemove = null;
            for (Person pp : allPerson) {
                if (pp.getId().equals(p.getId())) {
                    contains = true;
                    personToRemove = pp;
                    break;
                }
            }
            if (contains)
                allPerson.remove(personToRemove);
        }
        return allPerson;
    }

    private ArrayList<Person> getAllPerson() {
        ArrayList<Person> getPersonlist = new ArrayList<>();
        Person person01 = new Person();
        String name01 = "Azhar";
        String age01 = "20years";
        String id01 = "3712367";
        person01 = new Person(name01, age01, id01);
        getPersonlist.add(person01);

        Person person02 = new Person();
        String name02 = "Anwar";
        String age02 = "23years";
        String id02 = "3717767";
        person02 = new Person(name02, age02, id02);
        getPersonlist.add(person02);

        Person person03 = new Person();
        String name03 = "Arif";
        String age03 = "33years";
        String id03 = "3714367";
        person03 = new Person(name03, age03, id03);
        getPersonlist.add(person03);
        return getPersonlist;
    }


    private void datePick() {

        final Calendar myCalendar = Calendar.getInstance();

        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                DateFormat dateFormat = new java.text.SimpleDateFormat("dd-MM-yyyy");
                Person.addToSelectedItemsList(customAdapter.getSelectedPeople());
                String dt = dateFormat.format(myCalendar.getTime());

                for (Person p : mySelectedList) {
                    p.dateTime = dt;
                    personArrayList.remove(p);
                }
                customAdapter.notifyDataSetChanged();
                startActivity(new Intent(MainActivity.this, AnotherListViewActivity.class));
            }

        };

        new DatePickerDialog(this, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();


    }
}
