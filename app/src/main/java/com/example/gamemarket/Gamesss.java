package com.example.gamemarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Gamesss extends AppCompatActivity implements View.OnClickListener {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamesss);

        imageButton=(ImageButton)findViewById(R.id.imageButton5);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton4);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(this);
    }


    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Gamesss.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {

        }
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.imageButton5:
                intent = new Intent(this,EmailPasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.imageButton3:
                intent = new Intent(this,library.class);
                startActivity(intent);
                break;
            case R.id.imageButton4:
                intent = new Intent(this,Apps.class);
                startActivity(intent);
                break;
            case R.id.imageButton2:
                intent = new Intent(this,Other.class);
                startActivity(intent);
                break;
        }
    }
}

