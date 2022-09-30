package com.example.intentforactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // get the intent
        Intent intent = getIntent();
        // extract message from the intent
        String message = intent.getStringExtra("sent_from_act1");
        // display the obtained message
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
