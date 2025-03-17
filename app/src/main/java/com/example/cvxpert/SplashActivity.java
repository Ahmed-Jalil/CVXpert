package com.example.cvxpert;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);


        ImageView logo = findViewById(R.id.logo);
        Animation combinedAnimation = AnimationUtils.loadAnimation(this,R.anim.combined_animation);
        logo.startAnimation(combinedAnimation);

        TextView text = findViewById(R.id.sloganText);
        Animation moveUpAnimation = AnimationUtils.loadAnimation(this, R.anim.move_up);
        text.startAnimation(moveUpAnimation);

        new Handler().postDelayed(()->{
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, 3000); // 3s delay

    }
}