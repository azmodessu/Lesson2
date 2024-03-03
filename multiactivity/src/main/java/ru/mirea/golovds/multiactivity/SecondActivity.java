package ru.mirea.golovds.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i(TAG, "onCreate, Activity2 создано");

        TextView textView = findViewById(R.id.textView2);

        Bundle arguments = getIntent().getExtras();

        if(arguments!=null) {
            String text = arguments.get("string").toString();
            textView.setText(text);
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart, Activity2 становится видимым");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume, Activity2 получает фокус");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause, Activity2 приостановлено");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop, Activity2 остановлено");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy, Activity2 уничтожено");
    }

}