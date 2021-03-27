package com.feri.pertemuan2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNilaiA, edtNilaiB;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNilaiA = (EditText) findViewById(R.id.edtNilaiA);
        edtNilaiB = (EditText) findViewById(R.id.edtNilaiB);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnTambah = (Button) findViewById(R.id.btnTambah);
            btnTambah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nilaA = Integer.parseInt(edtNilaiA.getText().toString());
                    int nilaB = Integer.parseInt(edtNilaiB.getText().toString());
                    int hasil = nilaA + nilaB;
                    txtHasil.setText(String.valueOf(hasil));
                }
            });

        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = nilaA - nilaB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali = (Button) findViewById(R.id.btnKali);
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = nilaA * nilaB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = nilaA / nilaB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

    }
}