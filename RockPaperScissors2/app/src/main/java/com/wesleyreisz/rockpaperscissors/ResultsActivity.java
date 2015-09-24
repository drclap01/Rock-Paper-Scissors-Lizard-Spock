package com.wesleyreisz.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Random;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Integer intChoice = bundle.getInt("choice");

        String winningText = "";

        String choiceStr = "";

        if (intChoice == 2131492944) {
            choiceStr = "R";
        }

        else if (intChoice == 2131492946) {
            choiceStr = "L";
        }

        else if (intChoice == 2131492947) {
            choiceStr = "Sp";
        }

        else if (intChoice == 2131492945) {
            choiceStr = "Sc";
        }

        else if (intChoice == 2131492943) {
            choiceStr = "P";
        }

        String compChoice = compChoice();

        winningText = compare(choiceStr, compChoice);
        Toast.makeText(ResultsActivity.this, winningText, Toast.LENGTH_SHORT).show();

    }

    public String compChoice() {
        Random rand = new Random();
        Integer compChoice = rand.nextInt(5);

        String compChoiceStr = "";

        if (compChoice == 0) {
            compChoiceStr = "R";
        }
        else if (compChoice == 1){
            compChoiceStr = "P";
        }
        else if (compChoice == 2){
            compChoiceStr = "Sc";
        }
        else if (compChoice == 3){
            compChoiceStr = "L";
        }
        else if (compChoice == 4){
            compChoiceStr = "Sp";
        }


        return compChoiceStr;

    }

    public String compare(String choiceStr, String compChoice) {
        String winningText = "";

        if (choiceStr == "P" && compChoice == "R") {
            //set winning text whatever it is
            winningText = "Player Wins";
        }

        else if (choiceStr == "P" && compChoice == "Sp") {
            winningText = "Player Wins";
        }

        else if (choiceStr == "P" && compChoice == "Sc") {
            winningText = "Player Loses";
        }

        else if (choiceStr == "P" && compChoice == "L") {
            winningText = "Player Loses";
        }

        else if (choiceStr == "R" && compChoice == "P") {
            winningText = "Player Loses";
        }

        else if (choiceStr == "R" && compChoice == "Sp") {
            winningText = "Player Loses";
        }

        else if (choiceStr == "R" && compChoice == "Sc") {
            winningText = "Player Wins";
        }

        else if (choiceStr == "R" && compChoice == "L") {
            winningText = "Player Wins";
        }

        else if (choiceStr == "L" && compChoice == "P") {
            winningText = "Player Wins";
        }

        else if (choiceStr == "L" && compChoice == "Sp") {
            winningText = "Player Wins";
        }

        else if (choiceStr == "L" && compChoice == "Sc") {
            winningText = "Player Loses";
        }

        else if (choiceStr == "L" && compChoice == "R") {
            winningText = "Player Loses";
        }

        else if (choiceStr == "Sp" && compChoice == "P") {
            winningText = "Player Loses";
        }

        else if (choiceStr == "Sp" && compChoice == "L") {
            winningText = "Player Loses";
        }

        else if (choiceStr == "Sp" && compChoice == "Sc") {
            winningText = "Player Wins";
        }

        else if (choiceStr == "Sp" && compChoice == "R") {
            winningText = "Player Wins";
        }

        else if (choiceStr == "Sc" && compChoice == "P") {
            winningText = "Player Wins";
        }

        else if (choiceStr == "Sc" && compChoice == "L") {
            winningText = "Player Wins";
        }

        else if (choiceStr == "Sc" && compChoice == "Sp") {
            winningText = "Player Loses";
        }

        else if (choiceStr == "Sc" && compChoice == "R") {
            winningText = "Player Loses";
        }

        return winningText;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_results, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
