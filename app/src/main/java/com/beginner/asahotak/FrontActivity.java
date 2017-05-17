package com.beginner.asahotak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;

public class FrontActivity extends AppCompatActivity {
    Button mAmateur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        mAmateur = (Button) findViewById(R.id.amateur);
        mAmateur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FrontActivity.this, AmateurActivity.class);
                startActivity(i);
            }
        });
    }
}
