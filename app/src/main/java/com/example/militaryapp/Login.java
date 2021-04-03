package com.example.militaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity implements View.OnClickListener {

    EditText et_email, et_password;
    Button btn_login, btn_register;
    TextView tv_forgot_pass, tv_guest;
    ProgressBar progressBar;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        et_email = (EditText) findViewById(R.id.email);
        et_password = (EditText) findViewById(R.id.password);
        tv_forgot_pass = (TextView) findViewById(R.id.tv_forgot_pass);
        btn_register = (Button) findViewById(R.id.btn_register);
        btn_login = (Button) findViewById(R.id.btn_login);
        tv_guest = (TextView) findViewById(R.id.tv_guest);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        tv_forgot_pass.setOnClickListener(this);
        btn_register.setOnClickListener(this);
        btn_login.setOnClickListener(this);
        tv_guest.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                userLogin();
                break;
            case R.id.tv_guest:
                startActivity(new Intent(this, MainActivity.class));
                Toast.makeText(Login.this, "Вы вошли как гость!", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_register:
                startActivity(new Intent(this, Register.class));
                break;
            case R.id.tv_forgot_pass:
                startActivity(new Intent(this, ResetPassword.class));
                break;
            default:
                break;
        }
    }

    private void userLogin() {
        String email = et_email.getText().toString().trim();
        String password = this.et_password.getText().toString().trim();

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
        if (password.isEmpty()) {
            this.et_password.setError("Заполните поле!");
            this.et_password.requestFocus();
            return;
        }
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(task -> {

            if (task.isSuccessful()) {
                progressBar.setVisibility(View.GONE);
                startActivity(new Intent(Login.this, MainActivity.class));
            } else {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(Login.this, "Такого пользователя не существует!", Toast.LENGTH_LONG).show();
            }
        });
    }
}