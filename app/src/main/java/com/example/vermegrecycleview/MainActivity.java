package com.example.vermegrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc;
    List<Contact> ListData = new ArrayList<>();
    ContactAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc=findViewById(R.id.recycleContact);
        adapter=new ContactAdapter(MainActivity.this,ListData);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setAdapter(adapter);
        getData();
    }
    void getData(){
        ListData.add(new Contact("neyra","marzouk","52636354",R.mipmap.download));
        ListData.add(new Contact("iheb","farhat","52636354",R.mipmap.download));
        ListData.add(new Contact("siwar","dandana","52636354",R.mipmap.download));
        ListData.add(new Contact("omar","tajine","52636354",R.mipmap.download));
        adapter.notifyDataSetChanged();
    }
}