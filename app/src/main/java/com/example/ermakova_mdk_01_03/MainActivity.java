package com.example.ermakova_mdk_01_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2 , button3, button7, button8, button9, button10, button11, button12, restart;
    private TextView winText;
    private int count = 0;
    private char currentPlayer = 'X';
    private boolean isMark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restart = findViewById(R.id.button);
        restart.setVisibility(View.INVISIBLE);
        winText = findViewById(R.id.textView2);
        winText.setText("");
        button1 = findViewById(R.id.button1);
        button1.setText("");
        button2 = findViewById(R.id.button2);
        button2.setText("");
        button3 = findViewById(R.id.button3);
        button3.setText("");
        button7 = findViewById(R.id.button7);
        button7.setText("");
        button8 = findViewById(R.id.button8);
        button8.setText("");
        button9 = findViewById(R.id.button9);
        button9.setText("");
        button10 = findViewById(R.id.button10);
        button10.setText("");
        button11 = findViewById(R.id.button11);
        button11.setText("");
        button12 = findViewById(R.id.button12);
        button12.setText("");
    }
    public void click1(View view){

        if(button1.getText().equals("") && !isMark){
            button1.setText(String.valueOf(currentPlayer));
            count++;
            SwitchPlayer();
            WinPlayers();
            visible();

        }
    }
    public void click2(View view){
        if(button2.getText().equals("") && !isMark) {
            button2.setText(String.valueOf(currentPlayer));
            count++;
            SwitchPlayer();
            WinPlayers();
            visible();

        }

    }
    public void click3(View view){
        if(button3.getText().equals("") && !isMark) {
            button3.setText(String.valueOf(currentPlayer));
            count++;
            SwitchPlayer();
            WinPlayers();
            visible();

        }


    }
    public void click7(View view){
        if(button7.getText().equals("") && !isMark) {
            button7.setText(String.valueOf(currentPlayer));
            count++;
            SwitchPlayer();
            WinPlayers();
            visible();

        }


    }
    public void click8(View view){
        if(button8.getText().equals("") && !isMark) {
            button8.setText(String.valueOf(currentPlayer));
            count++;
            SwitchPlayer();
            WinPlayers();
            visible();

        }


    }
    public void click9(View view){
        if(button9.getText().equals("") && !isMark) {
            button9.setText(String.valueOf(currentPlayer));
            count++;
            SwitchPlayer();
            WinPlayers();
            visible();

        }


    }
    public void click10(View view){
        if(button10.getText().equals("") && !isMark) {
            button10.setText(String.valueOf(currentPlayer));
            count++;
            SwitchPlayer();
            WinPlayers();
            visible();

        }


    }
    public void click11(View view){
        if(button11.getText().equals("") && !isMark) {
            button11.setText(String.valueOf(currentPlayer));
            count++;
            SwitchPlayer();
            WinPlayers();
            visible();

        }


    }
    public void click12(View view){
        if(button12.getText().equals("") && !isMark) {
            button12.setText(String.valueOf(currentPlayer));
            count++;
            SwitchPlayer();
            WinPlayers();
            visible();

        }

    }
    public void restart(View view){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");
        count = 0;
        currentPlayer = 'X';
        isMark = false;
        winText.setText("");
        restart.setVisibility(View.INVISIBLE);
    }
    private void SwitchPlayer(){
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    private void visible(){

         if(count == 9 || isMark == true){
            restart.setVisibility(View.VISIBLE);
        }

    }
    private void WinPlayers(){

            if(count == 9){
                winText.setText("Ничья!");
            }
            if(button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText())){
                if(button3.getText().equals("X")){
                    winText.setText("Победили крестики!");
                    isMark = true;
                } else if (button3.getText().equals("O")) {
                    winText.setText("Победили нолики!");
                    isMark = true;
                }
            }
            if(button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText())){
                if(button9.getText().equals("X")){
                    winText.setText("Победили крестики!");
                    isMark = true;
                } else if (button9.getText().equals("O")) {
                    winText.setText("Победили нолики!");
                    isMark = true;
                }
            }
            if(button10.getText().equals(button11.getText()) && button11.getText().equals(button12.getText())){
                if(button12.getText().equals("X")){
                    winText.setText("Победили крестики!");
                    isMark = true;
                } else if (button12.getText().equals("O")) {
                    winText.setText("Победили нолики!");
                    isMark = true;
                }
            }
            if(button2.getText().equals(button8.getText()) && button8.getText().equals(button11.getText())){
                if(button11.getText().equals("X")){
                    winText.setText("Победили крестики!");
                    isMark = true;
                } else if (button11.getText().equals("O")) {
                    winText.setText("Победили нолики!");
                    isMark = true;
                }
            }
            if(button1.getText().equals(button7.getText()) && button7.getText().equals(button10.getText())){
                if(button10.getText().equals("X")){
                    winText.setText("Победили крестики!");
                    isMark = true;
                } else if (button10.getText().equals("O")) {
                    winText.setText("Победили нолики!");
                    isMark = true;
                }
            }
            if(button10.getText().equals(button8.getText()) && button8.getText().equals(button3.getText())){
                if(button3.getText().equals("X")){
                    winText.setText("Победили крестики!");
                    isMark = true;
                } else if (button3.getText().equals("O")) {
                    winText.setText("Победили нолики!");
                    isMark = true;
                }
            }
            if(button1.getText().equals(button8.getText()) && button8.getText().equals(button12.getText())){
                if(button12.getText().equals("X")){
                    winText.setText("Победили крестики!");
                    isMark = true;
                } else if (button12.getText().equals("O")) {
                    winText.setText("Победили нолики!");
                    isMark = true;
                }
            }
            if(button3.getText().equals(button9.getText()) && button9.getText().equals(button12.getText())){
                if(button12.getText().equals("X")){
                    winText.setText("Победили крестики!");
                    isMark = true;
                } else if (button12.getText().equals("O")) {
                winText.setText("Победили нолики!");
                isMark = true;
                }
            }





    }
}