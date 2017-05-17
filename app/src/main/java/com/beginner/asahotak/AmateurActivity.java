package com.beginner.asahotak;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class AmateurActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    RadioGroup mRadioGroup1, mRadioGroup2, mRadioGroup3, mRadioGroup4;
    Button mFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amateur);

        mFinish = (Button) findViewById(R.id.finish);
        mRadioGroup1 = (RadioGroup) findViewById(R.id.mRadioGroup1);
        mRadioGroup2 = (RadioGroup) findViewById(R.id.mRadioGroup2);
        mRadioGroup3 = (RadioGroup) findViewById(R.id.mRadioGroup3);
        mRadioGroup4 = (RadioGroup) findViewById(R.id.mRadioGroup4);

        mFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(AmateurActivity.this, ExitActivity.class);
                startActivity(i);
            }

        });
    }

    public void onRadioButton(View view){
        Boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.bandung:
                if (checked)
                    tampilDialog();
                break;

            case R.id.depok:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.cianjur:
                if (checked)
                    jawabanSalah();
                break;

            case R.id.r34:
                if (checked)
                    tampilDialog();
                break;
            case R.id.r33:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.r32:
                if (checked)
                    jawabanSalah();
                break;

            case R.id.pamansam:
                if (checked)
                    tampilDialog();
                break;
            case R.id.bibisam:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.nyonyasam:
                if (checked)
                    jawabanSalah();
                break;

            case R.id.banten:
                if (checked)
                    tampilDialog();
                break;
            case R.id.jakarta:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.sumaterautara:
                if (checked)
                    jawabanSalah();
                break;
        }


    }

    public void tampilDialog() {

        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selamat !!!");
        builder.setMessage("Jawaban anda benar");
        builder.setPositiveButton("OKE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AmateurActivity.this, "Selamat", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("ULANGI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });

        builder.create().show();
    }

    public void jawabanSalah(){

        Toast.makeText(this, "Jawaban anda Salah", Toast.LENGTH_SHORT).show();

    }

}
