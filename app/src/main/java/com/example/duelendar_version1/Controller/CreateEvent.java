package com.example.duelendar_version1.Controller;

import android.os.Bundle;
import android.provider.FontsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duelendar_version1.R;

public class CreateEvent extends AppCompatActivity {
    private ImageButton ReturnMain;
    private Button CreateEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createevent);

        //create event
        CreateEvent = (Button) findViewById(R.id.BCreateEvent);
        CreateEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //
        //return event
        ReturnMain = (ImageButton) findViewById(R.id.IBCreateEventReturnMain);
        ReturnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //
    }
}
