package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button goLogin = findViewById(R.id.go2);
        Button gogo = findViewById(R.id.go1);

        gogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gogo = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(gogo);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goLogin = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(goLogin);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed () {
        Intent goLogin = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(goLogin);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        finish();
    }
}
