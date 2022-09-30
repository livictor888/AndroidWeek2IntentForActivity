package com.example.intentforactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // obtain the user input
        EditText editText = findViewById(R.id.messageBox);
        String message = editText.getText().toString();

        // create an Intent with the current and target Activities specified (explicit intent)
        Intent intent = new Intent(this, SecondActivity.class);
        // put the user input data in the intent
        intent.putExtra("sent_from_act1", message);
        // start the intent
        startActivity(intent);
    }
}