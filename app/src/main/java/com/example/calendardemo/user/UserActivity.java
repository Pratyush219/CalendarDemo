package com.example.calendardemo.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.calendardemo.R;

public class UserActivity extends AppCompatActivity {
    public static int REQUEST_AUTHORIZATION = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}