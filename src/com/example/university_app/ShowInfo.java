package com.example.university_app;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ShowInfo extends Activity {
	
	private TextView mName;
	private TextView mFamily;
	private TextView mEmail;
	private TextView mNumber;
	private Intent mIntent;
	
	public String TEXT;
	
	public String mSavedName;
	public String mSavedFamily;
	
	private SharedPreferences mShared ;
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_info);
		//mIntent = getIntent();
		mShared = PreferenceManager.getDefaultSharedPreferences(this);
		mName = (TextView) findViewById(R.id.setName);
		mFamily = (TextView) findViewById(R.id.setFamily);
		mEmail = (TextView) findViewById(R.id.setEmail);
		mNumber = (TextView) findViewById(R.id.setNumber);
	
		mSavedName = mShared.getString("NAME", "");
		mSavedFamily = mShared.getString("FAMILY", "");
		
		
		mName.setText(mSavedName);
		mFamily.setText(mSavedFamily);
		//mFamily.setText(MainActivity.TEXT);
		//mEmail.setText(mIntent.getStringExtra("EMAIL"));
		//mNumber.setText(mIntent.getStringExtra("Number"));
		
		
		findViewById(R.id.listBtn).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(ShowInfo.this,ListViewTest.class));
			}
		});
		
		
		
		
		
	}
	

}
