package com.example.nishanth4.willipass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstGrade, secondGrade, thirdGrade, fourthGrade;
    EditText firstWeight, secondWeight, thirdWeight, fourthWeight;
    TextView finalGPA;
    Button calculate;

    double g1,g2,g3,g4,w1,w2,w3,w4,totalPoints,totalUnits, finalScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstGrade = (EditText)findViewById(R.id.EditText12);
        secondGrade = (EditText)findViewById(R.id.EditText22);
        thirdGrade = (EditText)findViewById(R.id.EditText32);
        fourthGrade = (EditText)findViewById(R.id.EditText42);

        firstWeight = (EditText)findViewById(R.id.EditText13);
        secondWeight = (EditText)findViewById(R.id.EditText23);
        thirdWeight = (EditText)findViewById(R.id.EditText33);
        fourthWeight = (EditText)findViewById(R.id.EditText43);

        finalGPA = (TextView)findViewById(R.id.finalgpatext);

        calculate = (Button)findViewById(R.id.buttoncalc);

        calculate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                g1 = Double.parseDouble(firstGrade.getText().toString());
                g2 = Double.parseDouble(secondGrade.getText().toString());
                g3 = Double.parseDouble(thirdGrade.getText().toString());
                g4 = Double.parseDouble(fourthGrade.getText().toString());

                w1 = Double.parseDouble(firstWeight.getText().toString());
                w2 = Double.parseDouble(secondWeight.getText().toString());
                w3 = Double.parseDouble(thirdWeight.getText().toString());
                w4 = Double.parseDouble(fourthWeight.getText().toString());

                totalPoints = g1*w1+g2*w2+g3*w3+g4*w4;

                totalUnits = w1+w2+w3+w4;

                finalScore = totalPoints/totalUnits;

                finalGPA.setText(Double.toString(finalScore));
            }
        });


    }
}
