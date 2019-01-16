package com.abc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button textResult = (Button) findViewById(R.id.countBtn);
        textResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.TextNumber1);
                EditText secondNumEditText = (EditText) findViewById(R.id.TextNumber2);
                int firstNum = Integer.parseInt(firstNumEditText.getText().toString());
                int secondNum = Integer.parseInt(secondNumEditText.getText().toString());

                int ResultInteger = 0;
                RadioGroup SignCalculation = (RadioGroup) findViewById(R.id.signCalculation);
                int signNumber = SignCalculation.getCheckedRadioButtonId();
                switch (signNumber) {
                    case 2131165282:
                        ResultInteger = firstNum + secondNum;
                        break;
                    case 2131165285:
                        ResultInteger = firstNum - secondNum;
                        break;
                    case 2131165284:
                        ResultInteger = firstNum * secondNum;
                        break;
                    case 2131165283:
                        ResultInteger = firstNum / secondNum;
                        break;
                    default:
                        ResultInteger = firstNum + secondNum;
                }


                TextView tv = (TextView) findViewById(R.id.TextResult);
                tv.setText(Integer.toString(ResultInteger) + "");
            }
        });

    }
}
