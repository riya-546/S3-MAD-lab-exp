package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3;
    EditText e1;
    int f,se,re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(id.textView);
        t2=findViewById(R.id.textView2);
        e1=findViewById(R.id.textView3);

        f=Integer.parseInt(t1.getText().toString());
        se=Integer.parseInt(t2.getText().toString());

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(e1.getText().toString())){

                    Toast.makeText(getApplicationContext(),"Empty Box",Toast.LENGTH_LONG).show();

                }
                else {
                    re=Integer.parseInt(e1.getText().toString());

                    if((f+se)==re){

                        Toast.makeText(getApplicationContext(),"You win",Toast.LENGTH_LONG).show();


                    }else {

                        Toast.makeText(getApplicationContext(),"you lose",Toast.LENGTH_LONG).show();

                    }

                }

            }
        });







    }
}