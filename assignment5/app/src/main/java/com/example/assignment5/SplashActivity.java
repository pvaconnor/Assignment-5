package com.example.assignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    MediaPlayer frozen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        frozen = MediaPlayer.create(this, R.raw.frozen);
        frozen.start();
        TimerTask task = new TimerTask(){
            public void run() {
                frozen.stop();
                finish();
                startActivity(new Intent( SplashActivity.this, ItemListActivity.class) );
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);
    }
}