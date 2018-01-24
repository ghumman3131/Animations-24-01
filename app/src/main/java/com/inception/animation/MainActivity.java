package com.inception.animation;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rocket_ = findViewById(R.id.rocket);

        Animation rocket_animation = AnimationUtils.loadAnimation(MainActivity.this , R.anim.fire_rocket);

        rocket_.setAnimation(rocket_animation);

        rocket_animation.start();

        rocket_animation.setAnimationListener(this);



    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {





    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
