package com.android_arts.customfontsarts;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Typeface;


public class Custom_fonts_art extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_fonts_art);
		
		TextView text = (TextView) findViewById(R.id.textView1);
		Typeface face = Typeface.createFromAsset(getAssets(),"fonts/Estrela.ttf");
		text.setTypeface(face);
		
		text = (TextView) findViewById(R.id.textView2);
		face = Typeface.createFromAsset(getAssets(),"fonts/LastHand.ttf");
		text.setTypeface(face);
		
		text = (TextView) findViewById(R.id.textView3);
		face = Typeface.createFromAsset(getAssets(),"fonts/Lemonade.ttf");
		text.setTypeface(face);
	}



}
