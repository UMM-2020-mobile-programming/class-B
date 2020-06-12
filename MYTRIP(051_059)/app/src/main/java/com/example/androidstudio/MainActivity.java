package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goRegister = findViewById(R.id.go2);
        Button gogo = findViewById(R.id.go1);

        gogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gogo = new Intent(MainActivity.this, SplashtwoActivity.class);
                startActivity(gogo);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        goRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goRegister = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(goRegister);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
            }
        });
    }
}
