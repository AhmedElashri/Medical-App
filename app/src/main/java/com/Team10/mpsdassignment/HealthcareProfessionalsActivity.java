package com.Team10.mpsdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class HealthcareProfessionalsActivity extends AppCompatActivity {

    LinearLayout ll1, ll2, ll3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthcare_professionals);

        ll1 = findViewById(R.id.ll1);
        ll2 = findViewById(R.id.ll2);
        ll3 = findViewById(R.id.ll3);

        SharedPreferences Shared_pref;
        Shared_pref = getSharedPreferences("docs",MODE_PRIVATE);
        SharedPreferences.Editor editor = Shared_pref.edit();

        ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("id","1");
                editor.commit();
                takeMeThere();
            }
        });

        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("id","2");
                editor.commit();
                takeMeThere();
            }
        });

        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("id","3");
                editor.commit();
                takeMeThere();
            }
        });

        Button btnBackToMenu = findViewById(R.id.btnBackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToMenu();
            }
        });

    }

    private void takeMeThere() {
        Intent intent = new Intent(this, DoctorProfileActivity.class);
        startActivity(intent);
        finish();
    }

    private void backToMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}