package dev.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstNumber, secondNumber;
        TextView displayResult;
        ImageButton add;

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        displayResult = findViewById(R.id.displayResult);
        add = findViewById(R.id.add);


        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int result;
                String first = firstNumber.getText().toString();
                String second = secondNumber.getText().toString();
                if (!first.isEmpty() && !second.isEmpty()) {
                    int calcFirst = Integer.parseInt(first);
                    int calcSecond = Integer.parseInt(second);
                    result = calcFirst + calcSecond;
                    displayResult.setText("Result: " + result);

                } else {
                    displayResult.setText("You must enter both values!");
                }

            }
        });

    }
}