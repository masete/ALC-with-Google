package com.example.coffeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        View.v = findViewById(R.id.button2);
//        v.setOnClickListener(this);
    }
    @Override
    public void onClick(View arg0){
        if(arg0.getId()== R.id.button2){
            Intent intent = new Intent(this, SecondActivity.class);

            this.startActivity(intent);
        }
    }
}

