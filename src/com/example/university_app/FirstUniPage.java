package com.example.university_app;

import com.example.Adapters.DrawerAdapter;
import com.example.Fragment.DaneshkadeFragment;
import com.example.Fragment.FoodFragment;
import com.example.Fragment.HomeFragment;
import com.example.Fragment.MoavenatFragment;
import com.example.Fragment.RefahFragment;
import com.example.Utils.Constants;
import android.os.Bundle;
 
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


 

public class FirstUniPage extends ActionBarActivity {

	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private DrawerAdapter mAdapter;
	private ActionBar mActionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_uni_page);
		mAdapter = new DrawerAdapter(this);
		// init Drawer Items
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.list_slidermenu);
		Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
		//setSupportActionBar(toolbar);
		mDrawerList.setAdapter(mAdapter);
		// Set Header title
		mActionBar = getSupportActionBar();
		mActionBar.setTitle(Constants.HOME_TITLE);

		mDrawerList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

			//	Toast.makeText(
				//		FirstUniPage.this,
					//	"شما آیتم شماره " + String.valueOf(position)
						//		+ " را کلیک کرده اید", Toast.LENGTH_LONG)
						//.show();
				
				displayView(position);
			}
		});
		// enabling action bar app icon and behaving it as toggle button
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, // nav
																				// menu
																				// toggle
																				// icon
				R.string.app_name, // nav drawer open - description for
									// accessibility
				R.string.app_name // nav drawer close - description for
									// accessibility
		) {

		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);

	}

	private void displayView(int position) {
		// update the main content by replacing fragments
		Fragment fragment = null;
		switch (position) {
		case 0:
			fragment = new HomeFragment();
			break;
		case 1:
			fragment = new MoavenatFragment();
			break;
		case 2:
			fragment = new DaneshkadeFragment();
			break;
		case 3:
			fragment = new RefahFragment();

			break;
		case 4:
			fragment = new FoodFragment();
			break;

		default:
			break;
		}

		if (fragment != null) {

			FragmentManager fragmentManager = getSupportFragmentManager();
			fragmentManager.beginTransaction()
					.add(R.id.frame_container, fragment).commit();

			// update selected item and title, then close the drawer
			// mDrawerList.setItemChecked(position, true);
			// mDrawerList.setSelection(position);
			mDrawerLayout.closeDrawer(mDrawerList);
		} else {
			mDrawerList.setItemChecked(position, false);
			// error in creating fragment
			Log.e("MainActivity", "Error in creating fragment");
		}
	}

}
