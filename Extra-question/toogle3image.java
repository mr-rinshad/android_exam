package com.example.imagetoggleapp;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ToggleButton toggleButton;

    int currentImage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        toggleButton = findViewById(R.id.toggleButton);

        imageView.setImageResource(R.drawable.image1);

        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {

            if (currentImage == 1) {
                imageView.setImageResource(R.drawable.image2);
                currentImage = 2;

            } else if (currentImage == 2) {
                imageView.setImageResource(R.drawable.image3);
                currentImage = 3;

            } else {
                imageView.setImageResource(R.drawable.image1);
                currentImage = 1;
            }

            // Reset ToggleButton to OFF for the next click
            toggleButton.setChecked(false);
        });
    }
}
