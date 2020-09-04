package com.example.foodrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn_Activity extends AppCompatActivity {
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);


        btn = findViewById(R.id.btnsignin);
        txt = findViewById(R.id.txtview1);




        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn_Activity.this, "Create Account", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignIn_Activity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().setTitle("Sign In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}