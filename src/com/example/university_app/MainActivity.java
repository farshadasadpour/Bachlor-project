package com.example.university_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
 

public class MainActivity extends ActionBarActivity {

	private EditText mGetName;
	private EditText mGetFamily;
	private EditText mGetEmail;
	private EditText mGetNumber;
	private Button mSubmit;
	Intent mIntent;
	public static String TEXT;
	
	private SharedPreferences mShared;
	private SharedPreferences.Editor mEditor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mShared = PreferenceManager.getDefaultSharedPreferences(this);
		mEditor = mShared.edit();
		
		
		mGetName = (EditText) findViewById(R.id.getName);
		

		mGetFamily = (EditText) findViewById(R.id.getFamily);
		mGetEmail = (EditText) findViewById(R.id.getEmail);
		mGetNumber = (EditText) findViewById(R.id.getNumber);
		mSubmit = (Button) findViewById(R.id.submit);

		mIntent = new Intent(this, ShowInfo.class);
		if(mSubmit!=null)
		mSubmit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
					
//	mEditor.putString("NAME", mGetName.getEditableText().toString());
//	mEditor.putString("FAMILY", mGetFamily.getEditableText().toString());
//	mEditor.commit();
	
					//TEXT = mGetEmail.getEditableText().toString();
					startActivity(mIntent);
				Toast.makeText(MainActivity.this, "با سپاس از شما دوست عزیز", Toast.LENGTH_LONG).show();
			}
		});

	} 
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_Help) {
			Toast.makeText(MainActivity.this, "HELP", Toast.LENGTH_SHORT).show();
			return true;
		} if(id==R.id.action_settings){
			Toast.makeText(MainActivity.this, "SETTING", Toast.LENGTH_SHORT).show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
