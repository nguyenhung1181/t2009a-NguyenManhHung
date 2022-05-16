package com.example.nguyenmanhhung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button button;

    EditText username, gmail, editText;

    Spinner spinner;

    // one boolean variable to check whether all the text fields
    // are filled by the user, properly or not.
    boolean isAllFieldsChecked = false;
    DBstudent db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = DBstudent.getAppDatabase(this);

        button = findViewById(R.id.btsubmit);
        username = findViewById(R.id.username);
        gmail = findViewById(R.id.gmail);
        button.setOnClickListener(view -> {
            StudentEntity student = new StudentEntity();
            student.name = username.getText().toString();
            student.email = gmail.getText().toString();
            student.content = editText.getText().toString();
            db.studentInterface().insertStudent(student);
        });
    }

    private boolean CheckAllFields() {
        if (username.length() == 0) {
            username.setError("This field is required");
            return false;
        }

        if (gmail.length() == 0) {
            gmail.setError("This field is required");
            return false;
        }

        return true;
    }
}