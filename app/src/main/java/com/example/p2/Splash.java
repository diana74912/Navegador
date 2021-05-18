package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
            TimerTask tarea= new TimerTask() {
                @Override
                public void run() {
                    Intent inten = new Intent(Splash.this,MainActivity.class);
                    startActivity(inten);
                    finish();

                }
            };
            Timer tiempo = new Timer();
            tiempo.schedule(tarea,10000);

        }

    }