package com.example.imagetoggleapp;

import android.os.Bundle;
import android.widget.ToggleButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {

            if (isChecked) {
                imageView.setImageResource(R.drawable.image2);
            } else {
                imageView.setImageResource(R.drawable.image1);
            }
        });
    }
}
