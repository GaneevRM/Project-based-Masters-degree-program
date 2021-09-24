package com.ganeevrm.prototype_0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "maindatabase.db";
    private static final int SCHEMA = 1;

    public static final String TABLE_PROBLEMS = "problems";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_CODE = "code";
    public static final String COLUMN_DEFECT = "defect";
    public static final String COLUMN_REASON = "reason";

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME, null, SCHEMA);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE problems (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_CODE + " INTEGER, " + COLUMN_DEFECT + " TEXT, " + COLUMN_REASON + " INTEGER);");

        db.execSQL("INSERT INTO " + TABLE_PROBLEMS + " (" + COLUMN_CODE + ", " + COLUMN_DEFECT + ", " + COLUMN_REASON + ") VALUES (100, 'Нет загрузки с жёсткого диска', 3);");
        db.execSQL("INSERT INTO " + TABLE_PROBLEMS + " (" + COLUMN_CODE + ", " + COLUMN_DEFECT + ", " + COLUMN_REASON + ") VALUES (112, 'Неисправность видеокарты', 5);");
        db.execSQL("INSERT INTO " + TABLE_PROBLEMS + " (" + COLUMN_CODE + ", " + COLUMN_DEFECT + ", " + COLUMN_REASON + ") VALUES (146, 'Перегрев процессора', 10);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PROBLEMS);
        onCreate(db);
    }
}
