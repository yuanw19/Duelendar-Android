package com.example.duelendar_version1.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SubjectDatabase extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 6;
    private static final String DATABASE_NAME = "subject.database";
    private static final String TABLE_NAME = "subject_table";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_SUBJECT = "subject";
    private static final String COLUMN_LOGO = "logo";
    private static final String COLUMN_BGC = "bgc";
    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table subject_table (id integer primary key   ," +
            "subject text , logo text, bgc text);";

    public SubjectDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    public void insertSubject(String newSubject, String logo, String bgc) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        String query = "select * from subject_table";
        Cursor cursor = db.rawQuery(query, null);
        int LastId = getLatestId() + 1;
        values.put(COLUMN_ID, LastId);
        values.put(COLUMN_SUBJECT, newSubject);
        values.put(COLUMN_LOGO, logo);
        values.put(COLUMN_BGC, bgc);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public boolean whetherSubjectNameExist(String subjectName) {
        db = this.getReadableDatabase();
        String query = "SELECT subject from " + TABLE_NAME;
        boolean exist = false;
        Cursor cursor = db.rawQuery(query, null);
        if(cursor.moveToFirst()) {
            do{
                String currSubjectName = cursor.getString(cursor.getColumnIndex("subject"));
                if(currSubjectName.equals(subjectName)) {
                    exist = true;
                }
            }while(cursor.moveToNext());
        }
        return exist;
    }

    public void updateSubject(int id, String newSubject, String logo, String bgc) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_SUBJECT, newSubject);
        values.put(COLUMN_LOGO, logo);
        values.put(COLUMN_BGC, bgc);
        db.update(TABLE_NAME, values, "id = "+id, null);
        db.close();
    }

    // retrieves the subject name based on ID
    public String searchSubjectName(int id) {
        db = this.getReadableDatabase();
        String query = "select subject, id from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String result = "";
        int currId;
        if(cursor.moveToFirst()) {
            do {
                currId = cursor.getInt(cursor.getColumnIndex("id"));
                if(currId == id) {
                    result = cursor.getString(cursor.getColumnIndex("subject"));
                }
            } while(cursor.moveToNext());
        }
        return result;
    }

    //retrieves the logo image String
    public String retrieveSubjectLogo(int id) {
        db = this.getReadableDatabase();
        String query = "select logo from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String result = "";
        int currId;
        if(cursor.moveToFirst()) {
            do {
                currId = cursor.getInt(cursor.getColumnIndex("id"));
                if(currId == id) {
                    result = cursor.getString(cursor.getColumnIndex("logo"));
                }
            } while(cursor.moveToNext());
        }
        return result;
    }

    //retrieves the logo background String
    public String retrieveSubjectBGM(int id) {
        db = this.getReadableDatabase();
        String query = "select logo from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String result = "";
        if(cursor.moveToFirst()) {
            do {
                int currId = cursor.getInt(cursor.getColumnIndex("id"));
                if(currId == id) {
                    result = cursor.getString(cursor.getColumnIndex("bgc"));
                }
            } while(cursor.moveToNext());
        }
        return result;
    }

    public int getProfilesCount() {
        db = this.getReadableDatabase();
        String countQuery = "SELECT * from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count - 1;
    }

    public void deleteSubject(int id) {
        db = getWritableDatabase();
        db.delete(TABLE_NAME, COLUMN_ID + "=" + id, null);
    }

    public int getLatestId() {
        db = this.getReadableDatabase();
        String query = "select id from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        int lastId = 0;
        if(cursor.moveToFirst()) {
            do {
                if(cursor.moveToLast()) {
                    lastId = cursor.getInt(cursor.getColumnIndex("id"));
                }
            } while(cursor.moveToNext());
        }
        return lastId;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}