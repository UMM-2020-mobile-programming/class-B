package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.MediaController;
import android.widget.VideoView;

public class SplashActivity extends AppCompatActivity {

    private static int TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        VideoView video = (VideoView) findViewById(R.id.videosplash);
        MediaController media = new MediaController(this);
        Uri lokasivideo = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash);
        video.setVideoURI(lokasivideo);
        video.setMediaController(media);
        video.start();
        video.requestFocus();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(SplashActivity.this, IntroActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                startActivity(splash);
                finish();
            }
        },TIME_OUT);
    }
}
