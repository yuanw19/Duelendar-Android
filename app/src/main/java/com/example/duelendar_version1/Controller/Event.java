package com.example.duelendar_version1.Controller;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duelendar_version1.R;

public class Event extends AppCompatActivity {
    private ImageButton ReturnMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event);
        //return main
        ReturnMain = (ImageButton) findViewById(R.id.IBUnfinishHwReturnMain);
        ReturnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReturnMain();
            }
        });
        //
    }

    public void openReturnMain(){
        finish();
    }
}
