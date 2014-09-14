package com.coolbeanstudio.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.coolbeanstudio.simplecalculator.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class CalculatorScreen extends Activity {

	public String str = "";
	Character operation = 'q';
	int num, numtemp;
	EditText showResult; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator_screen);

		showResult = (EditText) findViewById(R.id.result_id);
	}

	public void btn1Clicked(View v) {
		insert(1);
	}

	public void btn2Clicked(View v) {
		insert(2);
	}

	public void btn3Clicked(View v) {
		insert(3);
	}

	public void btn4Clicked(View v) {
		insert(4);
	}

	public void btn5Clicked(View v) {
		insert(5);
	}

	public void btn6Clicked(View v) {
		insert(6);
	}

	public void btn7Clicked(View v) {
		insert(7);
	}

	public void btn8Clicked(View v) {
		insert(8);
	}

	public void btn9Clicked(View v) {
		insert(9);
	}

	public void btnplusClicked(View v) {
		perform();
		operation = '+';
	}

	public void btnminusClicked(View v) {
		perform();
		operation = '-';
	}

	public void btndivideClicked(View v) {
		perform();
		operation = '/';
	}

	public void btnmultiClicked(View v) {
		perform();
		operation = '*';
	}

	public void btnequalClicked(View v) {
		calculate();
	}

	public void btnclearClicked(View v) {
		reset();
	}

	private void reset() {
		// TODO Auto-generated method stub
		str = "";
		operation = 'q';
		num = 0;
		numtemp = 0;
		showResult.setText("");
	}

	private void insert(int j) {
		str = str + Integer.toString(j);
		num = Integer.valueOf(str).intValue();
		showResult.setText(str);
	}

	private void perform() {
		str = "";
		numtemp = num;
	}

	private void calculate() {
		// TODO Auto-generated method stub
		if (operation == '+')
			num = numtemp + num;
		else if (operation == '-')
			num = numtemp - num;
		else if (operation == '/')
			num = numtemp / num;
		else if (operation == '*')
			num = numtemp * num;
		showResult.setText("" + num);
	}
}
