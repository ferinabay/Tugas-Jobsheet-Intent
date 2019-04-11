package com.ferinabay.tugasintentregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    EditText nameEditText;
     EditText alamatEditText;
     EditText notelpEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.editText_name);
        alamatEditText = (EditText) findViewById(R.id.editText_alamat);
        notelpEditText = (EditText) findViewById(R.id.editText_notelp);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("pesan_nama", nameEditText.getText().toString());
        intent.putExtra("pesan_alamat", alamatEditText.getText().toString());
        intent.putExtra("pesan_notelp", notelpEditText.getText().toString());
        startActivity(intent);
    }
}
