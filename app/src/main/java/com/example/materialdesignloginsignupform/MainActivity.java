package com.example.materialdesignloginsignupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_reg(View view){
        startActivity(new Intent(getApplicationContext(),Signup_form.class));
    }

    public void btn_login(View view){
        startActivity(new Intent(getApplicationContext(),Login_form.class));
    }
}
