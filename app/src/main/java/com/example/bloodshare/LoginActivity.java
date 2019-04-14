package com.example.bloodshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity {

    /*
    Nama         : Fritson Agung Julians Ayomi
    NIM          : 10116076
    Kelas        : AKB-2 / IF-2
    Tanggal Buat : 13 April 2019
 */

    /*
    CHANGE LOG :
    1. Sabtu 13 April 2019 10.30, Membuat Layout Login Activity
    2. Sabtu 13 April 2019 13.30, Membuat Fungsi Perpindahan dari Login Activity Ke Register Activity
    3. Sabtu 13 April 2019 13.45, Membuat Layout Register Activity
    4. Sabtu 13 April 2019 16.12, Membuat Fungsi Perpindahan dari Register Activity Ke Almost There Activity
    5. Minggu 14 April 2019 06.30, Membuat Layout Almost There Activity
    6. Minggu 14 April 2019 06.56, Membuat Fungsi Perpindahan dari Almost There Activity Ke Verify Account Activity
    7. Minggu 14 April 2019 07.00, Membuat Layout Custom Spinner
    8. Minggu 14 April 2019 07,45, Mebuat Layout Verify Account Activity
    9  Minggu 14 April 2019 08.03, Membuat Fungsi Perpindahan dari Verify Account Activity Ke User Home Activity
    8. Minggu 14 April 2019 10,22, Membuat Layout User Home Activity
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView register = findViewById(R.id.registerTX);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
}
