package com.example.university_app;


import java.util.ArrayList;

import com.example.Adapters.DrawerAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewTest extends Activity {
	
	private ListView mListView;
	private ArrayList<String> mItems = new ArrayList<String>();
	private DrawerAdapter mAdapter;

	//done by mahdi giveie mahdico@gmail.com
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview);
		
		mListView = (ListView) findViewById(R.id.list);
		mAdapter = new DrawerAdapter(this);
		
		for(int i=0;i<100;i++){
			mItems.add("Android"+i);
		}
		
		//ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,R.layout.custom_textview, mItems);
		mListView.setAdapter(mAdapter);
		
	}

}
