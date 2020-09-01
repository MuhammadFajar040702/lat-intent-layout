package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoggedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_logged);
//        final TextView uname =(TextView) findViewById(R.id.uname);
//        final TextView pass =(TextView) findViewById(R.id.pass);
//        Bundle bundle = getIntent().getExtras();
//        String s =bundle.getString("name");
//        uname.setText(s);
    }
}
