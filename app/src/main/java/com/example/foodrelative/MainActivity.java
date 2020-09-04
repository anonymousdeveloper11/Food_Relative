package com.example.foodrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button login, register;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        login = findViewById(R.id.btnlogin);
        register=findViewById(R.id.btnregister);

        login.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MainActivity.this,SignIn_Activity.class);
                        startActivity(intent);

                }
        });



        register.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Register", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(intent);
                }

        });
        }
        }