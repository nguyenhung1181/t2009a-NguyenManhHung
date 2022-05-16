package com.example.nguyenmanhhung;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Student {
    @Insert(onConflict = REPLACE)
    void insertStudent(StudentEntity bookmark);
}
