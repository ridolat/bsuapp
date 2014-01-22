package com.example.bsuapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Main Activity for BSU App
 * @author ridwan olatilewa
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button calendarButton = (Button)findViewById(R.id.calendar_button);
		calendarButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, CalendarWebViewActivity.class);
				startActivity(intent);
			}
			
		});
		
		Button directoryButton = (Button)findViewById(R.id.eboard_directory_button);
		directoryButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, EboardDirectoryActivity.class);
				startActivity(intent);

			}
			
		});
		
		Button whatsnewBsu= (Button)findViewById(R.id.new_with_bsu_button);
		whatsnewBsu.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, WhatsNewBsu.class);
				startActivity(intent);
				
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
