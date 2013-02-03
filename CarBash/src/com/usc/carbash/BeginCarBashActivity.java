package com.usc.carbash;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;


public class BeginCarBashActivity extends Activity implements OnClickListener, OnInitListener{
    /** Called when the activity is first created. */
	public static final String TAG = "CarBash";
	private Button go;
	//TTS object
    private TextToSpeech myTTS;
    //status check code
    private int MY_DATA_CHECK_CODE = 0;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);        
        
        go = (Button) findViewById(R.id.Start);
        
        //listen for clicks
        go.setOnClickListener(this);
        //check for TTS data
        Intent checkTTSIntent = new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);
        
        go.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		startActivity(new Intent(BeginCarBashActivity.this, MultiplayerActivity.class));
        	}
        });
    }
	@Override
	public void onInit(int status) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}