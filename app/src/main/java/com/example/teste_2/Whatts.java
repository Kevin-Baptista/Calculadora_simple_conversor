package com.example.teste_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;

public class Whatts extends AppCompatActivity {

    private Button previous_calcs;
    private TextView miliwatts,watts,kilowatts,megawatts,gigawatts,dbm,dbw,dbkw;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whatts_layout);

        previous_calcs = (Button) findViewById(R.id.previous_calcs);
        watts = findViewById(R.id.textView31);
        miliwatts =  findViewById(R.id.textView26);
        kilowatts = findViewById(R.id.textView35);
        megawatts =  findViewById(R.id.textView36);
        dbm =  findViewById(R.id.textView39);
        dbw =  findViewById(R.id.textView41);
        dbkw =  findViewById(R.id.textView42);
        gigawatts = findViewById(R.id.textView38);
        

        Intent intent = getIntent();

        String value = intent.getStringExtra("previous_calc");
        int var = intent.getIntExtra("var",0);


        String mW,W,KW,MW,GW,dBm,dBw,dBKW;
        Expression exp;

        switch (var){
            case 1:

                mW = String.valueOf(value);
                previous_calcs.setText(mW+" mW");
                miliwatts.setText(mW+" mW");


                exp = new Expression(mW +"*10^(-3)");
                W = String.valueOf(exp.calculate());
                watts.setText(W+" W");

                exp = new Expression(W +"*10^(-3)");
                KW = String.valueOf(exp.calculate());
                kilowatts.setText(KW+" KW");

                exp = new Expression(W +"*10^(-6)");
                MW = String.valueOf(exp.calculate());
                megawatts.setText(MW+" MW");

                exp = new Expression(W +"*10^(-9)");
                GW = String.valueOf(exp.calculate());
                gigawatts.setText(GW+" GW");

                exp = new Expression("10lg("+mW+")");
                dBm = String.valueOf(exp.calculate());
                dbm.setText(dBm+" dBm");

                exp = new Expression("10lg("+W+")");
                dBw = String.valueOf(exp.calculate());
                dbw.setText(dBw+" dBw");

                exp = new Expression("10lg("+KW+")");
                dBKW = String.valueOf(exp.calculate());
                dbkw.setText(dBKW+" dBKW");


                break;
            case 2:

                W = String.valueOf(value);
                previous_calcs.setText(W+" W");
                watts.setText(W+" W");

                exp = new Expression(W +"*10^(3)");
                mW = String.valueOf(exp.calculate());
                miliwatts.setText(mW+" mW");

                exp = new Expression(W +"*10^(-3)");
                KW = String.valueOf(exp.calculate());
                kilowatts.setText(KW+" KW");

                exp = new Expression(W +"*10^(-6)");
                MW = String.valueOf(exp.calculate());
                megawatts.setText(MW+" MW");

                exp = new Expression(W +"*10^(-9)");
                GW = String.valueOf(exp.calculate());
                gigawatts.setText(GW+" GW");

                exp = new Expression("10lg("+mW+")");
                dBm = String.valueOf(exp.calculate());
                dbm.setText(dBm+" dBm");

                exp = new Expression("10lg("+W+")");
                dBw = String.valueOf(exp.calculate());
                dbw.setText(dBw+" dBw");

                exp = new Expression("10lg("+KW+")");
                dBKW = String.valueOf(exp.calculate());
                dbkw.setText(dBKW+" dBKW");

                break;
            case 3:

                KW = String.valueOf(value);
                previous_calcs.setText(KW+" KW");
                kilowatts.setText(KW+" KW");

                exp = new Expression(KW +"*10^(3)");
                W = String.valueOf(exp.calculate());
                watts.setText(W+" W");

                exp = new Expression(W +"*10^(3)");
                mW = String.valueOf(exp.calculate());
                miliwatts.setText(mW+" mW");


                exp = new Expression(W +"*10^(-6)");
                MW = String.valueOf(exp.calculate());
                megawatts.setText(MW+" MW");

                exp = new Expression(W +"*10^(-9)");
                GW = String.valueOf(exp.calculate());
                gigawatts.setText(GW+" GW");

                exp = new Expression("10lg("+mW+")");
                dBm = String.valueOf(exp.calculate());
                dbm.setText(dBm+" dBm");

                exp = new Expression("10lg("+W+")");
                dBw = String.valueOf(exp.calculate());
                dbw.setText(dBw+" dBw");

                exp = new Expression("10lg("+KW+")");
                dBKW = String.valueOf(exp.calculate());
                dbkw.setText(dBKW+" dBKW");


                break;
            case 4:

                MW = String.valueOf(value);
                previous_calcs.setText(MW+" MW");
                megawatts.setText(MW+" MW");

                exp = new Expression(MW +"*10^(6)");
                W = String.valueOf(exp.calculate());
                watts.setText(W+" W");

                exp = new Expression(W +"*10^(3)");
                mW = String.valueOf(exp.calculate());
                miliwatts.setText(mW+" mW");

                exp = new Expression(W +"*10^(-3)");
                KW = String.valueOf(exp.calculate());
                kilowatts.setText(KW+" KW");




                exp = new Expression(W +"*10^(-9)");
                GW = String.valueOf(exp.calculate());
                gigawatts.setText(GW+" GW");

                exp = new Expression("10lg("+mW+")");
                dBm = String.valueOf(exp.calculate());
                dbm.setText(dBm+" dBm");

                exp = new Expression("10lg("+W+")");
                dBw = String.valueOf(exp.calculate());
                dbw.setText(dBw+" dBw");

                exp = new Expression("10lg("+KW+")");
                dBKW = String.valueOf(exp.calculate());
                dbkw.setText(dBKW+" dBKW");

                break;
            case 5:

                GW = String.valueOf(value);
                previous_calcs.setText(GW+" GW");
                gigawatts.setText(GW+" GW");

                exp = new Expression(GW +"*10^(9)");
                W = String.valueOf(exp.calculate());
                watts.setText(W+" W");

                exp = new Expression(W +"*10^(3)");
                mW = String.valueOf(exp.calculate());
                miliwatts.setText(mW+" mW");

                exp = new Expression(W +"*10^(-3)");
                KW = String.valueOf(exp.calculate());
                kilowatts.setText(KW+" KW");

                exp = new Expression(W +"*10^(-6)");
                MW = String.valueOf(exp.calculate());
                megawatts.setText(MW+" MW");




                exp = new Expression("10lg("+mW+")");
                dBm = String.valueOf(exp.calculate());
                dbm.setText(dBm+" dBm");

                exp = new Expression("10lg("+W+")");
                dBw = String.valueOf(exp.calculate());
                dbw.setText(dBw+" dBw");

                exp = new Expression("10lg("+KW+")");
                dBKW = String.valueOf(exp.calculate());
                dbkw.setText(dBKW+" dBKW");

                break;
            case 6:

                dBm = String.valueOf(value);
                previous_calcs.setText(dBm+" dBm");
                dbm.setText(dBm+" dBm");

                exp = new Expression("10^("+dBm+"/10)");
                mW = String.valueOf(exp.calculate());
                miliwatts.setText(mW+" mW");


                exp = new Expression(mW +"*10^(-3)");
                W = String.valueOf(exp.calculate());
                watts.setText(W+" W");

                exp = new Expression(W +"*10^(-3)");
                KW = String.valueOf(exp.calculate());
                kilowatts.setText(KW+" KW");

                exp = new Expression(W +"*10^(-6)");
                MW = String.valueOf(exp.calculate());
                megawatts.setText(MW+" MW");

                exp = new Expression(W +"*10^(-9)");
                GW = String.valueOf(exp.calculate());
                gigawatts.setText(GW+" GW");




                exp = new Expression("10lg("+W+")");
                dBw = String.valueOf(exp.calculate());
                dbw.setText(dBw+" dBw");

                exp = new Expression("10lg("+KW+")");
                dBKW = String.valueOf(exp.calculate());
                dbkw.setText(dBKW+" dBKW");

                break;
            case 7:

                dBw = String.valueOf(value);
                previous_calcs.setText(dBw+" dBw");
                dbw.setText(dBw+" dBw");


                exp = new Expression("10^("+dBw+"/10)");
                W = String.valueOf(exp.calculate());
                watts.setText(W+" W");

                exp = new Expression(W +"*10^(3)");
                mW = String.valueOf(exp.calculate());
                miliwatts.setText(mW+" mW");

                exp = new Expression(W +"*10^(-3)");
                KW = String.valueOf(exp.calculate());
                kilowatts.setText(KW+" KW");

                exp = new Expression(W +"*10^(-6)");
                MW = String.valueOf(exp.calculate());
                megawatts.setText(MW+" MW");

                exp = new Expression(W +"*10^(-9)");
                GW = String.valueOf(exp.calculate());
                gigawatts.setText(GW+" GW");

                exp = new Expression("10lg("+mW+")");
                dBm = String.valueOf(exp.calculate());
                dbm.setText(dBm+" dBm");




                exp = new Expression("10lg("+KW+")");
                dBKW = String.valueOf(exp.calculate());
                dbkw.setText(dBKW+" dBKW");

                break;
            case 8:

                
                dBKW = String.valueOf(value);
                previous_calcs.setText(dBKW+" dBKW");
                dbkw.setText(dBKW+" dBKW");

                exp = new Expression("10^("+dBKW+"/10)");
                KW = String.valueOf(exp.calculate());
                kilowatts.setText(KW+" KW");


                exp = new Expression(KW +"*10^(3)");
                W = String.valueOf(exp.calculate());
                watts.setText(W+" W");

                exp = new Expression(W +"*10^(3)");
                mW = String.valueOf(exp.calculate());
                miliwatts.setText(mW+" mW");

                exp = new Expression(W +"*10^(-3)");
                KW = String.valueOf(exp.calculate());
                kilowatts.setText(KW+" KW");

                exp = new Expression(W +"*10^(-6)");
                MW = String.valueOf(exp.calculate());
                megawatts.setText(MW+" MW");

                exp = new Expression(W +"*10^(-9)");
                GW = String.valueOf(exp.calculate());
                gigawatts.setText(GW+" GW");

                exp = new Expression("10lg("+mW+")");
                dBm = String.valueOf(exp.calculate());
                dbm.setText(dBm+" dBm");

                exp = new Expression("10lg("+W+")");
                dBw = String.valueOf(exp.calculate());
                dbw.setText(dBw+" dBw");




                break;
        }

        previous_calcs.setOnClickListener(click -> {
            openMainActivity();
        });
    }
    private void openMainActivity(){

        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);
    }



}
