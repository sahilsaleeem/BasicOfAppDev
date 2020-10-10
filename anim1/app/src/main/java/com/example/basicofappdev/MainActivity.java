package com.example.basicofappdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView appleImageView = (ImageView)findViewById(R.id.apple_image);
        appleImageView.setX(-1000);
        appleImageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);



    }
}