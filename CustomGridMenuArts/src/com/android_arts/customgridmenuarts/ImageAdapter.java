package com.android_arts.customgridmenuarts;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	
	// Keep all Images in array
	public Integer[] mThumbIds = {
			R.drawable.delicious, R.drawable.design_float,
			R.drawable.deviantart, R.drawable.digg,
			R.drawable.facebook, R.drawable.flickr,
			R.drawable.googleplus, R.drawable.mail,
			R.drawable.mailrss, R.drawable.reddit,
			R.drawable.rss, R.drawable.stumbleupon,
			R.drawable.twitter, R.drawable.youtube,
			R.drawable.deviantart
	};
	
	// Constructor
	public ImageAdapter(Context c){
		mContext = c;
	}

	@Override
	public int getCount() {
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int position) {
		return mThumbIds[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {			
		ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(90, 90));
        return imageView;
	}

}
