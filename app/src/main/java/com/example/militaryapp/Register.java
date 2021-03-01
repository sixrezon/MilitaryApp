package com.example.militaryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class Register extends AppCompatActivity implements View.OnClickListener {

    EditText r_login, r_email, r_password;
    Button btn_register;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        r_login = (EditText) findViewById(R.id.r_login);
        r_email = (EditText) findViewById(R.id.r_email);
        r_password = (EditText) findViewById(R.id.r_password);
        btn_register = (Button) findViewById(R.id.r_btn_register);
        btn_register.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.r_btn_register:
                registerUser();
                break;
            default:
                break;
        }
    }

    private void registerUser() {
        String login = r_login.getText().toString().trim();
        String email = r_email.getText().toString().trim();
        String password = r_password.getText().toString().trim();

        if (login.isEmpty()) {
            r_login.setError("Заполните поле!");
            r_login.requestFocus();
            return;
        }
        if (email.isEmpty()) {
            r_email.setError("Заполните поле!");
            r_email.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            r_email.setError("Введите корректную почту!");
            r_email.requestFocus();
            return;
        }
        if (password.isEmpty()) {
            r_password.setError("Заполните поле!");
            r_password.requestFocus();
            return;
        }
        if (password.length() < 6) {
            r_password.setError("Минимальная длина пароль 6 символов!");
            r_password.requestFocus();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            User user = new User(login, email, password);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(Register.this, "Регистрация завершена!", Toast.LENGTH_LONG).show();
                                        //переход в Login layout
                                    } else {
                                        Toast.makeText(Register.this, "Ошибка! Попробуйте ещё раз!", Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
                        } else {
                            Toast.makeText(Register.this, "Ошибка! Попробуйте ещё раз!", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}