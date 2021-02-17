package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button helloButton;
    ImageView helloPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.Hello_World_Text);
        helloButton = (Button) findViewById(R.id.Hello_World_Button);

    }

    public void onHelloClick(View view){

        helloText.setTextColor(0xFF00FF00);
        helloButton.setBackgroundColor(0xFF00FF00);
    }
    


}