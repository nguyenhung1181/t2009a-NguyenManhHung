package com.example.nguyenmanhhung;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {StudentEntity.class}, version = 1)
public abstract class DBstudent extends RoomDatabase {
    private static DBstudent appDatabase;

    public abstract Student studentInterface();

    public static DBstudent getAppDatabase(Context context) {
        if (appDatabase == null) {
            appDatabase = Room.databaseBuilder(context,
                    DBstudent.class, "Created!").allowMainThreadQueries().build();
        }
        return appDatabase;
    }
}



