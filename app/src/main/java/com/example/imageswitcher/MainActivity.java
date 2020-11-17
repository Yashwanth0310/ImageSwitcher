package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void SwitchVk(View view){
        Log.i("Info", "Button is pressed");
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.vi2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}