package com.androidtest.carteiradeclientes.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Cleiton on 27/12/2017.
 */

public class DadosOpenHelper extends SQLiteOpenHelper {


    public DadosOpenHelper(Context context) {
        super(context, "Dados", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptDDL.getCreateTableCliente());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
