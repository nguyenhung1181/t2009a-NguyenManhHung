package com.example.nguyenmanhhung;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Student")
public class StudentEntity {
    @PrimaryKey(autoGenerate = true) public int id;
    @ColumnInfo(name = "name") public String name;
    @ColumnInfo(name = "email") public String email;
    @ColumnInfo(name = "content") public String content;
}
