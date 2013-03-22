package com.android_arts.customtemplate1arts;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class CustomTemplate1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_template1);
		ImageButton imbutton = (ImageButton) findViewById(R.id.imageButton); 
		 imbutton.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
            	 Toast.makeText(getApplicationContext(), "MAIL TOAST!!!", Toast.LENGTH_LONG).show();
            	 
             }});
		
		 ImageButton imbutton2 = (ImageButton) findViewById(R.id.imageButton1); 
		 imbutton2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
            	 Intent i = new Intent(CustomTemplate1.this, Activity2.class);  
            	 startActivity(i);
            	 
             }}); 
		 
        ListView listView = (ListView)findViewById(R.id.mylist);
        String[] data = new String[] {"Robert", "William", "Mary", "Jennifer", "Margaret", "Susan", "Brian", "Edward", "Nancy", "Karen", "Steven", "Helen"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
	}


}
