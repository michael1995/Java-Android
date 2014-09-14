package com.coolbeanstudio.simplecalculator;

import java.io.File;
import java.io.IOException;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.coolbeanstudio.simplecalculator.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class MusicScreen extends Activity {

	File path = Environment
			.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
	File file;
	MediaPlayer mp = new MediaPlayer();
	EditText search;
	TextView songTitle;
	Button searchBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_music_screen);

		search = (EditText) this.findViewById(R.id.SearchString);
		
		searchBtn = (Button) this.findViewById(R.id.btnSearch);
		searchBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				file = new File(path, search.getText().toString());
				try {
					mp.setDataSource(file.getAbsolutePath());
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					mp.prepare();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				mp.start();
			}
		});
		
	}
}
