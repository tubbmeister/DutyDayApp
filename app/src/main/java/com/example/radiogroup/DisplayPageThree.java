package com.example.radiogroup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by Richard on 27/01/2016.
 */
public class DisplayPageThree extends Activity {

    protected TextView newRestartTime;
    protected CheckBox toggleButton1;
    protected TextView isChecked;
    protected TextView dutyendTimeMinutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timezone_and_wocl);
        // Get the message from the intent
        // Intent intent = getIntent();
        //   String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //  Intent intent1 = getIntent();
        //   String message1 = intent1.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        //  TextView textView = new TextView(this);
        //  textView.setTextSize(40);
        // textView.setText("Try This");
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String username_string = extras.getString("EXTRA_USERNAME");
        int messageA = extras.getInt("endtimeMinutes");


        //newRestartTime = (TextView) findViewById(R.id.newRestartTime);
        // newRestartTime.setText(username_string);
       // dutyendTimeMinutes = (TextView) findViewById(R.id.dutyendTimeMinutes);
        //dutyendTimeMinutes.setText("" + messageA);


    }
    public void openActivityMain(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MainActivity.class);
        String message = "Hello everyone";
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}