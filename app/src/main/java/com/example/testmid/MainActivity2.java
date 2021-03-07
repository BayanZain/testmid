package com.example.testmid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText nameT = (EditText)findViewById(R.id.name);
        EditText birthT = (EditText)findViewById(R.id.birth);
        TextView result = (TextView)findViewById(R.id.result);
        final RadioButton male = (RadioButton)findViewById(R.id.radioButton1);
        final RadioButton female = (RadioButton)findViewById(R.id.radioButton2);
        Button submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameT.getText().toString();
                int birth = Integer.parseInt(birthT.getText().toString());
                if(male.isChecked()){
                    gender = "Mr";
                }
                if(female.isChecked()){
                    gender = "Miss";
                }
                result.setText("Hello "+gender+" "+name+" You're "+birth+" years old.");
            }
        });

        Button act1F2 = (Button)findViewById(R.id.act1F2);
        Button act3F2 = (Button)findViewById(R.id.act3F2);

        act1F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
        act3F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });
    }
}