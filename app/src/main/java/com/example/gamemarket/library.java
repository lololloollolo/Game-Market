package com.example.gamemarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class library extends AppCompatActivity implements View.OnClickListener {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        imageButton=(ImageButton)findViewById(R.id.imageButton5);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton76);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton20);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton21);
        imageButton.setOnClickListener(this);
        imageButton=(ImageButton)findViewById(R.id.imageButton19);
        imageButton.setOnClickListener(this);
        }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(library.this, MainActivity.class);
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
            case R.id.imageButton76:
                intent = new Intent(this,Downloads.class);
                startActivity(intent);
                break;
            case R.id.imageButton20:
                intent = new Intent(this,Apps.class);
                startActivity(intent);
                break;
            case R.id.imageButton21:
                intent = new Intent(this,Gamesss.class);
                startActivity(intent);
                break;
            case R.id.imageButton19:
                intent = new Intent(this,Other.class);
                startActivity(intent);
                break;
        }
    }
}