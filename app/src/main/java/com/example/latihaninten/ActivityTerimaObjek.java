package com.example.latihaninten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTerimaObjek extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terima_objek);
        textView = findViewById(R.id.terima_objek);

        MyBiodata biodata = getIntent().getParcelableExtra("biodata");
        textView.setText("Nama saya "+ biodata.getNama() + " Umur Saya "+ biodata.getUmur());
    }
}
