package com.example.DutyDayv04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.EditText;

/**
 * Created by Richard on 27/01/2016.
 */
public class DisplayPageThree extends Activity {

    protected TextView newRestartTime;
    protected CheckBox toggleButton1;
    protected TextView isChecked;
    protected TextView dutyendTimeMinutes;
    protected EditText editText2;
    protected EditText editText;
    protected Button button2;
    protected String numberSender,numberSender1; // make this string universally available
    public final static String EXTRA_MESSAGE = "com.example.radiogroup.MESSAGE";

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

    public void HandleClick(View arg0) {
        Button btn = (Button) arg0;
        EditText timezone = (EditText) findViewById(R.id.editText);
        EditText timezone1 = (EditText) findViewById(R.id.editText2);
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
        numberSender=WOCL;
        numberSender1=WOCL1;
        //String message1= tv1;

        // tv.setText(WOCL);
        //detects button selection  tv.setText("You pressed " + btn.getText());
    }

    public void openPageFour(View view) {
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
        String WOCL = (timezone.getText().toString());
        String WOCL1 = (timezone1.getText().toString());
        tv.setText("You pressed " + WOCL);
        tv1.setText("You pressed " + WOCL1);
        numberSender=WOCL;
        numberSender1=WOCL1;
        Intent intent = new Intent(this, DisplayPageFour.class);
        //String message = "hello Bruce";
        intent.putExtra("EXTRA_MESSAGE", numberSender); //sends result from WOCL to page 4
        intent.putExtra("EXTRA_MESSAGE1", numberSender1); //sends second result
        startActivity(intent);
    }

    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayPageFour.class);
        String message = "Hello everyone";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}