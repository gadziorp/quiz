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

    int score4 = 0;
    int score3 = 0;
    int score2 = 0;
    int score1 = 0;
    int score5 = 0;
    int score6 = 0;
    int result = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }




    // method to calculate result
    public void checkResult(View view) {

        //        check the checkboxes
        boolean brown = ((CheckBox) findViewById(R.id.checkBox1Question5)).isChecked();
        boolean black = ((CheckBox) findViewById(R.id.checkBox2Question5)).isChecked();
        boolean grey = ((CheckBox) findViewById(R.id.checkBox3Question5)).isChecked();
        //convert answer so string
        EditText edt = findViewById(R.id.editText);
        String answer = edt.getText().toString();


        RadioGroup Question4 = findViewById(R.id.fourthQuestionRadioGroup);
        RadioButton CorrectAnswer4 = findViewById(R.id.radioButton2Question4);
        RadioGroup Question3 = findViewById(R.id.thirdQuestionRadioGroup);
        RadioButton CorrectAnswer3 = findViewById(R.id.radioButton2Question3);
        RadioGroup Question2 = findViewById(R.id.secondQuestionRadioGroup);
        RadioButton CorrectAnswer2 = findViewById(R.id.radioButton2Question2);
        RadioGroup Question1 = findViewById(R.id.firstQuestionRadioGroup);
        RadioButton CorrectAnswer1 = findViewById(R.id.radioButton3);
        // Is the button now checked?

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

        // Is the button now checked?

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
        // Is the button now checked?
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

// loop for checking right answer with checkbox questions
        if (black && brown && grey)
            score5 = 1;

        // checking text in editText View with correct answer
       if (answer.equals("Peru")) {
           score6 = 1;
        }
        result = score1 + score2 + score3 + score4 + score5 + score6;
        displayScore(result);
    }

    // method to display result
    public void displayScore(int result) {
        TextView viewScore = findViewById(R.id.result);
        viewScore.setText(result + "");
    }
}


