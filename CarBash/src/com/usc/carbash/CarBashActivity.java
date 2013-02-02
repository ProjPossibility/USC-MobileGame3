package com.usc.carbash;

import android.app.Activity;
import android.os.Bundle;

public class CarBashActivity extends Activity {
    /** Called when the activity is first created. */
	private MainMap mMainMapView;
	
	public static final String TAG = "CarBash";
	
	private static String ICICLE_KEY = "car-bash-view";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
    }
}