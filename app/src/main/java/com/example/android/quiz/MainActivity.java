package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    public void displayScore(View view) {
        int score = calculateResult(question4score(), question3score(), question2score(), question1score());
        TextView viewScore =  findViewById(R.id.result);
        viewScore.setText(score);
    }

private int calculateResult (int question4score, int question3score, int question2score, int question1score) {
       int scoreCalc =+ question4score + question3score + question2score + question1score;
       return scoreCalc;
}

   private int question4score () {
        int score4 = 0;
        // Is the button now checked?
       RadioGroup Question4 = findViewById(R.id.fourthQuestionRadioGroup);
       RadioButton CorrectAnswer4 = findViewById(R.id.radioButton2Question4);
       if(Question4.getCheckedRadioButtonId()==-1)
       {

       }
       else
       {
           // get selected radio button from radioGroup
           int selectedId = Question4.getCheckedRadioButtonId();
           // find the radiobutton by returned id
         RadioButton  selectedRadioButton = findViewById(selectedId);
          if (selectedRadioButton == CorrectAnswer4)
              score4 = 1;
       }
    return score4;
        }

    private int question3score () {
        int score3 = 0;
        // Is the button now checked?
        RadioGroup Question3 = findViewById(R.id.thirdQuestionRadioGroup);
        RadioButton CorrectAnswer3 = findViewById(R.id.radioButton2Question3);
        if(Question3.getCheckedRadioButtonId()==-1)
        {

        }
        else
        {
            // get selected radio button from radioGroup
            int selectedId = Question3.getCheckedRadioButtonId();
            // find the radiobutton by returned id
            RadioButton  selectedRadioButton = findViewById(selectedId);
            if (selectedRadioButton == CorrectAnswer3)
                score3 = 1;
        }
        return score3;
    }

    private int question2score () {
        int score2 = 0;
        // Is the button now checked?
        RadioGroup Question2 = findViewById(R.id.secondQuestionRadioGroup);
        RadioButton CorrectAnswer2 = findViewById(R.id.radioButton2Question2);
        if(Question2.getCheckedRadioButtonId()==-1)
        {

        }
        else
        {
            // get selected radio button from radioGroup
            int selectedId = Question2.getCheckedRadioButtonId();
            // find the radiobutton by returned id
            RadioButton  selectedRadioButton = findViewById(selectedId);
            if (selectedRadioButton == CorrectAnswer2)
                score2 = 1;
        }
        return score2;
    }

    private int question1score () {
        int score1 = 0;
        // Is the button now checked?
        RadioGroup Question1 = findViewById(R.id.firstQuestionRadioGroup);
        RadioButton CorrectAnswer1 = findViewById(R.id.radioButton3);
        if(Question1.getCheckedRadioButtonId()==-1)
        {

        }
        else
        {
            // get selected radio button from radioGroup
            int selectedId = Question1.getCheckedRadioButtonId();
            // find the radiobutton by returned id
            RadioButton  selectedRadioButton = findViewById(selectedId);
            if (selectedRadioButton == CorrectAnswer1)
                score1 = 1;
        }
        return score1;
    }


    }



