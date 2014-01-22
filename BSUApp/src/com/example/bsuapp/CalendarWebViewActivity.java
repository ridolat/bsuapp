package com.example.bsuapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

/**
 * Calendar Web View Activity for BSU APP 
 * @author ridwan olatilewa
 *
 */
public class CalendarWebViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calendar_view);
		
		
		WebView myWebView = (WebView) findViewById(R.id.webview);
		myWebView.getSettings().setJavaScriptEnabled(true);
		myWebView.loadUrl("https://www.google.com/calendar/embed?src=emk8jt3fg0u0h5oqin1psm4agk%40group.calendar.google.com&ctz=America/New_York ");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
