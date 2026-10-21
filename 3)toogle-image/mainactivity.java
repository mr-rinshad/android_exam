package com.example.imagetoggleapp; // Make sure this matches your actual package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Track the current state of the image
    private boolean isFirstImage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference the UI elements from XML
        ImageView imageView = findViewById(R.id.imageView);
        Button btnToggle = findViewById(R.id.btnToggle);

        // Set up the click listener for the button
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstImage) {
                    // Switch to image2
                    imageView.setImageResource(R.drawable.image2);
                    isFirstImage = false;
                } else {
                    // Switch back to image1
                    imageView.setImageResource(R.drawable.image1);
                    isFirstImage = true;
                }
            }
        });
    }
}
