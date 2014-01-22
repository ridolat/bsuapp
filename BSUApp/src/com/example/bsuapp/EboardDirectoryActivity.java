package com.example.bsuapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Eboard Directory Activity for BSU App
 * @author ridwan olatilewa
 *
 */
public class EboardDirectoryActivity extends ListActivity {

	static final String[] POSITIONS = new String[] {"President", "Vice President", "Treasurer", "Secretary", "Political Correspondent", "Educational Coordinator", "Social–Cultural Coordinator", "Publications Coordinator", "Public Relations", "Historian", "SA Representative"};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.directory);

		setListAdapter(new ArrayAdapter<String>(this, R.layout.directory,POSITIONS));
		ListView listview = getListView();
		listview.setTextFilterEnabled(true);
		final AlertDialog.Builder builder = new AlertDialog.Builder(EboardDirectoryActivity.this);
		listview.setOnItemClickListener(new OnItemClickListener(){

			/**
			 * DIALOGS FOR EACH OF THE EBOARD POSITIONS! DO NOT EDIT. WANT TO EDIT
			 * POSITIONS, CHANGE strings.xml
			 * 
			 */
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				switch(position){
				
				/**
				 * For President
				 */
				case 0:
					builder.setMessage(R.string.president_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							//Email Functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theunionpres@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();


					break;
				
				/**
				 * For Vice President
				 */
				case 1:
					builder.setMessage(R.string.vp_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							//Email functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theunionvp@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();
					break;
					
				/**
				 * For Treasurer
				 */
				case 2:
					builder.setMessage(R.string.treasurer_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							//Email functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theuniontreas@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();
					break;
					
				/**
				 * For Secretary
				 */
				case 3:
					builder.setMessage(R.string.sec_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							//Email functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theunionsecretary@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();
					break;
					
				/**
				 * Polit Co
				 */
				case 4:
					builder.setMessage(R.string.politco_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							//Email functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theunionpolitical@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();
					break;
					
				/**
				 * Edu Co
				 */
				case 5:
					builder.setMessage(R.string.educo_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							//Email functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theunionedu@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();
					break;
					
				/**
				 * Social/Cultural Co
				 */
				case 6:
					builder.setMessage(R.string.socco_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							//Email functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theunionsocialco@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();
					break;
					
				/**
				 * Pub Co
				 */
				case 7:
					builder.setMessage(R.string.pubco_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							//Email functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theunionpub@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();
					break;

				/**
				 * PR	
				 */
				case 8:
					builder.setMessage(R.string.pr_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							//Email functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theunionpr@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();
					break;
					
				/**
				 * Historian
				 */
				case 9:
					builder.setMessage(R.string.historian_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							//Email functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theunionhistorian@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();
					break;
				
				/**
				 * SA Rep
				 */
				case 10:
					builder.setMessage(R.string.sarep_duties)
					.setNegativeButton("Email", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// Email functionality
							Intent intent = new Intent(Intent.ACTION_SEND);
							intent.setType("plain/text");
							intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "theunionsarep@gmail.com" });
							intent.putExtra(Intent.EXTRA_SUBJECT, "Concerning the Black Student Union");
							intent.putExtra(Intent.EXTRA_TEXT, "");
							startActivity(Intent.createChooser(intent, ""));
						}
					})
					.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// User cancelled the dialog
						}
					});
					builder.show();
					break;

				}


			}


		});
	}
}

	