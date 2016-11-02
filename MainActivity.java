package com.example.android.docplusplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText hospid = (EditText) findViewById(R.id.hospid);
        EditText reg1 = (EditText) findViewById(R.id.reg1);
        EditText otname =(EditText) findViewById(R.id.otname);
        EditText otemail = (EditText) findViewById(R.id.otemail);
        EditText otpassword = (EditText) findViewById(R.id.otpassword);
        EditText otcnfpassword = (EditText) findViewById(R.id.otcnfpassword);
        EditText otage = (EditText) findViewById(R.id.otage);
        EditText otdate = (EditText) findViewById(R.id.otdate);
        EditText otaddress = (EditText) findViewById(R.id.otaddress);
        EditText mob1 = (EditText) findViewById(R.id.mob1);
        EditText otmobile = (EditText) findViewById(R.id.otmobile);
        EditText deg1 = (EditText) findViewById(R.id.deg1);
        Button sign = (Button) findViewById(R.id.sign);
        RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
        int checked = rg.getCheckedRadioButtonId();

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main3Activity.class));
            }
        });
    }
}
