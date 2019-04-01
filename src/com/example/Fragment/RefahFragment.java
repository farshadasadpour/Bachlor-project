package com.example.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.university_app.R;

public class RefahFragment extends Fragment {
	private View rootView;
	private LinearLayout mLayout;

	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		rootView = inflater.inflate(R.layout.listbackground, container, false);
		mLayout = (LinearLayout) rootView.findViewById(R.id.backgroundID);
		mLayout.setBackgroundColor(Color.parseColor("#F67743"));
		
		return rootView;	}

}
