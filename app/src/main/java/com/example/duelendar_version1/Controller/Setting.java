package com.example.duelendar_version1.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duelendar_version1.Model.User;
import com.example.duelendar_version1.Model.UserDatabase;
import com.example.duelendar_version1.R;

public class Setting extends AppCompatActivity {
    private ImageButton ReturnMain;
    private ImageButton TZ;
    private EditText UserName;
    private String UserNameString;
    private EditText UserSchool;
    private String UserMainBgString;
    private String UserSchoolString;
    private String UserSchoolBgString;
    private EditText UserSchoolTimeZone;
    private String UserSchoolTimeZoneString;
    private UserDatabase UserDb = new UserDatabase(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        //return main
        ReturnMain = (ImageButton) findViewById(R.id.IBSettingReturnMain);
        ReturnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openReturn();
            }
        });
        //
        //open time zone
        TZ = (ImageButton) findViewById(R.id.IBSchool);
        TZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeZone();
            }
        });
        //
        //get user info
        UserName = (EditText) findViewById(R.id.PTName);
        UserNameString = UserName.getText().toString();
        UserMainBgString = "get from bg interface";
        UserSchoolString = "get from school interface";
        UserSchool = (EditText) findViewById(R.id.PTSchool);
        UserSchool.setText(UserSchoolString);
        UserSchoolBgString = "get from school interface";
        UserSchoolTimeZoneString = "get from time zone interface";
        UserSchoolTimeZone = (EditText) findViewById(R.id.PTSchoolTimeZone);
        UserSchoolTimeZone.setText(UserSchoolTimeZoneString);
    }


    public void openReturn(){
        User u = new User(UserMainBgString, UserSchoolString, UserSchoolBgString, UserNameString, UserSchoolTimeZoneString);
        UserDb.insertUser(u);
        setResult(1);
        finish();
    }

    public void openTimeZone(){
        Intent intent = new Intent(this,SchoolTZ.class);
        startActivity(intent);
    }

}
