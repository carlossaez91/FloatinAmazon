package com.example.floatinamazon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Start the FloatingButtonService to show the floating action button
        Intent intent = new Intent(MainActivity.this, FloatingButtonService.class);
        startService(intent);

        // Continue with your regular activity initialization
        setContentView(R.layout.activity_main);
    }
}
