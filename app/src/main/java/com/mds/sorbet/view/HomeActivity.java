package com.mds.sorbet.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mds.sorbet.R;
import android.content.Intent;
import android.view.View;
import android.view.MotionEvent;

public class HomeActivity extends AppCompatActivity {

    float x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
            if(x1 > x2){
                Intent i = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
            break;
        }
        return false;
    }
}
