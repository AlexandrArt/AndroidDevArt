package com.android_arts.custombuttonarts;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CustomButtonActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_button);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_custom_button, menu);
		return true;
	}

}
