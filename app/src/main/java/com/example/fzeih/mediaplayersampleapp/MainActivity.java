package com.example.fzeih.mediaplayersampleapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.love_mode);

        Button buttonPlay = (Button) findViewById(R.id.button_play);
        Button buttonPause = (Button) findViewById(R.id.button_pause);

        if (buttonPlay !=null) {
            buttonPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View view){
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing Song", Toast.LENGTH_SHORT).show();
                }
                });
            }
        if (buttonPause !=null) {
            buttonPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View view){
                    mediaPlayer.pause();
                    Toast.makeText(MainActivity.this, "Pause Song", Toast.LENGTH_SHORT).show();
                }
            });
        }

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
            Toast.makeText(MainActivity.this, "I'm done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
