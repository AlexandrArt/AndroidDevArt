package com.android_arts.customgalletyarts;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
import android.app.Activity;

public class CustomGalleryArt extends Activity {

	  private Gallery gallery;
	    private ImageView imgSelected;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_gallery_art);
		
		   gallery = (Gallery) findViewById(R.id.gallery1);
	        imgSelected = (ImageView) findViewById(R.id.imageView1);
	        
	        gallery.setAdapter(new GViewAdapter(this));        
	        gallery.setOnItemClickListener(new OnItemClickListener() 
	        {
	            public void onItemClick(AdapterView<?> parent, 
	            View v, int position, long id) 
	            {                
	            	imgSelected.setImageResource(GViewAdapter.imageIDs[position]);
	            }
	        });
	    }
	}



