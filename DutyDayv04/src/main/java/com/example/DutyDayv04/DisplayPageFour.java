package com.example.DutyDayv04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Richard on 01/02/2016.
 */
public class DisplayPageFour extends Activity {

    protected TextView newRestartTime;
    protected CheckBox toggleButton1;
    protected TextView isChecked, thirdcolumn,firstcolumn;
    protected TextView dutyendTimeMinutes;
    protected EditText editText2;
    protected EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String messenger,messenger1;
        setContentView(R.layout.dutytimecalculationpage);
        firstcolumn = (TextView) findViewById(R.id.firstcolumn);
        thirdcolumn = (TextView) findViewById(R.id.thirdcolumn);
        Bundle extras = getIntent().getExtras();
        messenger = extras.getString("EXTRA_MESSAGE");
        messenger1 = extras.getString("EXTRA_MESSAGE1");
        firstcolumn.setText(messenger);
        thirdcolumn.setText(messenger1);
        // Get the message from the intent
        // Intent intent = getIntent();
        //   String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //  Intent intent1 = getIntent();
        //   String message1 = intent1.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        //  TextView textView = new TextView(this);
        //  textView.setTextSize(40);
        // textView.setText("Try This");
       // Intent intent = getIntent();
      //  Bundle extras = intent.getExtras();
       // String username_string = extras.getString("EXTRA_USERNAME");
        //int messageA = extras.getInt("endtimeMinutes");


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
        firstcolumn.setText(message);

    }
    public void HandleClick(View arg0) {
        Button btn = (Button)arg0;
        EditText timezone =(EditText) findViewById(R.id.editText2);
        EditText timezone1 =(EditText) findViewById(R.id.editText);
        TextView tv = (TextView) findViewById(R.id.textview1);
        TextView tv1 = (TextView) findViewById(R.id.textView8);
        // Integer.parseInt(myEditText.getText().toString())
        // String wocl = Integer.parseInt(editText2.getText().toString());
        // String timezone=firstcolumn.getText().toString();
        // message = firstcolumn.getText().toString();
//convert integer to string for display
        String WOCL = (timezone.getText().toString());
        String WOCL1 = (timezone1.getText().toString());
        tv.setText("You pressed " + WOCL);
        tv1.setText("You pressed " + WOCL1);


        // tv.setText(WOCL);
        //detects button selection  tv.setText("You pressed " + btn.getText());
    }
    public void openPageFive(View view) {
        // Do something in response to button
        EditText timezone = (EditText) findViewById(R.id.editText);
        EditText timezone1 = (EditText) findViewById(R.id.editText2);
        TextView tv = (TextView) findViewById(R.id.textview1);
        TextView tv1 = (TextView) findViewById(R.id.textView8);
        // Integer.parseInt(myEditText.getText().toString())
        // String wocl = Integer.parseInt(editText2.getText().toString());
        // String timezone=firstcolumn.getText().toString();
        // message = firstcolumn.getText().toString();
//convert integer to string for display
       // String WOCL = (timezone.getText().toString());
     //   String WOCL1 = (timezone1.getText().toString());
      //  tv.setText("You pressed " + WOCL);
      //  tv1.setText("You pressed " + WOCL1);

        Intent intent = new Intent(this, DateAndTimeSelectorjava.class);
        //String message = "hello Bruce";
       // intent.putExtra("EXTRA_MESSAGE", numberSender); //sends result from WOCL to page 4
       // intent.putExtra("EXTRA_MESSAGE1", numberSender1); //sends second result
        startActivity(intent);
    }
}