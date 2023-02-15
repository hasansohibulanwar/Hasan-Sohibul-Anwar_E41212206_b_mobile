package com.sohibLmj.layoutweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editUsername,editPasswoard;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUsername = findViewById(R.id.usernametxt);
        editPasswoard = findViewById(R.id.usernametxt);
        btnLogin = findViewById(R.id.loginbtn);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dataUsername = editUsername.getText().toString();
                Toast.makeText(MainActivity.this, "Datanya : "+dataUsername,Toast.LENGTH_LONG).show();

            }
        });
    }
}