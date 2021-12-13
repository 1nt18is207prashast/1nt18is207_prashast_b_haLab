package com.example.a1nt18is207calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    boolean isNewOP = true;
    EditText ed1;
    String newNumber, oldNumber, op ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view){
        if(isNewOP)
            ed1.setText("");
        isNewOP = false;
        String number = ed1.getText().toString();
        switch (view.getId()){
            case R.id.bt1:
                number += "1";
                break;
            case R.id.bt2:
                number += "2";
                break;
            case R.id.bt3:
                number += "3";
                break;
            case R.id.bt4:
                number += "4";
                break;
            case R.id.bt5:
                number += "5";
                break;
            case R.id.bt6:
                number += "6";
                break;
            case R.id.bt7:
                number += "7";
                break;
            case R.id.bt8:
                number += "8";
                break;
            case R.id.bt9:
                number += "9";
                break;
            case R.id.bt0:
                number += "0";
                break;
            case R.id.btDOT:
                number += ".";
                break;
            case R.id.btPLUSMINUS:
                number = "-"+number;
                break;
        }
        ed1.setText(number);
    }

    public void operatorEvent (View view){
        isNewOP = true;
        oldNumber = ed1.getText().toString();
        switch (view.getId()){
            case R.id.btSLASH:op = "/"; break;
            case R.id.btSTAR: op = "*"; break;
            case R.id.btADD: op = "+"; break;
            case R.id.btMINUS: op = "-"; break;
        }
    }

    public void  equalEvent(View view){
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result = Double.parseDouble(oldNumber)+ Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber)- Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber)* Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber)/ Double.parseDouble(newNumber);
                break;
        }
        ed1.setText(result+"");
    }

    public void acEvent(View view){
        ed1.setText("0");
        isNewOP = true;}
public void percentEvent(View view) {
double no = Double.parseDouble(ed1.getText().toString())/100;
ed1.setText(no+"");
isNewOP = true;
}
}