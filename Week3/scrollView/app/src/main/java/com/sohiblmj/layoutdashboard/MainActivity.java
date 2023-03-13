package com.sohiblmj.layoutdashboard;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inisialisasi dan Deklarasi TextView
        TextView textView = findViewById(R.id.textView);

        //Menambahkan method Scrolling agar TextView dapat di Scroll
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}