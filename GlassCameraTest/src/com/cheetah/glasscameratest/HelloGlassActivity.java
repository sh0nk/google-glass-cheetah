package com.cheetah.glasscameratest;

import java.io.File;
import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class HelloGlassActivity extends Activity {
	private Button startStopButton;
	private boolean nowRecording;
	
	Button.OnClickListener myClickListener
	= new Button.OnClickListener() {
		public void onClick(View view) {
			startRecording();
		};
	};
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		
		startStopButton = (Button) findViewById(R.id.startStopButton);
		startStopButton.setOnClickListener(myClickListener);

	}
	
	private void startRecording() {
		Uri fileUri;
		File mediaFile = new
				File(Environment.getExternalStorageDirectory().getAbsolutePath() 
						+ "/myvideo.mp4");	
	
		Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
		fileUri = Uri.fromFile(mediaFile);
		
		intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
		startActivityForResult(intent, 101);

	}
	

}
