package com.example.shruthibhat.adminlogin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Calender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        DatePicker datePicker;
        Context context;


            datePicker=(DatePicker)findViewById(R.id.dpcalender);
            Calendar calender=Calendar.getInstance();
            datePicker.init(calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                   Toast.makeText(getApplicationContext(), datePicker.getDayOfMonth() + "-" + (datePicker.getMonth() + 1) + "-" + datePicker.getYear(), Toast.LENGTH_SHORT).show();

                }
});
    }

   /* public void clickOnDate(View view) {

        Intent in=new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(in);
    }*/
}
