package com.example.shruthibhat.adminlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void gotonext(View view) {
        Intent intent=new Intent(welcome.this,MainActivity3.class);
        startActivity(intent);
    }
}
