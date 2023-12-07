package com.example.examentp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rf,rm;
    //Boolean cheked=true;
    Button accessB;
    String sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=findViewById(R.id.radiog);
        rf=findViewById(R.id.feminin);
        rm=findViewById(R.id.masculine);
        accessB=findViewById(R.id.access);
        accessB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rf.isChecked()){
                    Intent i=new Intent(MainActivity.this,MainActivity2.class);
                    i.putExtra("checked", "F");
                    startActivity(i);
                } else if (rm.isChecked()) {
                    Intent i=new Intent(MainActivity.this,MainActivity2.class);
                     i.putExtra("checked","M");
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"please check one ",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}