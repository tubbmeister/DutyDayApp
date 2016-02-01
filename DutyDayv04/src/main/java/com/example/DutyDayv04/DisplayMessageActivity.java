package com.example.DutyDayv04;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.ToggleButton;

public class DisplayMessageActivity extends Activity {
	
	protected TextView newRestartTime;
	protected CheckBox toggleButton1;
	protected TextView isChecked;
	protected TextView dutyendTimeMinutes;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
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
		
		
		
		
		
	    newRestartTime = (TextView) findViewById(R.id.newRestartTime);
	    newRestartTime.setText(username_string);
	    dutyendTimeMinutes = (TextView) findViewById(R.id.dutyendTimeMinutes);
	    dutyendTimeMinutes.setText(""+messageA);
		
		

	}

	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	public void onCheckboxClicked(View view) {
	    // Do something in response to button
		
		//String message = "Agreed";
		//isChecked = (TextView) findViewById(R.id.isChecked);
		toggleButton1 = (CheckBox) findViewById(R.id.toggleButton1);
		//toggleButton1.setText("Yes");
		if (toggleButton1.getText().toString().equals("No!"))
		{
		//	isChecked.setText("");
			toggleButton1.setText("Yes!");
			newRestartTime.setText("+ 2 hours");
			}
			else
				{
			//	isChecked.setText(message);
				toggleButton1.setText("No!");
				newRestartTime.setText("+ 4 hours");
				}
		}
	public void onToggleClicked(View view) {
		isChecked = (TextView) findViewById(R.id.isChecked);
	    // Is the toggle on?
	    boolean on = ((ToggleButton) view).isChecked();
	    
	    if (on) {
	    	isChecked.setText("Agreed");
			newRestartTime.setText("+ 2 hours");
	    } else {
	    	isChecked.setText(""); 
			newRestartTime.setText("+ 4 hours");
	    }
	} 
		
	} 

