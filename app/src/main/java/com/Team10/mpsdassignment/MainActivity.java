package com.Team10.mpsdassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Firebase Auth
        FirebaseAuth auth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = auth.getCurrentUser();
        if (currentUser == null) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
            return;
        }

        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logoutUser();
            }
        });


        Button btnYourProfile = findViewById(R.id.btnYourProfile);
        btnYourProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToProfile();
            }
        });

        Button btnHealthEducation = findViewById(R.id.btnHealthEducation);
        btnHealthEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToHealthEd();
            }
        });

        Button btnHealthcareProffessionals = findViewById(R.id.btnHealthcareProfessionals);
        btnHealthcareProffessionals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToHealthProf();
            }
        });

        Button btnSelfCheckin = findViewById(R.id.btnSelfCheckin);
        btnSelfCheckin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToCheck();
            }
        });
    }
    private void logoutUser() {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    private void goToCheck() {
        Intent intent = new Intent(this, SelfCheckinActivity.class);
        startActivity(intent);
        finish();
    }

    private void goToProfile() {
        Intent intent = new Intent(this, AccountProfileActivity.class);
        startActivity(intent);
        finish();
    }

    private void goToHealthEd() {
        Intent intent = new Intent(this, HealthEducationActivity.class);
        startActivity(intent);
        finish();
    }

    private void goToHealthProf() {
        Intent intent = new Intent(this, HealthcareProfessionalsActivity.class);
        startActivity(intent);
        finish();
    }
}