package com.example.attendease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View; // <-- Required for View parameter
import androidx.appcompat.app.AppCompatActivity;


public class SignUpActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup); // Make sure this layout exists
    }


    // Method to handle Login button click
    public void goToLogin(View view) {
        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}

