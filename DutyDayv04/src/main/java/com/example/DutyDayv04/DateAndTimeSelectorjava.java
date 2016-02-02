package com.example.DutyDayv04;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by Richard on 02/02/2016.
 */
public class DateAndTimeSelectorjava extends Activity {

    protected TimePicker timePicker;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dateandtimeselector);
         timePicker = (TimePicker) findViewById(R.id.timePicker);
       // TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
        //TimePicker timePicker = new TimePicker;
        timePicker.setIs24HourView(true);
      //  timePicker.setCurrentHour(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));

    }
}
