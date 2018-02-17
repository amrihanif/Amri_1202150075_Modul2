package com.example.amrihanif.amrihanif_1202150075_modul2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button pesan ;
    RadioGroup grp;
    RadioButton dine, take;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        grp = findViewById(R.id.radioGroup);
        dine = findViewById(R.id.dineIn);
        take = findViewById(R.id.takeAway);
        pesan = findViewById(R.id.button);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = grp.getCheckedRadioButtonId();
                if (selectedId == dine.getId()){
                    Intent a = new Intent(MainActivity.this,DineIn.class);
                    startActivity(a);
                    Toast.makeText(MainActivity.this, "Dine In", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent a = new Intent(MainActivity.this,TakeAway.class);
                    startActivity(a);
                    Toast.makeText(MainActivity.this, "Take Away", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
