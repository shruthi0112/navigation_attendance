package com.example.shruthibhat.adminlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Spinner myspinner = (Spinner) findViewById(R.id.spinner1);
        Spinner myspin = (Spinner) findViewById(R.id.spinner2);
        Spinner spin = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity3.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.year));
        ArrayAdapter<String> myAdapt = new ArrayAdapter<String>(MainActivity3.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.div));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity3.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.sem));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myAdapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);
        myspin.setAdapter(myAdapt);
        spin.setAdapter(adapter);
    }

    public void clickOnEnter(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
        startActivity(intent);
    }
}

