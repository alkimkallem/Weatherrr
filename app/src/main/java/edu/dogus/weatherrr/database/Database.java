package edu.dogus.weatherrr.database;

import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
/**
 * Created by Esra on 28.10.2017.
 */

public class Database extends SQLiteAssetHelper{
    private static final String DATABASE_NAMES = "sqlitedata";
    private static final int DATABASE_VERSION = 3;
    public Database(Context context) {
        super(context, DATABASE_NAMES, null, DATABASE_VERSION);
    }
}
