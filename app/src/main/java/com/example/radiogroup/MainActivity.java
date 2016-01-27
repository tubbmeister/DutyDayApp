package com.example.radiogroup;

//import com.example.brewclock.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.RadioButton;
import android.widget.TextView;

//v 15b:  added picker  selector for sectors
// added number picker for hours and minutes
public class MainActivity extends Activity implements OnClickListener {

	public final static String EXTRA_MESSAGE = "com.example.radiogroup.MESSAGE";
	public final static String EXTRA_MESSAGE1 = "com.example.radiogroup.MESSAGE1";

	protected RadioButton WOCLyes;
	protected RadioButton WOCLno;
	protected TextView displayText;
	protected Button button1;

	protected EditText numberIn;
	protected EditText numberIn2;
	protected TextView StartFDP;
	protected TextView EndFDP;
	protected TextView MaxEndTime;
	protected TextView enterStartTime;
	protected EditText firstcolumn;
	protected TextView secondcolumn;
	protected TextView thirdcolumn, forthcolumn2, forthcolumn3;
	protected EditText forthcolumn1;
	private int tempInt, maxDayDutyMinutes, hours, mins;
	private TextView tv;
	protected int WOCLYES, x, myNum, startInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setupUI();
		// setupUI2(); // picker hours
		// setupUI3();// picker minutes
		// Connect interface elements to properties
		WOCLyes = (RadioButton) findViewById(R.id.WOCLyes);
		WOCLno = (RadioButton) findViewById(R.id.WOCLno);
		// displayText = (TextView) findViewById(R.id.textView1);
		button1 = (Button) findViewById(R.id.button1);

		// enterStartTime = (TextView) findViewById(R.id.enterStartTime);
		// MaxEndTime = (TextView) findViewById(R.id.MaxEndTime);
		firstcolumn = (EditText) findViewById(R.id.firstcolumn); // copy times
																	// to row
																	// display
		secondcolumn = (TextView) findViewById(R.id.secondcolumn);// copy times
																	// to row
																	// display
		thirdcolumn = (TextView) findViewById(R.id.thirdcolumn);
		forthcolumn1 = (EditText) findViewById(R.id.forthcolumn1);
		forthcolumn2 = (TextView) findViewById(R.id.forthcolumn2);
		forthcolumn3 = (TextView) findViewById(R.id.forthcolumn3);
		// StartFDP = (TextView) findViewById(R.id.StartFDP);
		// EndFDP = (TextView) findViewById(R.id.EndFDP);
		// Setup ClickListeners
		WOCLyes.setOnClickListener(this);
		WOCLno.setOnClickListener(this);
		button1.setOnClickListener(this);

