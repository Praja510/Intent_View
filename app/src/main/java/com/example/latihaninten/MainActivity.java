package com.example.latihaninten;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveDataWithActivity = findViewById(R.id.btn_move_activity_data);
        btnMoveDataWithActivity.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        Button btnPindahActivityDenganObjek = findViewById(R.id.btn_pindah_activity_dengan_objek);
        btnPindahActivityDenganObjek.setOnClickListener(this);

    }
    @Override
    public void  onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveWithDataIntent.putExtra(MoveActivityWithData.EXTRA_NAME, "DicodingAcademy Boy");
                moveWithDataIntent.putExtra(MoveActivityWithData.EXTRA_AGE, 5);
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_dial_number:
                String phoneNumber = "081210101111";
                Intent dialPhoneIntent =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.btn_pindah_activity_dengan_objek:
                Intent keActivityTerimaObjek = new Intent(MainActivity.this,ActivityTerimaObjek.class);
                MyBiodata biodataPraja  = new MyBiodata("Praja", 15);
                keActivityTerimaObjek.putExtra("biodata",biodataPraja);
                startActivity(keActivityTerimaObjek);
                break;



        }


    }
}
