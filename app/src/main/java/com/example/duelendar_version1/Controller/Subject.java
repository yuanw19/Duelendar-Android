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
    //Subjects IB
    private ImageButton IBComputer;
    private ImageButton IBEconomy;
    private ImageButton IBEngineering;
    private ImageButton IBEnglish;
    private ImageButton IBMedicalScience;
    private ImageButton IBBiology;
    private ImageButton IBBusiness;
    private ImageButton IBChemistry;
    private ImageButton IBFinance;
    private ImageButton IBPhysics;
    private ImageButton IBLaw;
    private ImageButton IBMath;
    private ImageButton IBMusic;
    private ImageButton IBPerformance;
    private ImageButton IBArt;
    private ImageButton IBDrawingAndPainting;
    private ImageButton IBPsychology;
    private ImageButton IBAgriculture;
    private ImageButton IBAnimalScience;
    private ImageButton IBAnimationDesign;
    private ImageButton IBArchitecture;
    private ImageButton IBAstronomy;
    private ImageButton IBAutomobile;
    private ImageButton IBCultureStudy;
    private ImageButton IBDatabase;
    private ImageButton IBEducation;
    private ImageButton IBEnvironmentalScience;
    private ImageButton IBFilm;
    private ImageButton IBFood;
    private ImageButton IBHealth;
    private ImageButton IBHistory;
    private ImageButton IBHorticulture;
    private ImageButton IBInvestment;
    private ImageButton IBLanguage;
    private ImageButton IBLiterature;
    private ImageButton IBManagement;
    private ImageButton IBNewsAndMedia;
    private ImageButton IBPhilosophy;
    private ImageButton IBPhotography;
    private ImageButton IBPolitics;
    private ImageButton IBSocialScience;
    private ImageButton IBSpeaking;
    private ImageButton IBStatistics;
    private ImageButton IBTheater;
    private ImageButton IBTrading;
    private ImageButton IBUrbanPlanning;
    private ImageButton IBWebPageDesign;
    private ImageButton IBWriting;
    //Constants
    private String ColorString = "#FFA500";
    private ImageButton TempLogo;
    private EditText ETSubjectName;
    private String UserSubjectName;
    private int UserSubjectId;
    private SubjectDatabase SubjectDb = new SubjectDatabase(this);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createsubject);
        ETSubjectName = (EditText) findViewById(R.id.ETSubjectName);

        //set logo click color
        //IBComputer
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

        //IBEconomy
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

        //IBEngineering
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

        //IBEnglish
        IBEnglish = (ImageButton) findViewById(R.id.IBEnglish);
        IBEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBEnglish.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBEnglish;
            }
        });

        //IBMedicalScience
        IBMedicalScience = (ImageButton) findViewById(R.id.IBMedicalScience);
        IBMedicalScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBMedicalScience.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBMedicalScience;
            }
        });

        //IBBiology
        IBBiology = (ImageButton) findViewById(R.id.IBBiology);
        IBBiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBBiology.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBBiology;
            }
        });

        //IBBusiness
        IBBusiness = (ImageButton) findViewById(R.id.IBBusiness);
        IBBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBBusiness.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBBusiness;
            }
        });

        //IBChemistry
        IBChemistry = (ImageButton) findViewById(R.id.IBChemistry);
        IBChemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBChemistry.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBChemistry;
            }
        });

        //IBFinance
        IBFinance = (ImageButton) findViewById(R.id.IBFinance);
        IBFinance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBFinance.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBFinance;
            }
        });

        //IBPhysics
        IBPhysics = (ImageButton) findViewById(R.id.IBPhysics);
        IBPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBPhysics.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBPhysics;
            }
        });

        //IBLaw
        IBLaw = (ImageButton) findViewById(R.id.IBLaw);
        IBLaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBLaw.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBLaw;
            }
        });

        //IBMath
        IBMath = (ImageButton) findViewById(R.id.IBMath);
        IBMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBMath.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBMath;
            }
        });

        //IBMusic
        IBMusic = (ImageButton) findViewById(R.id.IBMusic);
        IBMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBMusic.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBMusic;
            }
        });

        //IBPerformance
        IBPerformance = (ImageButton) findViewById(R.id.IBPerformance);
        IBPerformance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBPerformance.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBPerformance;
            }
        });

        //IBArt
        IBArt = (ImageButton) findViewById(R.id.IBArt);
        IBArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBArt.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBArt;
            }
        });

        //IBDrawingAndPainting
        IBDrawingAndPainting = (ImageButton) findViewById(R.id.IBDrawingAndPainting);
        IBDrawingAndPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBDrawingAndPainting.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBDrawingAndPainting;
            }
        });

        //IBPsychology
        IBPsychology = (ImageButton) findViewById(R.id.IBPsychology);
        IBPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBPsychology.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBPsychology;
            }
        });

        //IBAgriculture
        IBAgriculture = (ImageButton) findViewById(R.id.IBAgriculture);
        IBAgriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBAgriculture.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBAgriculture;
            }
        });

        //IBAnimalScience
        IBAnimalScience = (ImageButton) findViewById(R.id.IBAnimalScience);
        IBAnimalScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBAnimalScience.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBAnimalScience;
            }
        });

        //IBAnimationDesign
        IBAnimationDesign = (ImageButton) findViewById(R.id.IBAnimationDesign);
        IBAnimationDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBAnimationDesign.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBAnimationDesign;
            }
        });

        //IBArchitecture
        IBArchitecture = (ImageButton) findViewById(R.id.IBArchitecture);
        IBArchitecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBArchitecture.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBArchitecture;
            }
        });

        //IBAstronomy
        IBAstronomy = (ImageButton) findViewById(R.id.IBAstronomy);
        IBAstronomy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBArchitecture.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBArchitecture;
            }
        });

        //IBAutomobile
        IBAutomobile = (ImageButton) findViewById(R.id.IBAutomobile);
        IBAutomobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBAutomobile.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBAutomobile;
            }
        });

        //IBCultureStudy
        IBCultureStudy = (ImageButton) findViewById(R.id.IBCultureStudy);
        IBCultureStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBCultureStudy.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBCultureStudy;
            }
        });

        //IBDatabase
        IBDatabase = (ImageButton) findViewById(R.id.IBDatabase);
        IBDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBDatabase.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBDatabase;
            }
        });

        //IBEducation
        IBEducation = (ImageButton) findViewById(R.id.IBEducation);
        IBEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBEducation.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBEducation;
            }
        });

        //IBEnvironmentalScience
        IBEnvironmentalScience = (ImageButton) findViewById(R.id.IBEnvironmentalScience);
        IBEnvironmentalScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBEnvironmentalScience.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBEnvironmentalScience;
            }
        });

        //IBFilm
        IBFilm = (ImageButton) findViewById(R.id.IBFilm);
        IBFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBFilm.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBFilm;
            }
        });

        //IBFood
        IBFood = (ImageButton) findViewById(R.id.IBFood);
        IBFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBFood.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBFood;
            }
        });

        //IBHealth
        IBHealth = (ImageButton) findViewById(R.id.IBHealth);
        IBHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBHealth.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBHealth;
            }
        });

        //IBHistory
        IBHistory = (ImageButton) findViewById(R.id.IBHistory);
        IBHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBHistory.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBHistory;
            }
        });

        //IBHorticulture
        IBHorticulture = (ImageButton) findViewById(R.id.IBHorticulture);
        IBHorticulture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBHorticulture.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBHorticulture;
            }
        });

        //IBInvestment
        IBInvestment = (ImageButton) findViewById(R.id.IBInvestment);
        IBInvestment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBInvestment.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBInvestment;
            }
        });

        //IBLanguage
        IBLanguage = (ImageButton) findViewById(R.id.IBLanguage);
        IBLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBLanguage.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBLanguage;
            }
        });

        //IBLiterature
        IBLiterature = (ImageButton) findViewById(R.id.IBLiterature);
        IBLiterature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBLiterature.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBLiterature;
            }
        });

        //IBManagement
        IBManagement = (ImageButton) findViewById(R.id.IBManagement);
        IBManagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBManagement.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBManagement;
            }
        });

        //IBNewsAndMedia
        IBNewsAndMedia = (ImageButton) findViewById(R.id.IBNewsAndMedia);
        IBNewsAndMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBNewsAndMedia.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBNewsAndMedia;
            }
        });

        //IBPhilosophy
        IBPhilosophy = (ImageButton) findViewById(R.id.IBPhilosophy);
        IBPhilosophy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBPhilosophy.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBPhilosophy;
            }
        });

        //IBPhotography
        IBPhotography = (ImageButton) findViewById(R.id.IBPhotography);
        IBPhotography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBPhotography.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBPhotography;
            }
        });

        //IBPolitics
        IBPolitics = (ImageButton) findViewById(R.id.IBPolitics);
        IBPolitics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBPolitics.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBPolitics;
            }
        });

        //IBSocialScience
        IBSocialScience = (ImageButton) findViewById(R.id.IBSocialScience);
        IBSocialScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBSocialScience.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBSocialScience;
            }
        });

        //IBSpeaking
        IBSpeaking = (ImageButton) findViewById(R.id.IBSpeaking);
        IBSpeaking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBSpeaking.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBSpeaking;
            }
        });

        //IBStatistics
        IBStatistics = (ImageButton) findViewById(R.id.IBStatistics);
        IBStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBStatistics.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBStatistics;
            }
        });

        //IBTheater
        IBTheater = (ImageButton) findViewById(R.id.IBTheater);
        IBTheater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBTheater.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBTheater;
            }
        });

        //IBTrading
        IBTrading = (ImageButton) findViewById(R.id.IBTrading);
        IBTrading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBTrading.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBTrading;
            }
        });

        //IBUrbanPlanning
        IBUrbanPlanning = (ImageButton) findViewById(R.id.IBUrbanPlanning);
        IBUrbanPlanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBUrbanPlanning.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBUrbanPlanning;
            }
        });

        //IBWebPageDesign
        IBWebPageDesign = (ImageButton) findViewById(R.id.IBWebPageDesign);
        IBWebPageDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBWebPageDesign.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBWebPageDesign;
            }
        });

        //IBWriting
        IBWriting = (ImageButton) findViewById(R.id.IBWriting);
        IBWriting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TempLogo != null) {
                    TempLogo.setBackgroundResource(android.R.drawable.btn_default);
                }
                IBWriting.setBackgroundColor(Color.parseColor(ColorString));
                TempLogo = IBWriting;
            }
        });


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
