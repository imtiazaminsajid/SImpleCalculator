package com.example.imtiazaminsajid.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button AddBT, SubBT, MultiBT, DivBT;
    private EditText FirstNumberET, SecondNumberET, AnswerET, EvenOddET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddBT = findViewById(R.id.addBT);
        SubBT = findViewById(R.id.subBT);
        MultiBT = findViewById(R.id.multiBT);
        DivBT = findViewById(R.id.divBT);

        FirstNumberET = findViewById(R.id.firstNumTV);
        SecondNumberET = findViewById(R.id.secondNumTV);
        AnswerET = findViewById(R.id.answerTV);
        EvenOddET = findViewById(R.id.evenodd);

        AddBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(FirstNumberET.getText().toString().equals("") || SecondNumberET.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Your Number for Addition", Toast.LENGTH_SHORT).show();
                }
                else {
                    FirstNumberET.getText().toString();
                    SecondNumberET.getText().toString();

                    double fn = Double.valueOf(FirstNumberET.getText().toString());
                    double sn = Double.valueOf(SecondNumberET.getText().toString());

                    double ans = fn + sn;

                    if (ans != 0) {

                        if (ans % 2 == 0)

                        {
                            AnswerET.setText(String.valueOf(ans));
                            EvenOddET.setText("Its an even number");
                        } else {
                            AnswerET.setText(String.valueOf(ans));
                            EvenOddET.setText("Its an odd number");
                        }


                    }

                    else {

                        AnswerET.setText(String.valueOf(ans));
                        EvenOddET.setText("0 is not Even or Odd");
                    }
                }
            }
        });

        SubBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(FirstNumberET.getText().toString().equals("") || SecondNumberET.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Your Number Substitution", Toast.LENGTH_SHORT).show();
                }
                else {
                    FirstNumberET.getText().toString();
                    SecondNumberET.getText().toString();

                    double fn = Double.valueOf(FirstNumberET.getText().toString());
                    double sn = Double.valueOf(SecondNumberET.getText().toString());

                    double ans = fn - sn;

                    if (ans != 0) {

                        if (ans % 2 == 0)

                        {
                            AnswerET.setText(String.valueOf(ans));
                            EvenOddET.setText("Its an even number");
                        } else {
                            AnswerET.setText(String.valueOf(ans));
                            EvenOddET.setText("Its an odd number");
                        }


                    }

                    else {

                        AnswerET.setText(String.valueOf(ans));
                        EvenOddET.setText("0 is not Even or Odd");
                    }


                }
            }
        });

        MultiBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(FirstNumberET.getText().toString().equals("") || SecondNumberET.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Your Number for Multiplication", Toast.LENGTH_SHORT).show();
                }
                else {
                    FirstNumberET.getText().toString();
                    SecondNumberET.getText().toString();

                    double fn = Double.valueOf(FirstNumberET.getText().toString());
                    double sn = Double.valueOf(SecondNumberET.getText().toString());

                    double ans = fn * sn;

                    if (ans != 0) {

                        if (ans % 2 == 0)

                        {
                            AnswerET.setText(String.valueOf(ans));
                            EvenOddET.setText("Its an even number");
                        } else {
                            AnswerET.setText(String.valueOf(ans));
                            EvenOddET.setText("Its an odd number");
                        }


                    }
                    else {

                        AnswerET.setText(String.valueOf(ans));
                        EvenOddET.setText("0 is not Even or Odd");
                    }
                }
            }
        });

        DivBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(FirstNumberET.getText().toString().equals("") || SecondNumberET.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Your Number for Division", Toast.LENGTH_SHORT).show();
                }
                else {
                    FirstNumberET.getText().toString();
                    SecondNumberET.getText().toString();

                    double fn = Double.valueOf(FirstNumberET.getText().toString());
                    double sn = Double.valueOf(SecondNumberET.getText().toString());

                    double ans = fn / sn;

                    if (ans != 0) {

                        if (ans % 2 == 0)

                        {
                            AnswerET.setText(String.valueOf(ans));
                            EvenOddET.setText("Its an even number");
                        } else {
                            AnswerET.setText(String.valueOf(ans));
                            EvenOddET.setText("Its an odd number");
                        }


                    }
                    else {

                        AnswerET.setText(String.valueOf(ans));
                        EvenOddET.setText("0 is not Even or Odd");
                    }
                }
            }
        });

    }
}
