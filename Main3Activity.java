package com.example.android.docplusplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        EditText otage = (EditText) findViewById(R.id.otage);
        EditText otdate = (EditText) findViewById(R.id.otdate);
        EditText otaddress = (EditText) findViewById(R.id.otaddress);
        EditText otmobile = (EditText) findViewById(R.id.otmobile);
        EditText hospid = (EditText) findViewById(R.id.hospid);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText othist = (EditText) findViewById(R.id.othist);
        RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
        int checked = rg.getCheckedRadioButtonId();
        Button otsignup = (Button) findViewById(R.id.otsignup);
        otsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main3Activity.this,Main4Activity.class));
            }
        });
    }
}
