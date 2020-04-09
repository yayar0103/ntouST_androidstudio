package com.example.ntoust;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MantainActivity extends AppCompatActivity {

    private FloatingActionButton fab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantain);

        fab3 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MantainActivity.this, AddMantainActivity.class);
                startActivity(intent);
            }
        });
    }
}
