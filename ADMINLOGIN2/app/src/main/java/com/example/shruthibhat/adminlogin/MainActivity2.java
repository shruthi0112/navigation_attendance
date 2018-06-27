package com.example.shruthibhat.adminlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    EditText etID,etPwd;
    Button btnfor,btnreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etID=(EditText)findViewById(R.id.etid);
        etPwd=(EditText)findViewById(R.id.etpwd);
        btnfor=(Button)findViewById(R.id.tv1);
        btnreg=(Button)findViewById(R.id.btn1);

    }

    public void clickonregister(View view) {

        Intent intent=new Intent(MainActivity2.this,Login.class);
        startActivity(intent);
    }

    public void clickonlogin(View view) {
        Intent intent=new Intent(MainActivity2.this,welcome.class);
        startActivity(intent);
    }
}
