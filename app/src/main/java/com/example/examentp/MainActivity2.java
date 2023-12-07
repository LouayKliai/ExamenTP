package com.example.examentp;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText ageValue, heightValue;
    String sex;
    Button calcButton;
    TextView  TextViewResult;
    String checkedButton;
    double resFinal;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        checkedButton = getIntent().getStringExtra("checked");
        ageValue = findViewById(R.id.age);
        heightValue = findViewById(R.id.height);
        calcButton = findViewById(R.id.calculate);
        TextViewResult = findViewById(R.id.Result);

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ageValue.getText().length() == 0 && heightValue.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill the blank  ", Toast.LENGTH_SHORT).show();
                } else {
                    if (checkedButton.equals("M")) {
                        resFinal = ((Double.parseDouble(heightValue.getText().toString()) - 100 + Double.parseDouble(ageValue.getText().toString()) / 10) * 9.5);
                    } else {
                        resFinal = ((Double.parseDouble(heightValue.getText().toString()) - 100 + Double.parseDouble(ageValue.getText().toString()) / 10) * 9);
                    }
                    TextViewResult.setText("Your ideal weight is : " +String.format("%.2f", resFinal));
                }
            }
        });
    }
}



