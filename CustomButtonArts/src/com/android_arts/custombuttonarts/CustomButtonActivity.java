package com.android_arts.custombuttonarts;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;


public class CustomButtonActivity extends Activity {
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_button);
		b1 = (Button) findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			   public void onClick(View v) {
				   Toast.makeText(getApplicationContext(), "button 1 was clicked!", Toast.LENGTH_SHORT).show();      // button 1 was clicked!
			   }
			  });		
	}
}
