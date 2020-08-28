package com.example.duelendar_version1.Controller;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import com.example.duelendar_version1.Model.SubjectDatabase;
import com.example.duelendar_version1.R;

import java.io.ByteArrayOutputStream;

public class Subject extends AppCompatActivity {
    private ImageButton ReturnMain;
    private Button CreateSubject;
    private ImageButton IBComputer;
    private ImageButton IBEconomy;
    private ImageButton IBEngineering;
    private String ColorString = "#FFA500";
    private ImageButton TempLogo;
    private EditText ETSubjectName;
    private String UserSubjectName;
    private int UserSubjectId;
    private SubjectDatabase SubjectDb = new SubjectDatabase(this);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createsubject);
        ETSubjectName = (EditText) findViewById(R.id.TSubjectName);
        //set logo click color
        IBComputer = (ImageButton) findViewById(R.id.IBComputer);
        IBComputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBComputer.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBComputer;
            }
        });
        IBEconomy = (ImageButton) findViewById(R.id.IBEconomy);
        IBEconomy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBEconomy.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBEconomy;
            }
        });
        IBEngineering = (ImageButton) findViewById(R.id.IBEngineering);
        IBEngineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBEngineering.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBEngineering;
            }
        });
        //

        //???upload subject name and logo to user database
        CreateSubject = (Button) findViewById(R.id.BCreateSubject);
        CreateSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //convert image to byte
                Bitmap bitmap = ((BitmapDrawable) TempLogo.getDrawable()).getBitmap();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] UserSubjectLogo = baos.toByteArray();
                //
                //insert subject information
                UserSubjectId = SubjectDb.getLatestId() + 1;
                UserSubjectName = ETSubjectName.getText().toString();
                SubjectDb.insertSubject(UserSubjectName, UserSubjectLogo);
                //
                openCreateSubject();
            }
        });
        //

        //return main
        ReturnMain = (ImageButton) findViewById(R.id.IBCreateSubjectReturnMain);
        ReturnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReturnMain();
            }
        });
        //
    }

    public void openCreateSubject() {
        Intent intent = new Intent(this, Main.class);
        Toast t = Toast.makeText(getApplicationContext(), "添加完成！", Toast.LENGTH_SHORT);
        t.show();
        intent.putExtra("SubjectId", UserSubjectId);
        setResult(6, intent);
        finish();
    }

    public void openReturnMain() {finish();}
}
