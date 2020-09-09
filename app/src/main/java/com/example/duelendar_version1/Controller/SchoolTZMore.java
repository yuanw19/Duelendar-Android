package com.example.duelendar_version1.Controller;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duelendar_version1.R;

public class SchoolTZMore extends AppCompatActivity {
    private ImageButton ReturnTZ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foreigncountrymore);
        //return main
        ReturnTZ = (ImageButton) findViewById(R.id.IBForeignCountryMoreReturnMain);
        ReturnTZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReturn();
            }
        });
        //
    }

    public void openReturn(){
        finish();
    }
}
