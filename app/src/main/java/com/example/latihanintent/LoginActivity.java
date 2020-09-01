package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_login);
        final EditText txt_uname = (EditText) findViewById(R.id.username);
        final EditText txt_pass = (EditText) findViewById(R.id.password);
        Button btn_login = (Button) findViewById(R.id.signin);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,LoggedActivity.class);
                i.putExtra("name", txt_uname.getText());
                i.putExtra("name", txt_pass.getText());
                startActivity(i);
            }
        });
    }
}
