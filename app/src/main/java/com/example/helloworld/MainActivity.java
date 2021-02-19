package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    TextView helloText;
    Button helloButton;
    ImageView helloImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // default init
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Objects for hello world
        helloText = (TextView) findViewById(R.id.Hello_World_Text);
        helloButton = (Button) findViewById(R.id.Hello_World_Button);
        helloImage = (ImageView) findViewById(R.id.Hello_World_Image);
        helloImage.setRotation(0);
        helloImage.setX(helloImage.getWidth() / 2);
        helloImage.setY(helloImage.getHeight() / 2);
        helloText.setTextColor(0xFF000000); helloText.setTextSize(16);
        helloButton.setBackgroundColor(0xFF000000);
        //helloImage = (ImageView) findViewById(R.id.Hello_World_Image);

        // Interactive elements:
        // This Button handling is programmed independent of the xml to allow for more interactivity
        helloButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event){
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    helloText.setTextColor(0xFF007700);
                    helloText.setTextSize(20);
                    helloImage.setRotation(30);
                    helloButton.setBackgroundColor(0xFF226600);
                }
                else {
                    helloText.setTextColor(0xFF000000);
                    helloText.setTextSize(16);
                    helloImage.setRotation(0);
                    helloButton.setBackgroundColor(0xFF000000);
                }
                return true;
            }
        });

    }


}