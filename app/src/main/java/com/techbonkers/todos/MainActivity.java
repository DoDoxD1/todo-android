package com.techbonkers.todos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.techbonkers.myapplication.R;
import com.techbonkers.myapplication.ShoppingActivity;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    FloatingActionButton fab;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        resources references
        webView = findViewById(R.id.browser);
        fab = findViewById(R.id.fab);

        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/index.html");

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(intent);
            }
        });
    }
}