package com.android_arts.customtabarts;



import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.Toast;
import android.app.Activity;
import android.graphics.Color;


public class CustomTabActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);

		
		setContentView(R.layout.activity_custom_tab);
		final TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);
		final LinearLayout lins = (LinearLayout) this.findViewById(R.id.linear1);
		tabs.setup();

		TabHost.TabSpec spec = tabs.newTabSpec("tag1");

		spec.setContent(R.id.tab1);
		spec.setIndicator("Running", getResources().getDrawable(R.drawable.athletics));
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tag2");
		spec.setContent(R.id.tab2);
		spec.setIndicator("Canoeing ", getResources().getDrawable(R.drawable.canoeing));
		
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tag3");
		spec.setContent(R.id.tab3);
		spec.setIndicator("Cicling", getResources().getDrawable(R.drawable.cycling));
		
		
		
		tabs.addTab(spec);
		
		spec = tabs.newTabSpec("tag4");
		spec.setContent(R.id.tab4);
		spec.setIndicator("Football", getResources().getDrawable(R.drawable.football));
		
		tabs.addTab(spec);
		
		spec = tabs.newTabSpec("tag5");
		spec.setContent(R.id.tab5);
		spec.setIndicator("Skiing", getResources().getDrawable(R.drawable.skiing));
		
		tabs.addTab(spec);
		
		tabs.getTabWidget().getChildAt(0).getLayoutParams().height =100;
		tabs.getTabWidget().getChildAt(1).getLayoutParams().height =100;
		tabs.getTabWidget().getChildAt(2).getLayoutParams().height =100;
		tabs.getTabWidget().getChildAt(3).getLayoutParams().height =100;
		tabs.getTabWidget().getChildAt(4).getLayoutParams().height =100;
		
		setTabColor(tabs);
		

		
		
		tabs.setCurrentTab(0);
		
		
		tabs.setOnTabChangedListener(new OnTabChangeListener() {
		    @Override
		    public void onTabChanged(String tabId) {
		    	
		   if(tabId=="tag1"){lins.setBackgroundDrawable(getResources().getDrawable(R.drawable.running2));
		   Toast.makeText(getApplicationContext(), "TAB1", Toast.LENGTH_LONG).show();}
		   if(tabId=="tag2"){lins.setBackgroundDrawable(getResources().getDrawable(R.drawable.canoeing2));
		   Toast.makeText(getApplicationContext(), "TAB2", Toast.LENGTH_LONG).show();}
		   if(tabId=="tag3"){lins.setBackgroundDrawable(getResources().getDrawable(R.drawable.biking1));
		   Toast.makeText(getApplicationContext(), "TAB3", Toast.LENGTH_LONG).show();}
		   if(tabId=="tag4"){lins.setBackgroundDrawable(getResources().getDrawable(R.drawable.football2));
		   Toast.makeText(getApplicationContext(), "TAB4", Toast.LENGTH_LONG).show();}
		   if(tabId=="tag5"){lins.setBackgroundDrawable(getResources().getDrawable(R.drawable.skiing1));
		   Toast.makeText(getApplicationContext(), "TAB5", Toast.LENGTH_LONG).show();}
		    	
		 //  Toast.makeText(getApplicationContext(), "Click on tab: "+ tabId, Toast.LENGTH_SHORT).show();
		     //   lins.setBackgroundDrawable(getResources().getDrawable(R.drawable.canoeing1));
		    }
		});
		
		
	}
	public static void setTabColor(TabHost tabhost) {
	    for(int i=0;i<tabhost.getTabWidget().getChildCount();i++)
	    {
	        tabhost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#80FFFFFF")); //unselected
	      
	    }
	    tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.parseColor("#80FFFFFF")); // selected
	}


}
