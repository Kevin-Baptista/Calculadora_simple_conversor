package com.example.teste_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Conversor extends AppCompatActivity {

    private Button previous_calcs,miliwatts,watts,kilowatts,megawatts,gigawatts,dbm,dbw,linear;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversor);

        previous_calcs = (Button) findViewById(R.id.previous_calcs);
        watts = (Button) findViewById(R.id.button31);
        miliwatts = (Button) findViewById(R.id.button26);
        kilowatts = (Button) findViewById(R.id.button35);
        megawatts = (Button) findViewById(R.id.button36);
        dbm = (Button) findViewById(R.id.button39);
        dbw = (Button) findViewById(R.id.button41);
        linear = (Button) findViewById(R.id.button42);
        gigawatts = (Button) findViewById(R.id.button38);


        Intent intent = getIntent();
        String value = intent.getStringExtra("previous_calc");

        previous_calcs.setText(value);

        previous_calcs.setOnClickListener(click -> {
            openMainActivity();
        });

        miliwatts.setOnClickListener(click -> {
            openWhatts(1);
        });

        watts.setOnClickListener(click -> {
            openWhatts(2);
        });

        kilowatts.setOnClickListener(click -> {
            openWhatts(3);
        });

        megawatts.setOnClickListener(click -> {
            openWhatts(4);
        });

        gigawatts.setOnClickListener(click -> {
            openWhatts(5);
        });

        dbm.setOnClickListener(click -> {
            openWhatts(6);
        });

        dbw.setOnClickListener(click -> {
            openWhatts(7);
        });

        linear.setOnClickListener(click -> {
            openWhatts(8);
        });
    }

    private void openMainActivity(){

        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);
    }

    private void openWhatts(int selec){

        Intent intent = new Intent(this,Whatts.class);

        intent.putExtra("var",selec);
        intent.putExtra("previous_calc", String.valueOf(previous_calcs.getText()));
        startActivity(intent);
    }


}
