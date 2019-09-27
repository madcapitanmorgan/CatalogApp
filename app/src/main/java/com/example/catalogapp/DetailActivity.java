package com.example.catalogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView detailTextView = findViewById(R.id.detailTextView);
        Intent t = getIntent();
        String param = t.getStringExtra(MainActivity.MESSAGE);
        detailTextView.setText(param);
        Log.d("TEXTO", param);

    }
}
