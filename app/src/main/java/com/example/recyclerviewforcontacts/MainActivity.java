package com.example.recyclerviewforcontacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    int photo[]={R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo};
    String name[]={"Affan","Mutlib","Abujar","Husen","Affan","Mutlib","Abujar","Husen","Affan","Mutlib","Abujar","Husen","Affan","Mutlib","Abujar","Husen"};
    String cont[]={"567657567","56765765","45645654","567657","567657567","56765765","45645654","567657","567657567","56765765","45645654","567657","567657567","56765765","45645654","567657"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter adapter=new CustomAdapter(photo,name,cont);
        RecyclerView recyclerView=findViewById(R.id.recycler1);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        //recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));


    }
}