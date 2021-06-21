package com.example.modul3_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Input (View view) {
        EditText inputnamaedit1 = findViewById(R.id.edit1);
        EditText inputnamaedit2 = findViewById(R.id.edit2);

        String namaedit1 = inputnamaedit1.getText().toString();
        Log.d(TAG, namaedit1);
        String namaedit2 = inputnamaedit1.getText().toString();
        Log.d(TAG, namaedit2);

        Intent intent = new Intent(MainActivity.this, SkorActivity.class);
        intent.putExtra("edit1", namaedit1);
        intent.putExtra("edit2", namaedit2);
        startActivity(intent);


    }


}