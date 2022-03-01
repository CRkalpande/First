package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submit;
    private EditText edittextnumber;
    private EditText edittextnumber2;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.button);
        edittextnumber=findViewById(R.id.editTextNumber);
        edittextnumber2=findViewById(R.id.editTextNumber2);
        result=findViewById(R.id.textView3);

//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                 String i1=edittextnumber.getText().toString();
//                 int a=Integer.parseInt(i1);
//                String i2=edittextnumber2.getText().toString();
//                int b=Integer.parseInt(i2);
//                int c=a+b;
//                result.setText("sum of the numbers:"+c);
//
//
//                Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT).show();
//            }
//        });


    }
    public void sum(View view)
    {
        String i1=edittextnumber.getText().toString();
        int a=Integer.parseInt(i1);
        String i2=edittextnumber2.getText().toString();
        int b=Integer.parseInt(i2);
        int c=a+b;
        result.setText("sum of the numbers:"+c);


        Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT).show();

    }
}