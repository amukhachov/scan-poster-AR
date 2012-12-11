package com.qualcomm.QCARSamples.ImageTargets;

import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class TrailerViewerActivity extends Activity {
	private VideoView mVideoView;
	 
	   @Override
	   public void onCreate(Bundle icicle) {
	     super.onCreate(icicle);
	     setContentView(R.layout.video_layout);
	     
	     TextView tv=(TextView)findViewById(R.id.description_text_view);
	     Typeface face=Typeface.createFromAsset(getAssets(), "American-Uncial-Normal.ttf");
	     tv.setTypeface(face);
	     
	     mVideoView = (VideoView) findViewById(R.id.trailer_video_view);
	     mVideoView.setVideoURI(Uri.parse("https://dl.dropbox.com/s/6emqcdqdm09u2lg/Game%20of%20Thrones%20Violin%20Cover.mp4"));
	     mVideoView.setMediaController(new MediaController(this));
	     mVideoView.requestFocus();
	     mVideoView.start();
	   }
}
