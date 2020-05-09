package com.example.posedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void onLoginBtnClick(View view) {
        Intent intent = new Intent(this,SignInActivity.class);
        startActivity(intent);
    }

    public void onRegBtnClick(View view) {
        Intent intent = new Intent(this,RegistrationActivity.class);
        startActivity(intent);
    }
}
