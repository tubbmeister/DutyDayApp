package com.example.radiogroup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.EditText;

/**
 * Created by Richard on 27/01/2016.
 */
public class DisplayPageThree extends Activity  {

    protected TextView newRestartTime;
    protected CheckBox toggleButton1;
    protected TextView isChecked;
    protected TextView dutyendTimeMinutes;
    protected EditText editText2;
    protected EditText editText;

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
        Button btn = (Button)arg0;
        EditText timezone =(EditText) findViewById(R.id.editText2);
        TextView tv = (TextView) findViewById(R.id.textview1);
        // Integer.parseInt(myEditText.getText().toString())
       // String wocl = Integer.parseInt(editText2.getText().toString());
       // String timezone=firstcolumn.getText().toString();
               // message = firstcolumn.getText().toString();
//convert integer to string for display
        String WOCL = (editText2.getText().toString());
        //tv.setText("You pressed " + WOCL);
        tv.setText(WOCL);
        //detects button selection  tv.setText("You pressed " + btn.getText());
    }
}