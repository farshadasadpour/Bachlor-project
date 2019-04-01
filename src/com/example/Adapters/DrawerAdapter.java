package com.example.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.university_app.R;

public class DrawerAdapter extends BaseAdapter {

	private Context mContext;
	private LayoutInflater mInflater;
	private TextView mText;
	private ImageView mImage;
	private Typeface mFace;

	private String[] navTexts = { "ãÚÇæäÊ 1", "ãÚÇæäÊ", "ãÚÇæäÊ",
			"ãÚÇæäÊ", "ãÚÇæäÊ", "ãÚÇæäÊ", };

	private int[] navImages = { R.drawable.uni, R.drawable.moaven,
			R.drawable.faculty, R.drawable.refah, R.drawable.foodcourt };

	public DrawerAdapter(Context context) {
		this.mContext = context;
		mInflater = LayoutInflater.from(mContext);
		mFace = Typeface.createFromAsset(mContext.getAssets(),
				"font/info[at]rubin[dot]ir.ttf");
				
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return navImages.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView = mInflater.inflate(R.layout.custom_nav_row, parent,false);
		mText = (TextView) convertView.findViewById(R.id.text);
		//Set Font
		mText.setTypeface(mFace);
		mImage = (ImageView) convertView.findViewById(R.id.image);
		//Set Items
		mText.setText(navTexts[position]);
		mImage.setImageResource(navImages[position]);
		
		return convertView;
	}

}
