package com.example.abc.hwfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView;
    Button button;
    boolean isHidden = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        imageView.setImageResource(R.drawable.image);
    }

    @Override
    public void onClick(View v) {
        if(!isHidden){
            imageView.setVisibility(View.INVISIBLE);
            isHidden = true;
        }else{
            imageView.setVisibility(View.VISIBLE);
            isHidden = false;
        }
    }
}
