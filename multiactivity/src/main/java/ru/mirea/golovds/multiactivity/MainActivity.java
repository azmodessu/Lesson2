package ru.mirea.golovds.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate, Activity создано");
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onClickSend(View view) {
        EditText text = findViewById(R.id.editTextText);
        String string = text.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("string", string);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart, Activity становится видимым");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume, Activity получает фокус");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause, Activity приостановлено");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop, Activity остановлено");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy, Activity уничтожено");
    }
}