package com.Team10.mpsdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DoctorProfileActivity extends AppCompatActivity {

    ImageView ivDoc;
    TextView tvName, tvGender, tvHospital, tvEmail, tvPhoneNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_profile);

        SharedPreferences newPreferences;
        newPreferences = getSharedPreferences("docs", MODE_PRIVATE);
        String show =  newPreferences.getString("id", null);

        ivDoc = findViewById(R.id.ivDoc);
        tvName = findViewById(R.id.tvName);
        tvGender = findViewById(R.id.tvGender);
        tvHospital = findViewById(R.id.tvHospital);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhoneNum = findViewById(R.id.tvPhoneNum);

        switch (show) {
            case "1":
                ivDoc.setImageResource(R.drawable.edward_r);
                tvName.setText("Name: \n\tEdward Richtofen");
                tvGender.setText("Gender: \n\tMale");
                tvHospital.setText("Hospital: \n\tGleneagles Hospital Kuala Lumpur");
                tvEmail.setText("Email: \n\tTheGermanDoctor@gmail.com");
                tvPhoneNum.setText("Phone Number: \n\t+935505935115");
                break;
            case "2":
                ivDoc.setImageResource(R.drawable.erza_c);
                tvName.setText("Name: \n\tErza Chadwick");
                tvGender.setText("Gender: \n\tFemale");
                tvHospital.setText("Hospital: \n\tGleneagles Hospital Kuala Lumpur");
                tvEmail.setText("Email: \n\tEZChadwick@gmail.com");
                tvPhoneNum.setText("Phone Number: \n\t+966478927444");
                break;
            case "3":
                ivDoc.setImageResource(R.drawable.david_s);
                tvName.setText("Name: \n\tDavid Scott");
                tvGender.setText("Gender: \n\tMale");
                tvHospital.setText("Hospital: \n\tParkCity Medical Centre");
                tvEmail.setText("Email: \n\tDavidSwan6@gmail.com");
                tvPhoneNum.setText("Phone Number: \n\t0175956738");
                break;
        }

        Button btnBackToMenu = findViewById(R.id.btnBackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToMenu();
            }
        });

    }
    private void backToMenu() {
        Intent intent = new Intent(this, HealthcareProfessionalsActivity.class);
        startActivity(intent);
        finish();
    }
}