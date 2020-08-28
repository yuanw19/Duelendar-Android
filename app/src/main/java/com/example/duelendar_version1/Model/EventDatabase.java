package com.example.duelendar_version1.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class EventDatabase extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 6;
    private static final String DATABASE_NAME = "events.database";
    private static final String TABLE_NAME = "events";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_EVENTNAME = "eventname";
    private static final String COLUMN_CATEGORY = "eventcategory";
    private static final String COLUMN_DUEDATE = "duedate";
    private static final String COLUMN_NOTIFICATION= "notification";
    private static final String COLUMN_ORIGINCOUNTRY = "origin";
    private static final String COLUMN_DESTINATIONCOUNTRY = "destination";
    private static final String COLUMN_MEMO = "memo";
    private static final String COLUMN_STATUS = "status";
    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table events (id integer primary key   ," +
            "eventname text , eventcategory text , duedate text , "
            + "notification text, origin text, destination text, memo text, status text);";

    public EventDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
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

    public void insertEvent(Event event) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        String query = "select * from events";
        Cursor cursor = db.rawQuery(query, null);
        int lastid = getLatestId() + 1;
        values.put(COLUMN_ID, lastid);
        values.put(COLUMN_EVENTNAME, event.getName());
        values.put(COLUMN_CATEGORY, event.getCategory());
        values.put(COLUMN_DUEDATE, event.getDueDate());
        values.put(COLUMN_NOTIFICATION, event.getNotify());
        values.put(COLUMN_ORIGINCOUNTRY, event.getLocatedCountry());
        values.put(COLUMN_DESTINATIONCOUNTRY, event.getForeignCountry());
        values.put(COLUMN_MEMO, event.getMemo());
        values.put(COLUMN_STATUS, event.getStatus());
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public void upDateEvent(int id, String eventName, String category, String duedate,
                            String notification, String originCountry, String DestinationCountry,
                            String memo, String status) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_EVENTNAME, eventName);
        values.put(COLUMN_CATEGORY, category);
        values.put(COLUMN_DUEDATE, duedate);
        values.put(COLUMN_NOTIFICATION, notification);
        values.put(COLUMN_ORIGINCOUNTRY, originCountry);
        values.put(COLUMN_DESTINATIONCOUNTRY, DestinationCountry);
        values.put(COLUMN_MEMO, memo);
        values.put(COLUMN_STATUS, status);

        db.update(TABLE_NAME, values, "id = "+id, null);
        db.close();
    }
    //return an information array based on the event id
    public String[] searchInfo(int id) {
        db = this.getReadableDatabase();
        String query = "select eventname, eventcategory, duedate, notification, origin, destination," +
                "memo, status, id from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String eventName;
        String eventCategory;
        String dueDate;
        String notification;
        String origin;
        String destination;
        String memo;
        String status;
        int currId;
        String[] arr = new String[10];
        if(cursor.moveToFirst()) {
            do {
                currId = cursor.getInt(cursor.getColumnIndex("id"));
                if(currId == id) {
                    eventName = cursor.getString(cursor.getColumnIndex("eventname"));
                    arr[0] = eventName;
                    eventCategory = cursor.getString(cursor.getColumnIndex("eventcategory"));
                    arr[1] = eventCategory;
                    dueDate = cursor.getString(cursor.getColumnIndex("duedate"));
                    arr[2] = dueDate;
                    notification = cursor.getString(cursor.getColumnIndex("notification"));
                    arr[3] = notification;
                    origin = cursor.getString(cursor.getColumnIndex("origin"));
                    arr[4] = origin;
                    destination = cursor.getString(cursor.getColumnIndex("destination"));
                    arr[5] = destination;
                    memo = cursor.getString(cursor.getColumnIndex("memo"));
                    arr[6] = memo;
                    status = cursor.getString(cursor.getColumnIndex("status"));
                    arr[7] = status;
                }
            } while(cursor.moveToNext());
        }
        return arr;
    }
    //return an id array given the subject
    public List<Integer> searchDBWithSubject(String eventCategory) {
        db = this.getReadableDatabase();
        String query = "select eventcategory,  id from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String currCategory;
        List<Integer> allId = new ArrayList<>();
        if(cursor.moveToFirst()) {
            do {
                currCategory = cursor.getString(cursor.getColumnIndex("eventcategory"));
                if(currCategory.equals(eventCategory)) {
                    allId.add(cursor.getInt(cursor.getColumnIndex("id")));
                }
            } while(cursor.moveToNext());
        }
        return allId;
    }
    public List<Event> retrieveallEvents() {
        db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from events", null);
        ArrayList<Event> result = new ArrayList<>();
        if(cursor.moveToFirst()) {
            while(!cursor.isAfterLast()) {
                String eventName = cursor.getString(cursor.getColumnIndex(COLUMN_EVENTNAME));
                String eventCategory = cursor.getString(cursor.getColumnIndex(COLUMN_CATEGORY));
                String eventDueDate = cursor.getString(cursor.getColumnIndex(COLUMN_DUEDATE));
                String eventNotification = cursor.getString(cursor.getColumnIndex(COLUMN_NOTIFICATION));
                String eventOriginCountry = cursor.getString(cursor.getColumnIndex(COLUMN_ORIGINCOUNTRY));
                String eventDestinationCountry = cursor.getString(cursor.getColumnIndex(COLUMN_DESTINATIONCOUNTRY));
                String eventMemo = cursor.getString(cursor.getColumnIndex(COLUMN_MEMO));
                String eventStatus = cursor.getString(cursor.getColumnIndex(COLUMN_STATUS));
                int eventId = cursor.getInt(cursor.getColumnIndex(COLUMN_ID));
                Event event = new Event(eventName, eventCategory,eventMemo,eventNotification,eventDueDate,
                        eventDestinationCountry,eventOriginCountry, eventStatus, eventId);
                result.add(event);
                cursor.moveToNext();
            }
        }
        return result;
    }

    public int getProfilesCount() {
        db = this.getReadableDatabase();
        String countQuery = "SELECT * FROM " + TABLE_NAME;
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count - 1;
    }

    public void deleteEvent(int id) {
        db = getWritableDatabase();

        db.delete(TABLE_NAME, COLUMN_ID + "=" + id, null);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
