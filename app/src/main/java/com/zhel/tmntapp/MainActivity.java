package com.zhel.tmntapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    ImageView tmntImage;
    RadioGroup tmntGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tmntImage = findViewById(R.id.tmntImage);
        tmntGroup = findViewById(R.id.turtleGroup);
    }

    public void onClickLeo(View v) {
        tmntGroup.check(R.id.leo);
        tmntImage.setImageResource(R.drawable.leo);
    }
    public void onClickMike(View v) {
        tmntGroup.check(R.id.mike);
        tmntImage.setImageResource(R.drawable.mike);
    }
    public void onClickRaph(View v) {
        tmntGroup.check(R.id.raph);
        tmntImage.setImageResource(R.drawable.raph);
    }
    public void onClickDon(View v) {
        tmntGroup.check(R.id.don);
        tmntImage.setImageResource(R.drawable.don);
    }
}
