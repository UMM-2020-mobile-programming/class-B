package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Button goone = findViewById(R.id.go);

        goone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goone = new Intent(OrderActivity.this, InfoActivity.class);
                startActivity(goone);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}
