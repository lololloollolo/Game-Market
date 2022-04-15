package com.example.gamemarket;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private long backPressedTime;

    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton=(ImageButton)findViewById(R.id.imageButton5);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton7);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton12);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton11);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton9);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton8);
        imageButton.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }

    @Override
    public void onClick(View view) {
    Intent intent;

        switch (view.getId()) {
            case R.id.imageButton5:
                intent = new Intent(this,EmailPasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.imageButton7:
                intent = new Intent(this,infofarm.class);
                startActivity(intent);
                break;
            case R.id.imageButton9:
                intent = new Intent(this,library.class);
                startActivity(intent);
                break;
            case R.id.imageButton12:
                intent = new Intent(this,Gamesss.class);
                startActivity(intent);
                break;
            case R.id.imageButton11:
                intent = new Intent(this,Apps.class);
                startActivity(intent);
                break;
            case R.id.imageButton8:
                intent = new Intent(this,Other.class);
                startActivity(intent);
                break;
        }
    }
}