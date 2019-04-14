package com.example.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Button;

/*
    Nama         : Fritson Agung Julians Ayomi
    NIM          : 10116076
    Kelas        : AKB-2 / IF-2
    Tanggal Buat : 13 April 2019
 */

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner spinner1 = findViewById(R.id.spinner_blood_type);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(
                this,
                R.array.blood_type,
                R.layout.custom_spinner_layout
        );

        adapter1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        Spinner spinner2 = findViewById(R.id.spinner_reshus);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(
                this,
                R.array.reshus,
                R.layout.custom_spinner_layout
        );

        adapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        Spinner spinner3 = findViewById(R.id.spinner_job);
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(
                this,
                R.array.job,
                R.layout.custom_spinner_layout
        );

        adapter3.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        Button register = findViewById(R.id.registerBT);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, AlmostThereActivity.class));
            }
        });
    }
}
