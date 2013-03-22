package com.android_arts.customradiogrouparts;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.app.Activity;


public class CustomRadioActivity extends Activity implements OnCheckedChangeListener {
	   RadioGroup radioGroup;
       TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_radio);
		  radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);
	        textView = (TextView)findViewById(R.id.textView1);
	        radioGroup.setOnCheckedChangeListener(this);
	}

	  public void onCheckedChanged(RadioGroup group, int checkedId) {
            
             int myCheckedRadioId = radioGroup.getCheckedRadioButtonId();
             String displayStr = "";
             if(myCheckedRadioId == R.id.radio0) {
                    displayStr = "Radio 1" ;
             }
             else if(myCheckedRadioId == R.id.radio1) {
                    displayStr = "Radio 2" ;
             }
             else {
                    displayStr = "Radio 3" ;
             }
             textView.setText(displayStr);
      }

}
