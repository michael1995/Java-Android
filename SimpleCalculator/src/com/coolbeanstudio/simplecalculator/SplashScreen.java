package com.coolbeanstudio.simplecalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.coolbeanstudio.simplecalculator.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		Thread splashTimer = new Thread(){
			public void run(){
				try {
					sleep(5000);
					Intent menuIntent = new Intent("com.coolbeanstudio.simplecalculator.MenuScreen");
					startActivity(menuIntent);
					
				} catch (Exception e){
					e.printStackTrace();
				} finally{
					finish();
				}
			}
		}; 
		splashTimer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
}
