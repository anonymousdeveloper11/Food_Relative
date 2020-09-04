package com.example.foodrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    TextView txtview;
    Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txtview = findViewById(R.id.txtview1);
        butt = findViewById(R.id.btnsignin);

        txtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpActivity.this, "Log In", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignUpActivity.this, SignIn_Activity.class);
                startActivity(intent);
            }
        });

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpActivity.this, "Register", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SignUpActivity.this,SignIn_Activity.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().setTitle("Sign Up");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
    }
