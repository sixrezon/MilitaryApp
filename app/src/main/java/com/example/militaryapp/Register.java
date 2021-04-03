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
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    EditText et_login, et_email, et_password;
    Button btn_register;
    ProgressBar progressBar;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        et_login = (EditText) findViewById(R.id.r_login);
        et_email = (EditText) findViewById(R.id.r_email);
        et_password = (EditText) findViewById(R.id.r_password);
        btn_register = (Button) findViewById(R.id.r_btn_register);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        btn_register.setOnClickListener(v -> registerUser());
    }

    private void registerUser() {
        String login = et_login.getText().toString().trim();
        String email = et_email.getText().toString().trim();
        String password = et_password.getText().toString().trim();

        if (login.isEmpty()) {
            et_login.setError("Заполните поле!");
            et_login.requestFocus();
            return;
        }
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
            et_password.setError("Заполните поле!");
            et_password.requestFocus();
            return;
        }
        if (password.length() < 6) {
            et_password.setError("Минимальная длина пароль 6 символов!");
            et_password.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    progressBar.setVisibility(View.VISIBLE);
                    if (task.isSuccessful()) {
                        User user = new User(login, email, password);

                        FirebaseDatabase.getInstance().getReference("Users")
                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                .setValue(user).addOnCompleteListener(task1 -> {
                            if (task1.isSuccessful()) {
                                Toast.makeText(Register.this, "Регистрация завершена!", Toast.LENGTH_LONG).show();
                                //переход в Login layout
                            } else {
                                Toast.makeText(Register.this, "Ошибка! Попробуйте ещё раз!", Toast.LENGTH_LONG).show();
                            }
                            progressBar.setVisibility(View.GONE);
                        });
                    } else {
                        Toast.makeText(Register.this, "Ошибка! Попробуйте ещё раз!", Toast.LENGTH_LONG).show();
                        progressBar.setVisibility(View.GONE);
                    }
                });
    }
}