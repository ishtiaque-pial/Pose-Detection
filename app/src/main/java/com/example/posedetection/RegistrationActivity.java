package com.example.posedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    private EditText email,password;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
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
                } else {
                    SharedHelper.putKey(RegistrationActivity.this,"email",email.getText().toString().trim());
                    SharedHelper.putKey(RegistrationActivity.this,"password",email.getText().toString().trim());
                    Toast.makeText(RegistrationActivity.this, "Registration Successfully ", Toast.LENGTH_SHORT).show();
                    onBackPressed();
                }
            }
        });
    }
}
