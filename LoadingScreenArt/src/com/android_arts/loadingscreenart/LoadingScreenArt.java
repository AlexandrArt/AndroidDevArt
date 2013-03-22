package com.android_arts.loadingscreenart;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.widget.ProgressBar;

public class LoadingScreenArt extends Activity {


    private ProgressBar mProgress;
    private double mProgressStatus = 0;

    private Handler mHandler = new Handler();

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.activity_loading_screen_art);

        mProgress = (ProgressBar) findViewById(R.id.progressBar1);

        // Start lengthy operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                while (mProgressStatus < 100) {
                    mProgressStatus +=0.0002  ; //doWork();

                    // Update the progress bar
                    mHandler.post(new Runnable() {
                        public void run() {
                            mProgress.setProgress((int) mProgressStatus);
                        }
                    });
                }
            }
        }).start();
    }

}
