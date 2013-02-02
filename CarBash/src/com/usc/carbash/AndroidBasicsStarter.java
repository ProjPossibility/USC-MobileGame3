package com.usc.carbash;

import android.app.ListActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AndroidBasicsStarter extends ListActivity {

	String[] tests = {"LifeCycleTest","SingleTouchTest","KeyTest"
			,"AccelometerTest","AssestsTest","ExternalStorageTest","SoundPoolTest"
			,"MediaPlayerTest","FullScreenTest","RenderViewTest","ShapeTest"
			, "BitmapTest","FontTest","SurfaceViewTest"};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tests));
    }
    
    @Override
    public void onListItemClick(ListView list, View view, int position, long id)
    {
    	super.onListItemClick(list, view, position, id);
    	String testName = tests[position];
    	try{
    		Class clazz = Class.forName("com.usc.CarBash." + testName);
    		Intent intent = new Intent(this,clazz);
    		startActivity(intent);
    	}
    	catch(ClassNotFoundException e){
    		e.printStackTrace();
    	}
    }
}
