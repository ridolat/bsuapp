package com.example.bsuapp;

import java.io.IOException;
import java.io.InputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Social media Activity for social media links BSU App
 * @author ridwan olatilewa
 *
 */

public class WhatsNewBsu extends Activity {
	
	String url = "http://theblackstudentunion1968.weebly.com/general-body-member-blog.html";
	ProgressDialog mProgressDialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.whatsnewbsu);
		
		setContentView(R.layout.whatsnewbsu);
		TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
		tabHost.setup();

		TabSpec spec1=tabHost.newTabSpec("Tab 1");
		spec1.setContent(R.id.tab1);
		spec1.setIndicator("News on Campus");
		

		TabSpec spec2=tabHost.newTabSpec("Tab 2");
		spec2.setIndicator("Upcoming GB's");
		spec2.setContent(R.id.tab2);
		

		TabSpec spec3=tabHost.newTabSpec("Tab 3");
		spec3.setIndicator("Social Media");
		spec3.setContent(R.id.tab3);

		tabHost.addTab(spec1);
		tabHost.addTab(spec2);
		tabHost.addTab(spec3);

		
		Button updateButton = (Button)findViewById(R.id.update_button1);
		updateButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new UpdateInfo().execute();
				
			}
		});
		
		Button updateButton2 = (Button)findViewById(R.id.update_button2);
		updateButton2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new UpdateInfo().execute();
				
			}
		});
		
		Button updateButton3 = (Button)findViewById(R.id.update_button3);
		updateButton3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new UpdateInfo().execute();
				
			}
		});
		
		ImageButton facebookButton = (ImageButton)findViewById(R.id.facebook_button);
		facebookButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/bsupromobot"));
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Add us on Facebook!", Toast.LENGTH_SHORT).show();
			}
		});
		
		ImageButton twitterButton = (ImageButton)findViewById(R.id.twitter_button);
		twitterButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/BSU1968"));
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Follow Us On Twitter!", Toast.LENGTH_SHORT).show();
			}
				
		});
		
		ImageButton instagramButton = (ImageButton)findViewById(R.id.instagram_button);
		instagramButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/bsu1968"));
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Follow Us On Instagram!", Toast.LENGTH_SHORT).show();
				
			}
		});
		
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	// GBFlyer AsyncTask
    private class UpdateInfo extends AsyncTask<Void, Void, Void> {
        Bitmap bitmap;
        String news;
 
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(WhatsNewBsu.this, AlertDialog.THEME_HOLO_DARK);
            mProgressDialog.setTitle("Black Student Union");
            mProgressDialog.setMessage("Updating...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }
 
        @Override
        protected Void doInBackground(Void... params) {
 
            try {
            	
            	
                // Connect to the web site
            	Document doc = Jsoup.connect("http://theblackstudentunion1968.weebly.com/general-body-member-blog.html").get();
    			
            	//For image
            	Element element = doc.select("div.blog-content img").first();
                // Locate the src attribute
    			String src = element.absUrl("src");
                // Download image from URL
                InputStream input = new java.net.URL(src).openStream();
                // Decode Bitmap
                bitmap = BitmapFactory.decodeStream(input);
                
                //For News
                Document doc2 = Jsoup.connect("http://theblackstudentunion1968.weebly.com/general-body-member-blog.html").get();
    			Element element2 = doc2.select("div.blog-sidebar-separator h2[class=blog-author-title]").first();
                news = element2.text();
 
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
 
        @Override
        protected void onPostExecute(Void result) {
            // Set downloaded image into ImageView
            ImageView logoimg = (ImageView) findViewById(R.id.gbFlyer);
            logoimg.setImageBitmap(bitmap);
            
            //Set news to TextView
            TextView newsTextToPlace = (TextView)findViewById(R.id.newsText);
        	newsTextToPlace.setText(news);
        	newsTextToPlace.setLineSpacing(1, 2);
            mProgressDialog.dismiss();
        }
    }
    
    



}



