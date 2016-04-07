package com.example.kaili.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    private String reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        reference = intent.getStringExtra(MainPage.BOOK) + " "
                 + intent.getStringExtra(MainPage.CHAPT) + " : "
                 + intent.getStringExtra(MainPage.VERSE);

        TextView textView = (TextView) findViewById(R.id.tvRef);
        textView.setText(reference);

    }
}
