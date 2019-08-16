/*
16/08/2019
Siti Nur Alifah
10116181
IF4*/
package com.mvp.pattern.uas.akb.myapp;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class Daftar extends AppCompatActivity {
    Realm realm;
    EditText nim,nama,alamat,telepon,email,sosmed;
    String undeer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        Button btn1= (Button) findViewById(R.id.btnsimpan);
        Button btn2= (Button) findViewById(R.id.btnload);
        nim =(EditText) findViewById(R.id.nimed);
        nama =(EditText)findViewById(R.id.namaed);
        alamat = (EditText)findViewById(R.id.alamated);
        telepon = (EditText)findViewById(R.id.teleponed);
        email = (EditText)findViewById(R.id.emailed);
        sosmed = (EditText)findViewById(R.id.sosmeded);
        undeer = "____________________________";




        Realm.init(this);
        realm = Realm.getDefaultInstance();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realm.beginTransaction();

                User user = realm.createObject(User.class,nim.getText().toString());
                user.setNama(nama.getText().toString());
                user.setTelepon(telepon.getText().toString());
                user.setAlamat(alamat.getText().toString());
                user.setEmail(email.getText().toString());
                user.setSosmed(sosmed.getText().toString());
                user.setUnder(undeer);



                realm.commitTransaction();
                Toast.makeText(Daftar.this, "Teman Ditambahkan", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Daftar.this, LoadActivity.class);
                startActivity(i);
            }
        });

    }
}
