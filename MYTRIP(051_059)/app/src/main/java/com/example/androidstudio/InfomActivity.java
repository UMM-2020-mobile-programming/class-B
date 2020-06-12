package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class InfomActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infom);

        Button gogoone = findViewById(R.id.buy);
        Button button = findViewById(R.id.button);
        Button buttonone = findViewById(R.id.buttonone);

        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button = new Intent(InfomActivity.this, PulangActivity.class);
                startActivity(button);
            }
        });

        gogoone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gogoone = new Intent(InfomActivity.this, SplashaActivity.class);
                startActivity(gogoone);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);

        String a = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView textone = findViewById(R.id.textone);
        textone.setText(a);
    }
}
