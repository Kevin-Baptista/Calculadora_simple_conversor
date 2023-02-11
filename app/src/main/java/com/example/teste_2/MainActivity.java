package com.example.teste_2;

import static com.example.teste_2.R.drawable.yelow_button_background;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    private TextView previous_calc;
    private EditText display;
    boolean shiftKeyPressed = false;
    Button sin,cos,tan,shiftbutton,conversor_button;
    private TextView textView2,textView3,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previous_calc = findViewById(R.id.previous_calc);
        display = findViewById(R.id.display_expre);

        textView2= findViewById(R.id.textView2);

        textView3 = findViewById(R.id.textView3);
        textView5 = findViewById(R.id.textView5);



        display.setShowSoftInputOnFocus(false);
        previous_calc.setText("0.0");

        shiftbutton = (Button) findViewById(R.id.button37);
        conversor_button = (Button) findViewById(R.id.button40);

        conversor_button.setOnClickListener(click -> {
            openConversor();
        });

        sin = (Button) findViewById(R.id.button21);
        cos = (Button) findViewById(R.id.button22);
        tan = (Button) findViewById(R.id.button27);


    }

    private void openConversor(){
        Intent intent = new Intent(this, Conversor.class);

        intent.putExtra("previous_calc", String.valueOf(previous_calc.getText()));

        startActivity(intent);
    }


    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);

        display.setText(String.format("%s%s%s",leftStr,strToAdd,rightStr));
        display.setSelection(cursorPos + strToAdd.length());
    }








    public void zeroBTNPush(View view){
        updateText(getResources().getString(R.string.zero_text));
    }
    public void oneBTNPush(View view){
        updateText(getResources().getString(R.string.one_text));
    }
    public void twoBTNPush(View view){
        updateText(getResources().getString(R.string.two_text));
    }
    public void threeBTNPush(View view){
        updateText(getResources().getString(R.string.three_text));
    }
    public void fourBTNPush(View view){
        updateText(getResources().getString(R.string.four_text));
    }
    public void fiveBTNPush(View view){
        updateText(getResources().getString(R.string.five_text));
    }
    public void sixBTNPush(View view){
        updateText(getResources().getString(R.string.six_text));
    }
    public void sevenBTNPush(View view){
        updateText(getResources().getString(R.string.seven_text));
    }
    public void eightBTNPush(View view){
        updateText(getResources().getString(R.string.eight_text));
    }
    public void nineBTNPush(View view){
        updateText(getResources().getString(R.string.nine_text));
    }
    public void openParenthesisBTNPush(View view){
        updateText(getResources().getString(R.string.parenthesis_open_text));
    }
    public void closeParenthesisBTNPush(View view){
        updateText(getResources().getString(R.string.parenthesis_close_text));
    }
    public void equalBTNPush(View view){
        String userExp = display.getText().toString();

        Expression exp = new Expression(userExp);

        String result = String.valueOf(exp.calculate());

        previous_calc.setText(result);
//        display.setText(result);
//        display.setSelection(result.length());
    }
    public void operatorSumBTNPush(View view){
        updateText(getResources().getString(R.string.sum_operator));
    }
    public void operatorMinusBTNPush(View view){
        updateText(getResources().getString(R.string.minus_operator));
    }
    public void operatorProdBTNPush(View view){
        updateText(getResources().getString(R.string.prod_operator));
    }
    public void operatorDivBTNPush(View view){
        updateText(getResources().getString(R.string.divide_operator));
    }
    public void ComaBTNPush(View view){
        updateText(getResources().getString(R.string.coma_text));
    }
    public void ClearBTNPush(View view){
        display.setText("");
        previous_calc.setText("0.0");
    }
    public void backspaceBTNPush(View view){
        int cursorPos = display.getSelectionStart();
        int textlen = display.getText().length();

        if(cursorPos != 0 && textlen !=0){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos-1,cursorPos,"");
            display.setText(selection);
            display.setSelection(cursorPos-1);
        }else{

        }
    }

    public void trigSinBTNPush(View view){

        if(sin.getText().toString().equals("sin")){
            updateText("sin(");
        }else if(sin.getText().toString().equals("sin-1")){
            updateText("arcsin(");
        }

    }
    public void trigCosBTNPush(View view){
        if(cos.getText().toString().equals("cos")){
            updateText("cos(");
        }else if(cos.getText().toString().equals("cos-1")){
            updateText("arccos(");
        }
    }
    public void trigTanBTNPush(View view){

        if(tan.getText().toString().equals("tan")){
            updateText("tan(");
        }else if(tan.getText().toString().equals("tan-1")){
            updateText("arctan(");
        }
    }
    public void trigArcSinBTNPush(View view){
        updateText("arcsin(");
    }
    public void trigArcCosBTNPush(View view){
        updateText("arccos(");
    }
    public void trigArcTanBTNPush(View view){
        updateText("arctan(");
    }
    public void lnBTNPush(View view){
        updateText("ln(");
    }
    public void logBTNPush(View view){
        updateText("lg(");
    }
    public void squareRootBTNPush(View view){
        updateText(getResources().getString(R.string.square_root_text));
    }
    public void absoluteValueBTNPush(View view){
        updateText("abs(");
    }
    public void piBTNPush(View view){
        updateText(getResources().getString(R.string.pi_text));
    }
    public void neperBTNPush(View view){
        updateText("e");
    }
    public void xSquareBTNPush(View view){
        updateText("^(2)");
    }
    public void xPoweryBTNPush(View view){
        updateText("^(");
    }
    public void factorialBTNPush(View view){
        updateText("!");
    }

    public void shiftBTNPush(View view){
        if(shiftKeyPressed == false){

            shiftKeyPressed = true;

            sin.setText(R.string.trig_arcsin_text);
            cos.setText(R.string.trig_arccos_text);
            tan.setText(R.string.trig_arctan_text);

            textView2.setText(R.string.trig_sin_text);
            textView3.setText(R.string.trig_cos_text);
            textView5.setText(R.string.trig_tan_text);

            shiftbutton.setBackground(getResources().getDrawable(yelow_button_background));
            shiftbutton.setTextColor(getResources().getColor(R.color.black));


        }else if(shiftKeyPressed == true){

            shiftKeyPressed = false;
            sin.setText(R.string.trig_sin_text);
            cos.setText(R.string.trig_cos_text);
            tan.setText(R.string.trig_tan_text);

            textView2.setText(R.string.trig_arcsin_text);
            textView3.setText(R.string.trig_arccos_text);
            textView5.setText(R.string.trig_arctan_text);

            shiftbutton.setBackgroundResource(R.drawable.grey_button_background);
            shiftbutton.setTextColor(getResources().getColor(R.color.carrot_orange));
        }
    }

}