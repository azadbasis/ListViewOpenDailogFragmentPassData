package com.contactbook.azhar.customlistviewcheckbox001;

import android.view.View;

import java.util.ArrayList;

/**
 * Created by Azhar on 4/24/2017.
 */

public class Person {
    public static ArrayList<Person> mySelectedList = new ArrayList<>();

    public static void addToSelectedItemsList(ArrayList<Person> list) {
        for (Person p : list) {
            boolean contains = false;
            for (Person pp : mySelectedList) {
                if (pp.getId().equals(p.getId())) {
                    contains = true;
                    break;
                }
            }
            if(!contains)
                mySelectedList.add(p);
        }
    }

    private String name;
    private String age;
    private String id;
    private boolean isSelected;
    public int CheckBoxVisible = View.VISIBLE;
    public String dateTime = "";

    public Person(String name, String age, String id, boolean isSelected) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isSelected = isSelected;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public Person(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
