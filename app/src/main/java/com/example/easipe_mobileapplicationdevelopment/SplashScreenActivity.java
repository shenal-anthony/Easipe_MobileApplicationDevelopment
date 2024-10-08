package com.example.easipe_mobileapplicationdevelopment;



import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(this::run, 2000);

    }

    private void run() {
        // Start the main activity
        Intent intent = new Intent(SplashScreenActivity.this, GetStartedActivity.class);
        startActivity(intent);
        finish();

    }
}