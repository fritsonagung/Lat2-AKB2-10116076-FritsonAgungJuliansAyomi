package com.example.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerifyAccountActivity extends AppCompatActivity {

    /*
    Nama         : Fritson Agung Julians Ayomi
    NIM          : 10116076
    Kelas        : AKB-2 / IF-2
    Tanggal Buat : 14 April 2019
 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        Button verify = findViewById(R.id.sendBT);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerifyAccountActivity.this, UserHomeActivity.class));
            }
        });
    }
}
