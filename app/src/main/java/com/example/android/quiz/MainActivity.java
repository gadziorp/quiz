package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // method to display result
    public void displayScore() {
        int score = calculateResult(question4score(), question3score(), question2score(), question1score(), question5score(), question6score());
        TextView viewScore = findViewById(R.id.result);
        viewScore.setText(score);
    }

    // method to calculate result
    private int calculateResult(int question4score, int question3score, int question2score, int question1score, int question5score, int question6score) {
        int scoreCalc = +question4score + question3score + question2score + question1score + question5score + question6score;
        return scoreCalc;
    }

    public int question4score() {
        int score4 = 0;
        // Is the button now checked?
        RadioGroup Question4 = findViewById(R.id.fourthQuestionRadioGroup);
        RadioButton CorrectAnswer4 = findViewById(R.id.radioButton2Question4);
        // checking answer
        if (Question4.getCheckedRadioButtonId() == -1) {

        } else {
            // get selected radio button from radioGroup
            int selectedId = Question4.getCheckedRadioButtonId();
            // find the radiobutton by returned id
            RadioButton selectedRadioButton = findViewById(selectedId);
            // checking answer
            if (selectedRadioButton == CorrectAnswer4)
                score4 = 1;
        }
        return score4;
    }

    public int question3score() {
        int score3 = 0;
        // Is the button now checked?
        RadioGroup Question3 = findViewById(R.id.thirdQuestionRadioGroup);
        RadioButton CorrectAnswer3 = findViewById(R.id.radioButton2Question3);
        if (Question3.getCheckedRadioButtonId() == -1) {

        } else {
            // get selected radio button from radioGroup
            int selectedId = Question3.getCheckedRadioButtonId();
            // find the radiobutton by returned id
            RadioButton selectedRadioButton = findViewById(selectedId);
            // checking answer
            if (selectedRadioButton == CorrectAnswer3)
                score3 = 1;
        }
        return score3;
    }

    public int question2score() {
        int score2 = 0;
        // Is the button now checked?
        RadioGroup Question2 = findViewById(R.id.secondQuestionRadioGroup);
        RadioButton CorrectAnswer2 = findViewById(R.id.radioButton2Question2);
        if (Question2.getCheckedRadioButtonId() == -1) {

        } else {
            // get selected radio button from radioGroup
            int selectedId = Question2.getCheckedRadioButtonId();
            // find the radiobutton by returned id
            RadioButton selectedRadioButton = findViewById(selectedId);
            // checking answer
            if (selectedRadioButton == CorrectAnswer2)
                score2 = 1;
        }
        return score2;
    }

    public int question1score() {
        int score1 = 0;

        RadioGroup Question1 = findViewById(R.id.firstQuestionRadioGroup);
        RadioButton CorrectAnswer1 = findViewById(R.id.radioButton3);
        // Is the button now checked?
        if (Question1.getCheckedRadioButtonId() == -1) {

        } else {
            // get selected radio button from radioGroup
            int selectedId = Question1.getCheckedRadioButtonId();
            // find the radiobutton by returned id
            RadioButton selectedRadioButton = findViewById(selectedId);
            // checking answer
            if (selectedRadioButton == CorrectAnswer1)
                score1 = 1;
        }
        return score1;
    }

    public int question5score() {
        int score5 = 0;
//        check the checkboxes
        boolean brown = ((CheckBox) findViewById(R.id.checkBox1Question5)).isChecked();
        boolean black = ((CheckBox) findViewById(R.id.checkBox2Question5)).isChecked();
        boolean grey = ((CheckBox) findViewById(R.id.checkBox3Question5)).isChecked();
// loop for checking right answer
        if (black && brown && grey)
            score5 = 1;
        return score5;
    }

    public int question6score() {
        int score6 = 0;
        EditText edt = findViewById(R.id.editText);
        String answer = edt.getText().toString();

        if (answer.equals("Peru")) {
            score6 = 1;
        }
        return score6;
    }
}


