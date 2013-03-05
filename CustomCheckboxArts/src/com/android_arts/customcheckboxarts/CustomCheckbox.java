package com.android_arts.customcheckboxarts;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.app.Activity;


public class CustomCheckbox extends Activity {
	private CheckBox check1, check2, check3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_checkbox);
		check1 = (CheckBox) findViewById(R.id.checkBox1);
		
		check1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				 if(check1.isChecked()){
					 Toast.makeText(getBaseContext(), "Checked",
							 Toast.LENGTH_SHORT).show(); 
	                }else{
	                	Toast.makeText(getBaseContext(), "UnChecked",
	                			Toast.LENGTH_SHORT).show(); 
	                }
				
			}
        });
		
check2 = (CheckBox) findViewById(R.id.checkBox2);
		
		check2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				 if(check2.isChecked()){
					 Toast.makeText(getBaseContext(), "HI",
							 Toast.LENGTH_SHORT).show(); 
	                }else{
	                	Toast.makeText(getBaseContext(), "HO-HO-HO",
	                			Toast.LENGTH_SHORT).show(); 
	                }
				
			}
        });

check3 = (CheckBox) findViewById(R.id.checkBox3);
		
		check3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				 if(check3.isChecked()){
					 Toast.makeText(getBaseContext(), "Checked3",
							 Toast.LENGTH_SHORT).show(); 
	                }else{
	                	Toast.makeText(getBaseContext(), "UnChecked3",
	                			Toast.LENGTH_SHORT).show(); 
	                }
				
			}
        });
	}			
	}
		
	

		


