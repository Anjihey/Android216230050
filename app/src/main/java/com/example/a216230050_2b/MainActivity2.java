package com.example.a216230050_2b;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    LinearLayout li1, li2, li3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);

        final ArrayList<String> list1 = new ArrayList<>();
        list1.add("SKT");
        list1.add("KT");
        list1.add("U+");


        ArrayAdapter spinnerAdapter;
        spinnerAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, list1);
        spinner2.setAdapter(spinnerAdapter);

        spinnerAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, list1);
        spinner3.setAdapter(spinnerAdapter);

        li1 = (LinearLayout)findViewById(R.id.a2page1);
        li2 = (LinearLayout)findViewById(R.id.l2);
        li3 = (LinearLayout)findViewById(R.id.l3);

        Button b1 = (Button)findViewById(R.id.button11);
        Button b2 = (Button)findViewById(R.id.button9);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        li2.setVisibility(View.GONE);
        li3.setVisibility(View.GONE);
    }
    public void BeforeScreen (View v){
        Toast toast= Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT);
        toast.show();

        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }
    public void NextScreen2 (View v){
        Intent i = new Intent( this, MainActivity3.class);
        startActivity(i);
    }
    public void BeforScreen2 (View v){
        Intent i = new Intent( this, MainActivity2.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button11:
                li1.setVisibility(v.GONE);
                li2.setVisibility(v.VISIBLE);
                li3.setVisibility(v.GONE);
                break;
            case R.id.button9:
                li1.setVisibility(v.GONE);
                li2.setVisibility(v.GONE);
                li3.setVisibility(v.VISIBLE);
                break;
        }
    }
}
