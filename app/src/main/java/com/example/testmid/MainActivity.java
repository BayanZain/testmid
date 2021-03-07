package com.example.testmid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer Song;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Song = new MediaPlayer();
        Song = MediaPlayer.create(this, R.raw.lion);

        ImageView image = (ImageView)findViewById(R.id.imageView);

        playing = 0;
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing){
                    case 0:
                        Song.start();
                        playing=1;
                        break;
                    case 1:
                        Song.pause();
                        playing=0;
                        break;
                }
            }
        });

        Button act2F1 = (Button)findViewById(R.id.act2F1);
        Button act3F1 = (Button)findViewById(R.id.act3F1);

        act2F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
        act3F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity3.class));
            }
        });
    }
}