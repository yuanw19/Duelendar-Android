package com.example.duelendar_version1.Controller;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.tv.TvContract;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.duelendar_version1.Model.SubjectDatabase;
import com.example.duelendar_version1.R;

import java.io.ByteArrayOutputStream;

public class Subject extends AppCompatActivity {
    private ImageButton ReturnMain;
    private Button CreateSubject;
    private String LogoBackString;
    //logo color IB
    private ImageButton IBRed;
    private ImageButton IBBlue;
    private ImageButton IBYellow;
    private ImageButton IBGreen;
    private ImageButton IBPink;
    private ImageButton IBPurple;
    //
    //logo correct view
    private ImageView IVCorrectRed;
    private ImageView IVCorrectBlue;
    private ImageView IVCorrectYellow;
    private ImageView IVCorrectGreen;
    private ImageView IVCorrectPink;
    private ImageView IVCorrectPurple;
    //
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
    private String LogoString;
    private EditText ETSubjectName;
    private String UserSubjectName;
    private int UserSubjectId;
    private SubjectDatabase SubjectDb = new SubjectDatabase(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createsubject);
        ETSubjectName = (EditText) findViewById(R.id.ETSubjectName);
        //set logo correct view
        IVCorrectRed = (ImageView) findViewById(R.id.IVCorrectRed);
        IVCorrectBlue = (ImageView) findViewById(R.id.IVCorrectBlue);
        IVCorrectYellow = (ImageView) findViewById(R.id.IVCorrectYellow);
        IVCorrectGreen = (ImageView) findViewById(R.id.IVCorrectGreen);
        IVCorrectPink = (ImageView) findViewById(R.id.IVCorrectPink);
        IVCorrectPurple = (ImageView) findViewById(R.id.IVCorrectPurple);
        //
        //set logo click color
        IBRed = (ImageButton) findViewById(R.id.IBRed);
        IBRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IVCorrectRed.setVisibility(View.VISIBLE);
                IVCorrectBlue.setVisibility(View.GONE);
                IVCorrectYellow.setVisibility(View.GONE);
                IVCorrectGreen.setVisibility(View.GONE);
                IVCorrectPink.setVisibility(View.GONE);
                IVCorrectPurple.setVisibility(View.GONE);
                LogoBackString = "Red";
            }
        });
        IBBlue = (ImageButton) findViewById(R.id.IBBlue);
        IBBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IVCorrectRed.setVisibility(View.GONE);
                IVCorrectBlue.setVisibility(View.VISIBLE);
                IVCorrectYellow.setVisibility(View.GONE);
                IVCorrectGreen.setVisibility(View.GONE);
                IVCorrectPink.setVisibility(View.GONE);
                IVCorrectPurple.setVisibility(View.GONE);
                LogoBackString = "Blue";
            }
        });
        IBYellow = (ImageButton) findViewById(R.id.IBYellow);
        IBYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IVCorrectRed.setVisibility(View.GONE);
                IVCorrectBlue.setVisibility(View.GONE);
                IVCorrectYellow.setVisibility(View.VISIBLE);
                IVCorrectGreen.setVisibility(View.GONE);
                IVCorrectPink.setVisibility(View.GONE);
                IVCorrectPurple.setVisibility(View.GONE);
                LogoBackString = "Yellow";
            }
        });
        IBGreen = (ImageButton) findViewById(R.id.IBGreen);
        IBGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IVCorrectRed.setVisibility(View.GONE);
                IVCorrectBlue.setVisibility(View.GONE);
                IVCorrectYellow.setVisibility(View.GONE);
                IVCorrectGreen.setVisibility(View.VISIBLE);
                IVCorrectPink.setVisibility(View.GONE);
                IVCorrectPurple.setVisibility(View.GONE);
                LogoBackString = "Green";
            }
        });
        IBPink = (ImageButton) findViewById(R.id.IBPink);
        IBPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IVCorrectRed.setVisibility(View.GONE);
                IVCorrectBlue.setVisibility(View.GONE);
                IVCorrectYellow.setVisibility(View.GONE);
                IVCorrectGreen.setVisibility(View.GONE);
                IVCorrectPink.setVisibility(View.VISIBLE);
                IVCorrectPurple.setVisibility(View.GONE);
                LogoBackString = "Pink";
            }
        });
        IBPurple = (ImageButton) findViewById(R.id.IBPurple);
        IBPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IVCorrectRed.setVisibility(View.GONE);
                IVCorrectBlue.setVisibility(View.GONE);
                IVCorrectYellow.setVisibility(View.GONE);
                IVCorrectGreen.setVisibility(View.GONE);
                IVCorrectPink.setVisibility(View.GONE);
                IVCorrectPurple.setVisibility(View.VISIBLE);
                LogoBackString = "Purple";
            }
        });
        //
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
                LogoString = "Computer";
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
                LogoString = "Economy";
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
                LogoString = "Engineering";
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
                LogoString = "English";
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
                LogoString = "MedicalScience";
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
                LogoString = "Biology";
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
                LogoString = "Business";
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
                LogoString = "Chemistry";
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
                LogoString = "Finance";
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
                LogoString = "Physics";
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
                LogoString = "Law";
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
                LogoString = "Math";
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
                LogoString = "Music";
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
                LogoString = "Performance";
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
                LogoString = "Art";
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
                LogoString = "DrawingAndPainting";
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
                LogoString = "Psychology";
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
                LogoString = "Agriculture";
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
                LogoString = "AnimalScience";
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
                LogoString = "AnimationDesign";
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
                LogoString = "Architecture";
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
                TempLogo = IBAstronomy;
                LogoString = "Astronomy";
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
                LogoString = "Automobile";
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
                LogoString = "CultureStudy";
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
                LogoString = "Database";
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
                LogoString = "Education";
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
                LogoString = "EnvironmentalScience";
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
                LogoString = "Film";
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
                LogoString = "Food";
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
                LogoString = "Health";
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
                LogoString = "History";
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
                LogoString = "Horticulture";
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
                LogoString = "Investment";
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
                LogoString = "Language";
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
                LogoString = "Literature";
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
                LogoString = "Management";
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
                LogoString = "NewsAndMedia";
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
                LogoString = "Philosophy";
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
                LogoString = "Photography";
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
                LogoString = "Politics";
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
                LogoString = "SocialScience";
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
                LogoString = "Speaking";
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
                LogoString = "Statistics";
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
                LogoString = "Theater";
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
                LogoString = "Trading";
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
                LogoString = "UrbanPlanning";
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
                LogoString = "WebPageDesign";
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
                LogoString = "Writing";
            }
        });


        //???upload subject name and logo to user database
        CreateSubject = (Button) findViewById(R.id.BCreateSubject);
        CreateSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //insert subject information
                UserSubjectId = SubjectDb.getLatestId() + 1;
                UserSubjectName = ETSubjectName.getText().toString();
                SubjectDb.insertSubject(UserSubjectName, LogoString, LogoBackString);
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
