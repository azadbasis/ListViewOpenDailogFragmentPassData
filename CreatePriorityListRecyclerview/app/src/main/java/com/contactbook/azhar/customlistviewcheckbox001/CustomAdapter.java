package com.contactbook.azhar.customlistviewcheckbox001;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Azhar on 4/24/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Myholder> {


    ArrayList<Person> personArrayList;
    Context context;

    public CustomAdapter(ArrayList<Person> personArrayList, Context context) {
        this.personArrayList = personArrayList;
        this.context = context;
    }

    @Override
    public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model, parent, false);

        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(final Myholder holder, int position) {


        final Person person = personArrayList.get(position);
        holder.nameTV.setText(person.getName());
        holder.ageTV.setText(person.getAge());
        holder.idTV.setText(person.getId());
        holder.dateTV.setText(person.dateTime);
        if (person.dateTime.isEmpty())
            holder.dateTV.setVisibility(View.GONE);
        else holder.dateTV.setVisibility(View.VISIBLE);

        holder.checkBox.setChecked(person.isSelected());
        holder.checkBox.setTag(person);
        holder.checkBox.setVisibility(person.CheckBoxVisible);

        holder.checkBox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v;
                Person person01 = (Person) cb.getTag();

                person01.setSelected(cb.isChecked());
            }
        });
        /*holder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.checkBox.isChecked()){

                }
            }
        });*/
    }

    public ArrayList<Person> getSelectedPeople() {
        ArrayList<Person> ps = new ArrayList<>();
        for (Person p : personArrayList) {

            if (p.isSelected()) {
                p.setSelected(false);
                p.CheckBoxVisible = View.INVISIBLE;
                ps.add(p);
            }
        }
        return ps;
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public static class Myholder extends RecyclerView.ViewHolder {

        TextView nameTV, ageTV, idTV, dateTV;
        CheckBox checkBox;

        public Myholder(View view) {
            super(view);

            nameTV = (TextView) view.findViewById(R.id.nameTV);
            ageTV = (TextView) view.findViewById(R.id.ageTV);
            idTV = (TextView) view.findViewById(R.id.idTV);
            dateTV = (TextView) view.findViewById(R.id.dateTV);
            checkBox = (CheckBox) view.findViewById(R.id.checkbox);
        }
    }


}
