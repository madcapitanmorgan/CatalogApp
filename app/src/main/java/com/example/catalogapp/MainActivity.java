package com.example.catalogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    public static String MESSAGE = "com.example.catalogapp.MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view)
    {
        Log.d("CUSTOM","Holi");
        TextView editText = (TextView)findViewById(R.id.editText);
        TextView titleViewText = findViewById(R.id.titleViewText);
        titleViewText.setText(editText.getText());

        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(MESSAGE,""+editText.getText());
        startActivity(intent);
    }
}
