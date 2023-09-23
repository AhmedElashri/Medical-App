package com.Team10.mpsdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SelfCheckinActivity extends AppCompatActivity {

    Spinner sHospital;
    Button btnCheckIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_checkin);

        sHospital = findViewById(R.id.sHospital);
        btnCheckIn = findViewById(R.id.btnCheckin);

        btnCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hospital = sHospital.getSelectedItem().toString();
                if (!hospital.equals("Pick Your Check-In Location")) {
                    Toast.makeText(SelfCheckinActivity.this, "Your Check-In Has Been Sent To " + hospital, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SelfCheckinActivity.this, "Please Select A Location To Check-In", Toast.LENGTH_SHORT).show();
                }
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
    private void backToMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}