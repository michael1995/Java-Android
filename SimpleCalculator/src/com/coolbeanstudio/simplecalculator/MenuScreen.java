package com.coolbeanstudio.simplecalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.coolbeanstudio.simplecalculator.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class MenuScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_screen);
		
		
	}
	
	public void Calculator(View view){
		Intent calculatorIntent = new Intent("com.coolbeanstudio.simplecalculator.CalculatorScreen");
		startActivity(calculatorIntent);
	} 
	public void Sounds(View view){
		Intent soundsIntent = new Intent("com.coolbeanstudio.simplecalculator.MusicScreen");
		startActivity(soundsIntent);
	}
}