		forthcolumn1.setOnClickListener(this);
		firstcolumn.setOnClickListener(this);
		myNum = 0;
		startInt = 0;
		maxDayDutyMinutes = 780;
		WOCLYES = 299;
		thirdcolumn.setText("" + 1); // set default start no sectors
		// firstcolumn.setText("" + 1 + ":" + "00"); // set default start no
		// sectors
		firstcolumn.requestFocus();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/** Called when the user clicks the Send button */
	public void sendMessage(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		String message = "Hello everyone";
		intent.putExtra(EXTRA_MESSAGE, message);
		 startActivity(intent);
		
	}
	public void onClick(View v) {
		// int myNum;// = 0;
		int myNum2, restartHours, restartMins;
		int maxDayDutyMinutes2;
		maxDayDutyMinutes = 780;
		String message, message2, message3, message4, testingTime;
		if (v == forthcolumn1) {
			forthcolumn1.setText("");
		}
		if (v == firstcolumn) {
			firstcolumn.setText(""); // set blank on focus
		}
		if (v == WOCLyes) {

			WOCLYES = 359; // set WOCL to 0600z - must be corrected
			// displayText.setText((String.valueOf(WOCLYES)));
			;
		}
		if (v == WOCLno) {
			WOCLYES = 299; // 0500z
			// displayText.setText((String.valueOf(WOCLYES)));
			;
		}

		if (v == button1) {
			int afinalNumber, afinalNumber2, afinalNumber3=0, afinalNumber4;
			if ((forthcolumn1.getText().toString().equals(""))) {
				forthcolumn1.setText("Enter end time!");

			}

			message3 = forthcolumn1.getText().toString();
			if (message3.length() <= 2) {
				forthcolumn1.setText("Enter 24hr time!");
				message3 = "Enter end time!";
			}
			if (message3.equals("Enter end time!")) {
				forthcolumn2.setText("Enter end time!!");
			} else {
				if (message3.length() < 4) {
					message3 = ("0" + message3);
				}
				// textView2.setText("" + message.length());
				message4 = (message3.substring(2));
				// textView2.setText("" + message2);
				// forthcolumn2.setText("" + message);
				message3 = (message3.substring(0, 2));
				// forthcolumn2.setText("" + message2);

				afinalNumber = Integer.parseInt(message3); // convert "string"
															// to
															// int
				afinalNumber2 = Integer.parseInt(message4); // convert "string"
															// to
															// int
				afinalNumber3 = ((afinalNumber * 60) + afinalNumber2);// convert
																		// to
																		// mins
				// myNum=start time in minutes
				
			}

			// forthcolumn1.setText("Shutdown+30");
			int finalNumber, finalNumber2, finalNumber3, finalNumber4;
			if ((firstcolumn.getText().toString().equals(""))) {
				firstcolumn.setText("Enter show time!");

			}

			message = firstcolumn.getText().toString();
			if (message.length() <= 2) {
				firstcolumn.setText("Enter 24hr time!");
				message = "Enter show time!";
			}
			if (message.equals("Enter show time!")) {
				secondcolumn.setText("Enter show time!!");
			} else {
				if (message.length() < 4) {
					message = ("0" + message);
				}
				// textView2.setText("" + message.length());
				message2 = (message.substring(2));
				// textView2.setText("" + message2);
				// forthcolumn2.setText("" + message);
				message = (message.substring(0, 2));
				// forthcolumn2.setText("" + message2);

				finalNumber = Integer.parseInt(message); // convert "string" to
															// int
				finalNumber2 = Integer.parseInt(message2); // convert "string"
															// to
															// int
				finalNumber3 = ((finalNumber * 60) + finalNumber2);// convert to
																	// mins
				
				myNum = finalNumber3;
				
				if (tempInt == 1) {
					maxDayDutyMinutes = 780;
				}
				if (tempInt == 2) {
					maxDayDutyMinutes = 780;
				}
				if (tempInt == 3) {
					maxDayDutyMinutes = maxDayDutyMinutes - 30;

				}
				if (tempInt == 4) {
					maxDayDutyMinutes = maxDayDutyMinutes - 60;
				}
				if (tempInt == 5) {
					maxDayDutyMinutes = maxDayDutyMinutes - 90;
				}

				// }
				x = (WOCLYES - finalNumber3);
				if (x > 0) {
					if (x > 120) {
						x = 120;
					}
					finalNumber3 = finalNumber3 - x;// corrected for wocl start
													// ie show "earlier" start
				}
				
				maxDayDutyMinutes = maxDayDutyMinutes + finalNumber3; // corrected
																		// for
				afinalNumber4 = afinalNumber3 ;// end time - start
				//afinalNumber4 = (afinalNumber3 - myNum);// end time - start
				// time=duty time
				if ((afinalNumber4 - 30) > maxDayDutyMinutes) { // convert
										// actual finish
										// time to
										// landing time
										// ie to max FDP
				forthcolumn3.setText("Exceeded Duty Length!");
				/** 
				 * If duty exceeded, launches second activity and sends actual finish 
				 * time to new activity
				 * Using a BUNDLE to pass multiple variables to new activity
				 */
				
				
				Intent intent = new Intent(this, DisplayMessageActivity.class);
				Bundle extras = new Bundle();
				extras.putString("EXTRA_USERNAME","my_username");
				extras.putInt("endtimeMinutes",afinalNumber3);
				intent.putExtras(extras);
				String transferTime;
				transferTime=forthcolumn1.getText().toString();
			//	String sendFinishTime = "Too long a day!";
			//	intent.putExtra(EXTRA_MESSAGE, transferTime);
				//Intent intent1 = new Intent(this, DisplayMessageActivity.class);
			//	intent.putExtra(EXTRA_MESSAGE1, afinalNumber3);
				 startActivity(intent);
				 //startActivity(intent1);
					} else {
					int afinalNumber5;
					afinalNumber5=(afinalNumber4- myNum);
					int x, y;
					x = afinalNumber5 / 60;
					y = afinalNumber5 % 60;
					if (y < 10) {
					forthcolumn3.setText("" + x + ":" + "0" + y);
					
					} else
					forthcolumn3.setText("" + x + ":" + y);
					if (afinalNumber5 < 660) {
					afinalNumber5 = 660;
					}
					afinalNumber3 += afinalNumber5;
					if (afinalNumber3 > 1440) {
					afinalNumber3 = (afinalNumber3 - 1440);
					}
					}
					restartHours = afinalNumber3 / 60;
					restartMins = afinalNumber3 % 60;
					if (restartHours < 10) {
					if (restartMins < 10) {
					forthcolumn2.setText("0" + restartHours + ":" + "0"
					+ restartMins);
					// secondcolumn.setText("0" + hours + ":" + "0" + mins);
					} else {
					forthcolumn2.setText("0" + restartHours + ":"
					+ restartMins);
					// secondcolumn.setText("0" + hours + ":" + mins);
					}
					} else if (restartMins < 10) {
					forthcolumn2.setText("" + restartHours + ":" + "0"
					+ restartMins);
					// secondcolumn.setText("" + hours + ":" + "0" + mins);
					}
					
					else {
					forthcolumn2.setText("" + restartHours + ":" + ""
					+ restartMins);
					
					}
				hours = maxDayDutyMinutes / 60;
				mins = maxDayDutyMinutes % 60;
				// end time
				// show earliest start time next day
				if (hours < 10) {
					if (mins < 10) {
						// tv.setText("0" + hours + ":" + "0" + mins);
						secondcolumn.setText("0" + hours + ":" + "0" + mins);
					} else {
						// tv.setText("0" + hours + ":" + mins);
						secondcolumn.setText("0" + hours + ":" + mins);
					}
				} else if (mins < 10) {
					// tv.setText("" + hours + ":" + "0" + mins);
					secondcolumn.setText("" + hours + ":" + "0" + mins);
				}

				else {
					// tv.setText("" + hours + ":" + "" + mins);
					secondcolumn.setText("" + hours + ":" + "" + mins);
				}
			}
		}
	}

	public void setupUI() {
		// tv = (TextView) findViewById(R.id.tvId);
		NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker1);

		np.setOnValueChangedListener(new OnValueChangeListener() {
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal) {
				tempInt = newVal; // manipulate selected number
				// tempInt *= 5;
				int myNum;
				int myNum2;
				// tv.setText(String.valueOf(tempInt));
				thirdcolumn.setText(String.valueOf(tempInt)); // send no.
																// sectors to
																// grid
				
			}

		});
		np.setMaxValue(5);
		np.setMinValue(1);
		np.setWrapSelectorWheel(false); // should stop wheel scrolling, but must
										// be down here...!

	}

}
