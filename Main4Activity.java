package com.example.android.docplusplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        EditText otname = (EditText) findViewById(R.id.otname);
        EditText otmobile = (EditText) findViewById(R.id.otmobile);
        EditText otrel = (EditText) findViewById(R.id.otrel);
        Button otsignup = (Button) findViewById(R.id.otsignup);
        otsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
