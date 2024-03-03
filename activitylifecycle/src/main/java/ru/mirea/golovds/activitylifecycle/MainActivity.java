package ru.mirea.golovds.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private EditText editText;

    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate, Activity создано");

        editText = findViewById(R.id.editTextText);
        editText.setText("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart, Activity становится видимым");

        editText = findViewById(R.id.editTextText);
        editText.setText("onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume, Activity получает фокус");

        editText = findViewById(R.id.editTextText);
        editText.setText("onResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow");

        //editText = findViewById(R.id.editTextText);
        //editText.setText("onAttachedToWindow");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause, Activity приостановлено");

        editText = findViewById(R.id.editTextText);
        editText.setText("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop, Activity остановлено");

        editText = findViewById(R.id.editTextText);
        editText.setText("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");

        editText = findViewById(R.id.editTextText);
        editText.setText("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy, Activity уничтожено");

        editText = findViewById(R.id.editTextText);
        editText.setText("onDestroy");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "onDetachedFromWindow");

        editText = findViewById(R.id.editTextText);
        editText.setText("onDetachedFromWindow");
    }
}