package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText logininput = findViewById(R.id.login);
        EditText passwordinput = findViewById(R.id.parol);
        Button loginButton = findViewById(R.id.button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = logininput.getText().toString().trim();
                String enteredPassword = passwordinput.getText().toString().trim();
                if (login.equals("pochta@mail.ru") && enteredPassword.equals("123")) {
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid login or password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
