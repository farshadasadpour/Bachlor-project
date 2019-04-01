package com.example.university_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Animation extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anim);
		
		final ImageView anim = (ImageView) findViewById(R.id.anim_image);
		//anim.setBackgroundResource(R.anim.anim_list);
		anim.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				AnimationDrawable animDraw = (AnimationDrawable) anim.getBackground();
//				animDraw.start();
				
				//
				android.view.animation.Animation mAnimation = AnimationUtils.loadAnimation(Animation.this, R.anim.anim_tween);
				anim.startAnimation(mAnimation);
			}
		});
	}

}
