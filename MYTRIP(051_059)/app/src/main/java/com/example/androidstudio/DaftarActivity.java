package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaftarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        Button gogoone = findViewById(R.id.tiketone);
        Button gogotwo = findViewById(R.id.tikettwo);
        Button gogothree = findViewById(R.id.tiketthree);
        Button gogofour = findViewById(R.id.tiketfour);
        Button gogofive = findViewById(R.id.tiketfive);

        gogoone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gogoone = new Intent(DaftarActivity.this, OrderActivity.class);
                startActivity(gogoone);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        gogotwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gogotwo = new Intent(DaftarActivity.this,  OrderActivity.class);
                startActivity(gogotwo);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        gogothree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gogothree = new Intent(DaftarActivity.this,  OrderActivity.class);
                startActivity(gogothree);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        gogofour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gogofour = new Intent(DaftarActivity.this,  OrderActivity.class);
                startActivity(gogofour);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        gogofive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gogofive = new Intent(DaftarActivity.this,  OrderActivity.class);
                startActivity(gogofive);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}
