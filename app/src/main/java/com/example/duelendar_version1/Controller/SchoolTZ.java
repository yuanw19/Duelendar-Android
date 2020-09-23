package com.example.duelendar_version1.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duelendar_version1.R;

public class SchoolTZ extends AppCompatActivity {
    private ImageButton ReturnSetting;
    private Button MoreTZ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foreigncountrymain);
        //return main
        ReturnSetting = (ImageButton) findViewById(R.id.IBForeignCountryMainReturnMain);
        ReturnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openReturn();
            }
        });
        //
        //open more time zone
        MoreTZ = (Button) findViewById(R.id.BMoreTimeZone);
        MoreTZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMoreTZ();
            }
        });
        //
    }

    public void openReturn(){
        finish();
    }

    public void openMoreTZ(){
        Intent intent = new Intent(this,SchoolTZ.class);
        startActivity(intent);
    }
}
