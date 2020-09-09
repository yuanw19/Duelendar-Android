package com.example.duelendar_version1.Controller;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.tv.TvContract;
import android.os.Build;
import android.os.Bundle;
import android.service.autofill.UserData;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.duelendar_version1.Model.EventDatabase;
import com.example.duelendar_version1.Model.SubjectDatabase;
import com.example.duelendar_version1.Model.User;
import com.example.duelendar_version1.Model.UserDatabase;
import com.example.duelendar_version1.R;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {
    private ImageButton CreateSubject;
    private ImageButton OpenSetting;
    private Button TemporaryButton;
    private TextView UserName;
    private String UserNameString;
    private RelativeLayout TemporaryLayout;
    private int DBid;
    private int ButtonId;
    private int LayoutId;
    private int SettingId;
    private String LogoBackString;
    private String LogoImageString;
    private int LogoBackId;
    private boolean mIsShowing1 = false;
    private boolean mIsShowing2 = false;
    private PopupWindow popupWindow1;
    private WindowManager.LayoutParams params1;
    private PopupWindow popupWindow2;
    private WindowManager.LayoutParams params2;
    private final static int CREATE_SUBJECT_REQUEST_CODE = 1;
    private final static int CHECK_SUBJECT_REQUEST_CODE = 2;
    private final static int SETTING_REQUEST_CODE = 3;
    private EventDatabase EventDb = new EventDatabase(this);
    private SubjectDatabase SubjectDb = new SubjectDatabase(this);
    private UserDatabase UserDb = new UserDatabase(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        params1 = getWindow().getAttributes();//popup window code
        params2 = getWindow().getAttributes();//popup window code
        UserName = (TextView) findViewById(R.id.TUsername);
        //create subject
        CreateSubject = (ImageButton)findViewById(R.id.BAddSubject);
        CreateSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!mIsShowing1 && !mIsShowing2) {
                    openCreateSubject();
                }
            }
        });
        //
        //open setting
        OpenSetting = (ImageButton) findViewById(R.id.IBSetting);
        OpenSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mIsShowing1 && !mIsShowing2) {
                    openSetting();
                }
            }
        });
        //

    }

    public void openCreateSubject(){
        Intent intent = new Intent(this,Subject.class);
        startActivityForResult(intent, CREATE_SUBJECT_REQUEST_CODE);
    }

    public void openSubject(){
        Intent intent = new Intent(this,Subject.class);
        startActivityForResult(intent, CHECK_SUBJECT_REQUEST_CODE);
    }

    public void openEvent(){
        Intent intent = new Intent(this,Event.class);
        startActivity(intent);
    }

    public void openSetting(){
        Intent intent = new Intent(this,Setting.class);
        startActivityForResult(intent, SETTING_REQUEST_CODE);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        LinearLayout ll = (LinearLayout) findViewById(R.id.SubjectLayout);
        RelativeLayout rl = new RelativeLayout(this);
        //rlpButton
        RelativeLayout.LayoutParams rlpButton = new RelativeLayout.LayoutParams(1000, 160);
        Button EventButton = new Button(this);
        EventButton.setAllCaps(false);
        //rlpSetting
        RelativeLayout.LayoutParams rlpSetting = new RelativeLayout.LayoutParams(80, 80);
        ImageButton ButtonSetting = new ImageButton(this);
        ButtonSetting.setBackgroundResource(R.drawable.wdot);
        //rlpBackground
        RelativeLayout.LayoutParams rlpBackground = new RelativeLayout.LayoutParams(160, 160);
        ImageView Logo = new ImageView(this);
        if (resultCode == 6) {
            if (requestCode == CREATE_SUBJECT_REQUEST_CODE) {
                //set id
                int id = data.getIntExtra("SubjectId", -1);
                DBid = id;
                ButtonId = DBid + 1;
                SettingId = DBid + 100000;
                LayoutId = DBid + 200000;
                LogoBackId = DBid + 300000;
                EventButton.setId(ButtonId);
                rl.setId(LayoutId);
                ButtonSetting.setId(SettingId);
                Logo.setId(LogoBackId);
                //
                //set logo color
                //LogoBackString = SubjectDb.retrieveSubjectBGM(id);
                //
                /*switch (LogoBackString) {
                    case "Red": Logo.setBackgroundResource(R.drawable.redb);
                        break;
                    case "Blue": Logo.setBackgroundResource(R.drawable.blueb);
                        break;
                    case "Yellow": Logo.setBackgroundResource(R.drawable.goldbuttom);
                        break;
                    case "Green": Logo.setBackgroundResource(R.drawable.greenb);
                        break;
                    case "Pink": Logo.setBackgroundResource(R.drawable.pinkb);
                        break;
                    case "Purple": Logo.setBackgroundResource(R.drawable.purpleb);
                        break;
                    default: Logo.setBackgroundResource(R.drawable.wbuttom);
                }
                */
                //
                //set logo image
                System.out.println(id);
                LogoImageString = SubjectDb.retrieveSubjectLogo(id);
                //
                //set event button attribute
                EventButton.setTextColor(Color.WHITE);
                EventButton.setTextSize(25);
                EventButton.setGravity(Gravity.LEFT);
                EventButton.setPadding(10,0,0,0);
                EventButton.setText(SubjectDb.searchSubjectName(DBid));
                EventButton.setGravity(Gravity.LEFT);
                EventButton.setBackgroundColor(Color.TRANSPARENT);
                rlpButton.addRule(RelativeLayout.CENTER_HORIZONTAL);
                rlpButton.setMargins(0, 70, 0, 70);
                rlpSetting.addRule(RelativeLayout.ALIGN_RIGHT, EventButton.getId());
                rlpSetting.setMargins(200, 70, 40, 70);
                rlpSetting.addRule(RelativeLayout.CENTER_VERTICAL);
                rlpBackground.setMargins(5,70,0,0);
                rlpBackground.addRule(RelativeLayout.ALIGN_PARENT_LEFT, EventButton.getId());
                rlpBackground.addRule(RelativeLayout.CENTER_VERTICAL);
                ButtonSetting.setElevation(10);
                Logo.setElevation(10);
                //
                //add view
                rl.addView(Logo,rlpBackground);
                rl.addView(EventButton, rlpButton);
                rl.addView(ButtonSetting, rlpSetting);
                ll.addView(rl);
                //
                EventButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        if (! mIsShowing1 && ! mIsShowing2) {
                            ButtonId = v.getId();
                            DBid = ButtonId - 1;
                            SettingId = DBid + 100000;
                            LayoutId = DBid + 200000;
                            LogoBackId = DBid + 300000;
                            openEvent();
                        }
                    }
                });
                ButtonSetting.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        if (! mIsShowing1 && ! mIsShowing2) {
                            SettingId = v.getId();
                            DBid = SettingId - 100000;
                            ButtonId = DBid + 1;
                            LayoutId = DBid + 200000;
                            LogoBackId = DBid + 300000;
                            DeleteSubjectPopup(v);
                        }
                    }
                });
            }
            if (requestCode == CHECK_SUBJECT_REQUEST_CODE){
                int id = data.getIntExtra("SubjectId", -1);
                DBid = id;
                ButtonId = DBid + 1;
                SettingId = DBid + 100000;
                LayoutId = DBid + 200000;
                TemporaryButton = (Button) findViewById(ButtonId);
                TemporaryButton.setText(SubjectDb.searchSubjectName(DBid));
            }
        }
        if (resultCode == 1){
            if (requestCode == SETTING_REQUEST_CODE){
                //UserNameString = UserDb.retrieveUserLocation();
                UserName.setText(UserNameString);
            }

        }
    }

    public void DeleteSubjectPopup(View view) {
        if (popupWindow1 == null) {
            DeleteSubjectInitPopup();
        }
        if (!mIsShowing1) {
            params1.alpha = 0.3f;
            getWindow().setAttributes(params1);
            popupWindow1.showAtLocation(findViewById(R.id.Main), Gravity.BOTTOM, 0, 0);
            mIsShowing1 = true;
        }
    }
    private void DeleteSubjectInitPopup() {
        View pop = View.inflate(this, R.layout.delete_subject_pop, null);
        popupWindow1 = new PopupWindow(pop, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow1.setTouchable(true);
        popupWindow1.setOutsideTouchable(false);
        popupWindow1.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popupWindow1.setAnimationStyle(R.style.anim_menu_bottombar);
        mIsShowing1 = false;
    }
    public void DeleteSubjectCheckSubject(View view) {
        if (popupWindow1 != null && mIsShowing1) {
            popupWindow1.dismiss();
            mIsShowing1 = false;
            params1.alpha = 1f;
            getWindow().setAttributes(params1);
            openSubject();
        }
    }
    public void DeleteSubjectDismiss(View view) {
        if (popupWindow1 != null && mIsShowing1) {
            popupWindow1.dismiss();
            mIsShowing1 = false;
            params1.alpha = 1f;
            getWindow().setAttributes(params1);
        }
    }
    public void SureDeleteSubjectPopup(View view) {
        popupWindow1.dismiss();
        if (popupWindow2 == null) {
            SureDeleteSubjectInitPopup();
        }
        if (!mIsShowing2) {
            params2.alpha = 0.3f;
            getWindow().setAttributes(params2);
            popupWindow2.showAtLocation(findViewById(R.id.Main), Gravity.CENTER, 0, 0);
            mIsShowing2 = true;
        }
    }

    private void SureDeleteSubjectInitPopup() {
        View pop = View.inflate(this, R.layout.delete_subject_sure_or_not, null);
        popupWindow2 = new PopupWindow(pop, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow2.setTouchable(true);
        popupWindow2.setOutsideTouchable(false);
        popupWindow2.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popupWindow2.setAnimationStyle(R.style.anim_menu_bottombar);
        mIsShowing2 = false;
    }

    public void SureDeleteSubjectDismiss(View view) {
        if (popupWindow2 != null && mIsShowing2) {
            popupWindow2.dismiss();
            mIsShowing2 = false;
            params2.alpha = 1f;
            getWindow().setAttributes(params2);
            popupWindow1.dismiss();
            mIsShowing1 = false;
            params1.alpha = 1f;
            getWindow().setAttributes(params1);
            TemporaryLayout = (RelativeLayout) findViewById(LayoutId);
            ViewGroup layout = (ViewGroup) TemporaryLayout.getParent();
            layout.removeView(TemporaryLayout);
            String subjectName = SubjectDb.searchSubjectName(DBid);
            List<Integer> idList= EventDb.searchDBWithSubject(subjectName);
            for(int i = 0; i < idList.size();i++) {
                EventDb.deleteEvent(idList.get(i));
            }
            SubjectDb.deleteSubject(DBid);
        }
    }

    public void CancelDeleteSubjectDismiss(View view) {
        if (popupWindow2 != null && mIsShowing2) {
            popupWindow2.dismiss();
            mIsShowing2 = false;
            params2.alpha = 1f;
            getWindow().setAttributes(params2);
            popupWindow1.dismiss();
            mIsShowing1 = false;
            params1.alpha = 1f;
            getWindow().setAttributes(params1);
        }
    }
}
