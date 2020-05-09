package com.example.posedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    private EditText email,password;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        email = findViewById(R.id.emailEdit);
        password = findViewById(R.id.editPassword);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().trim().isEmpty()) {
                    email.setError("Required");
                } else if (password.getText().toString().trim().isEmpty()) {
                    password.setError("Required");
                } else if (!email.getText().toString().trim().equals(SharedHelper.getKey(SignInActivity.this,"email")) && !password.getText().toString().trim().equals(SharedHelper.getKey(SignInActivity.this,"password"))){
                    Toast.makeText(SignInActivity.this, "Wrong email or password", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(SignInActivity.this, "Sign in Successfully ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignInActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
