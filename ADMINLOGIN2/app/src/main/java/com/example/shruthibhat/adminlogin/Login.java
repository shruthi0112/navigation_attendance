package com.example.shruthibhat.adminlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText etName,etEmail,etBranch,etPass,etConfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etName=(EditText)findViewById(R.id.etname);
        etEmail=(EditText)findViewById(R.id.etemail);
        etBranch=(EditText)findViewById(R.id.etbranch);
        etPass=(EditText)findViewById(R.id.etpwd);
        etConfirm=(EditText)findViewById(R.id.etconfirm);
    }

    public void gotoprofile(View view) {
        Intent intent=new Intent(Login.this,MainActivity2.class);
        startActivity(intent);
    }
}
