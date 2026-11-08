package com.example.fruitlistapp;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ImageView imageView;
    ToggleButton toggleButton;

    String[] fruits = {"Apple", "Banana", "Cherry", "Mango", "Orange"};

    int[] images = {
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.cherry,
            R.drawable.mango,
            R.drawable.orange
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        imageView = findViewById(R.id.imageView);
        toggleButton = findViewById(R.id.toggleButton);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, fruits);

        listView.setAdapter(adapter);

        imageView.setVisibility(View.GONE);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                imageView.setImageResource(images[position]);

                toggleButton.setChecked(true);
                imageView.setVisibility(View.VISIBLE);
            }
        });

        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {

            if (isChecked) {
                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }
        });
    }
}
