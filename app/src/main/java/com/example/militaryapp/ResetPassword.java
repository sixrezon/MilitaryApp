package com.example.militaryapp;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ResetPassword extends AppCompatActivity {

    EditText et_email;
    Button btn_reset_password;
    ProgressBar progressBar;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        et_email = (EditText) findViewById(R.id.f_email);
        btn_reset_password = (Button) findViewById(R.id.f_btn_reset_password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        auth = FirebaseAuth.getInstance();

        btn_reset_password.setOnClickListener(v -> resetPassword());
    }

    private void resetPassword() {
        String email = et_email.getText().toString().trim();

        if (email.isEmpty()) {
            et_email.setError("Заполните поле!");
            et_email.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            et_email.setError("Введите корректную почту!");
            et_email.requestFocus();
            return;
        }

        auth.sendPasswordResetEmail(email).addOnCompleteListener(task -> {
            progressBar.setVisibility(View.VISIBLE);
            if (task.isSuccessful()) {
                Toast.makeText(ResetPassword.this, "Проверьте почту!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(ResetPassword.this, "Неверная почта!", Toast.LENGTH_LONG).show();
            }
            progressBar.setVisibility(View.GONE);
        });
    }
}