package com.example.soc_macmini_15.musicplayer.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.soc_macmini_15.musicplayer.R;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
          Thread thread= new Thread(){
              public void run(){
                  try{
                      sleep(3000);

                  }catch (Exception e) {
                      e.printStackTrace();
              }finally {
                      startActivity(new Intent(Splashscreen.this,MainActivity.class));

                  }
                  }

          };
          thread.start();

    }

}