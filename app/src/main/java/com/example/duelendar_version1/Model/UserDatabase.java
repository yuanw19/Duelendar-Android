package com.example.duelendar_version1.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UserDatabase extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 6;
    private static final String DATABASE_NAME = "user.database";
    private static final String TABLE_NAME = "user";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_USERBACKGROUND = "userbackground";
    private static final String COLUMN_USERCOLLEGE = "usercollege";
    private static final String COLUMN_USERCOLLEGEIMAGE = "usercollegeimage";
    private static final String COLUMN_USERLOCATION= "userlocation";
    private static final String COLUMN_USERCOLLEGELOCATION = "usercollegelocation";
    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table user (id integer primary key   ," +
            "userbackground text , usercollege text , usercollegeimage tet , "
            + "userlocation text, usercollegelocation text);";

    public UserDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    public void insertUser(User user) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        String query = "select * from user";
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();
        values.put(COLUMN_ID, count);
        values.put(COLUMN_USERBACKGROUND, user.getUserBackground());
        values.put(COLUMN_USERCOLLEGE, user.getUserCollege());
        values.put(COLUMN_USERCOLLEGEIMAGE, user.getUserCollegeImage());
        values.put(COLUMN_USERLOCATION, user.getUserLocation());
        values.put(COLUMN_USERCOLLEGELOCATION, user.getCollegeLocation());
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public void updateUser(int id, String userBackground, String userCollege,
                           String userCollegeImage, String userLocation, String userCollegeLocation) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_USERBACKGROUND, userBackground);
        values.put(COLUMN_USERCOLLEGE, userCollege);
        values.put(COLUMN_USERCOLLEGEIMAGE, userCollegeImage);
        values.put(COLUMN_USERLOCATION, userLocation);
        values.put(COLUMN_USERCOLLEGELOCATION, userCollegeLocation);

        db.update(TABLE_NAME, values, "id = "+id, null);
        db.close();
    }
    //retrieves user location
    public String retrieveUserLocation() {
        db = this.getReadableDatabase();
        String query = "select * from user";
        Cursor cursor = db.rawQuery(query, null);
        String Ulocation = null;
        if (cursor.moveToFirst()) {
            while (!cursor.isAfterLast()) {
                Ulocation = cursor.getString(cursor.getColumnIndex(COLUMN_USERLOCATION));
            }
        }
        return Ulocation;
    }

    //retrives the background image
    public String retrieveUserBackground() {
        db = this.getReadableDatabase();
        String query = "select * from user";
        Cursor cursor = db.rawQuery(query, null);
        String background = null;
        if(cursor.moveToFirst()) {
            background = cursor.getString(cursor.getColumnIndex(COLUMN_USERBACKGROUND));

        }
        return background;
    }

    //retrieves the college image
    public String retrieveUserCollegeImage() {
        db = this.getReadableDatabase();
        String query = "select * from user";
        Cursor cursor = db.rawQuery(query, null);
        String collegeImage = null;
        if(cursor.moveToFirst()) {
            while(!cursor.isAfterLast()){
                collegeImage = cursor.getString(cursor.getColumnIndex(COLUMN_USERCOLLEGEIMAGE));
            }
        }
        return collegeImage;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
