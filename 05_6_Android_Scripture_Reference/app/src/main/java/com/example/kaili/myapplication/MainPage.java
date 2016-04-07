package com.example.kaili.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainPage extends AppCompatActivity {
    public final static String BOOK = "com.example.kaili.myapplication.BOOK";
    public final static String CHAPT = "com.example.kaili.myapplication.CHAPT";
    public final static String VERSE = "com.example.kaili.myapplication.VERSE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void createDisplay(View vw) {
        Intent intent = new Intent(this, Display.class);

        String book = ((EditText) findViewById(R.id.etBook)).getText().toString();
        String chapt = ((EditText) findViewById(R.id.etChapt)).getText().toString();
        String verse = ((EditText) findViewById(R.id.etVerse)).getText().toString();

        intent.putExtra(BOOK, book);
        intent.putExtra(CHAPT, chapt);
        intent.putExtra(VERSE, verse);

        startActivity(intent);
    }
}
