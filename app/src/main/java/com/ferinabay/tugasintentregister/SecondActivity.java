package com.ferinabay.tugasintentregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String name, alamat, notelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView ViewData = (TextView) findViewById(R.id.ViewData);

        Intent intent = getIntent();

        name = intent.getStringExtra("pesan_nama");
        alamat = intent.getStringExtra("pesan_alamat");
        notelp = intent.getStringExtra("pesan_notelp");

        ViewData.setText(String.format("Nama Anda : %s\nAlamat Anda : %s\nNo Telepon : %s", name, alamat, notelp));

    }

    public void launchShare(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Nama Anda : "+name+ " Alamat Anda : "+alamat+ " No Telo : "+notelp);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
