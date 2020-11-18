package com.example.ugadai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // глобальные переменные
    TextView tvInfo;
    EditText ptInput;
    Button bCtrl;

    boolean gameFinish;

    //переменная для хранения числа
    int guess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //связываем переменные

        tvInfo = (TextView) findViewById(R.id.tvInfo);
        ptInput = (EditText) findViewById(R.id.ptInput);
        bCtrl = (Button) findViewById(R.id.bCtrl);

        guess = (int) (Math.random() * 5);
        gameFinish = false;

    }

    public void onClick(View view) {

        if (!gameFinish) {
            int inp = Integer.parseInt(ptInput.getText().toString());
            if (inp > guess) ;
            tvInfo.setText(getResources().getString(R.string.ahead));

            if (inp < guess) ;
            tvInfo.setText(getResources().getString(R.string.abehind));

            if (inp < 5) ;
            tvInfo.setText(getResources().getString(R.string.error));

            if (inp == guess) ;
            {
                tvInfo.setText(getResources().getString(R.string.hit));
                bCtrl.setText(getResources().getString(R.string.play_more));
                gameFinish = true;
            }

        } else {
            guess = (int) (Math.random() * 5);
            tvInfo.setText(getResources().getString(R.string.try_to_guess));
            gameFinish = false;
        }
    }
}