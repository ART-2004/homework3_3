package com.example.hw3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SushiAdapter adapter;
    private ArrayList<Sushi> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        fillList();
        setAdapter();
    }

    private void findViews(){
        recyclerView = findViewById(R.id.recycler_view_sushi);
    }

    private void fillList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Sushi("Калифорния", "ингридиенты", R.drawable.first));
        arrayList.add(new Sushi("Нигири", "ингридиенты", R.drawable.second));
        arrayList.add(new Sushi("Сашими", "ингридиенты", R.drawable.third));
        arrayList.add(new Sushi("Темаки", "ингридиенты", R.drawable.foursh));
        arrayList.add(new Sushi("Маки", "ингридиенты", R.drawable.fifth));
    }

    private void setAdapter(){
        adapter =new SushiAdapter(arrayList);
        recyclerView.setAdapter(adapter);
    }
}