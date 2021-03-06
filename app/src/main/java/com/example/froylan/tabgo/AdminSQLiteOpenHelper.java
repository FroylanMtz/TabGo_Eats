package com.example.froylan.tabgo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {


    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos) {

        BaseDeDatos.execSQL("create table usuarios(correo text primary key, nombre text, telefono text, contrasena text, direccion text)");
        BaseDeDatos.execSQL("create table ordenes(id text primary key, nombre text, direccion text )");
        BaseDeDatos.execSQL("create table platillos(id text, nombre text, precio int, cantidad int)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}