package com.example.calender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    CalendarView cv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       cv=findViewById(R.id.cv);
       tv=findViewById(R.id.tv);


        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
           public void onSelectedDayChange(@NonNull CalendarView view, int i, int i1, int i2) {
              String d=i+"/"+i1+"/"+i2;
             tv.setText(d);
           }
       });

    }
}