package com.cofc.lab2androidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.ResponseCache;

public class MainActivity extends AppCompatActivity {

    private Button btnJump;
    private TextView textView;
    private EditText editText;
    private int REQUEST_CODE = 1;

    private ConstraintLayout constraintLayout;

    private int RESPONSE_CODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.con);

        btnJump = (Button) findViewById(R.id.jumpActivtyBtn);
        textView = findViewById(R.id.textViewHome);

        final Intent i = new Intent(this, SecondActivity.class);

        btnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(i, REQUEST_CODE);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == REQUEST_CODE){
            if (resultCode== RESPONSE_CODE){
                int imgId = data.getExtras().getInt("imgId");
            }
        }

    }


}

