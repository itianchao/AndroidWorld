package com.torkuds.androidworld.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * des:
 * Created by Administrator
 * on 2017/4/10 0010.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "";

    public static final String USER_TABLE_NAME = "";

    public static final String CREATE_TABLE = "create table "
            + USER_TABLE_NAME
            + "(_id varchar(11) primary key, password varchar, name varchar)";

    private int version = 1;

    public DatabaseHelper(Context context, int version) {
        super(context, DATABASE_NAME, null, version);
    }

    public DatabaseHelper(Context context, String name, int version) {
        super(context, name, null, version);
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
