package com.example.teaja.SearcherTK;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SQLHeper extends SQLiteOpenHelper {
    public static final String DB_NAME = "Search.db";
    public static final String DB_TABLE = "Search";

    public static final int DB_VERSION = 1;

    public static final String DB_SEARCH_NAME = "Name";

    public SQLHeper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String QueryCreatable = "CREATE TABLE " +DB_TABLE+  "(" +
                "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"+
                "name Text )";
        db.execSQL(QueryCreatable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int j) {
        if (i != j){
            db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE);
            onCreate(db);
        }
    }
    public void addSearchName(TimKiem timKiem){
            SQLiteDatabase database = getReadableDatabase();
            ContentValues values = new ContentValues();
            values.put(DB_SEARCH_NAME, timKiem.getName());

            database.insert(DB_TABLE, null, values);
    }

    public String[] SelectAllData(){
        try {
            String arrData[] = null;
            SQLiteDatabase db;
            db = this.getReadableDatabase();

            String strsql = "SELECT NAME FROM  " + DB_TABLE;
            Cursor cursor = db.rawQuery(strsql, null);
            if (cursor != null){
                if (cursor.moveToFirst()){
                    arrData = new String[cursor.getCount()];
                    int i = 0;
                    do {
                        arrData[i] = cursor.getString(0);
                        i++;
                    }while (cursor.moveToNext());
                }
            }
            cursor.close();
            return arrData;
        }catch (Exception e){
            return null;
        }
    }
}
