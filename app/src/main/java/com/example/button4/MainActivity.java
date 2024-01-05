package com.example.button4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btn=(Button) findViewById(R.id.btn);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go(View view) {
        num++;
        if (num%7==0){
            btn.setText("boom");
        }else{
            btn.setText(num);
        }
    }
}