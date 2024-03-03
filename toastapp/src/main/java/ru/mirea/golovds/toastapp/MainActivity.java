package ru.mirea.golovds.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText editText = findViewById(R.id.editTextText);
        String stringEditText = editText.getText().toString();
        int length = stringEditText.length();

        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ No 7 ГРУППА БСБО-06-22 Количество символов - " + length,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}