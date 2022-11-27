package com.example.roommates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText input1,input2;
        TextView t1;

        Button b;
        input1=findViewById(R.id.editTextNumber5);
        input2=findViewById(R.id.editTextNumber6);
        t1=findViewById(R.id.textView9);
        TextView t2 = findViewById(R.id.textView10);
        TextView t3 = findViewById(R.id.textView11);
        b=findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int in1,in2,ans;
                float ans1,ans2;
                in1=Integer.parseInt(input1.getText().toString());
                in2=Integer.parseInt(input2.getText().toString());
                ans=in2-in1;
                ans1=ans/2;

                t1.setText("Total used Units:"+ans);
                t2.setText("Shubham,s Bill:"+ans1*8);
                t3.setText("Tejas's Bill: " +ans1*8);







            }
        });

    }
}