package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//initializing variables
    int score4;
    int score3;
    int score2;
    int score1;
    int score5;
    int score6;
    int result;


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
        //defining correct answers for radiogroups
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
            Toast.makeText(this, "You don't answer all questions", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(this, "You don't answer all questions", Toast.LENGTH_SHORT).show();
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

            Toast.makeText(this, "You don't answer all questions", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(this, "You don't answer all questions", Toast.LENGTH_LONG).show();
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

        if(answer.isEmpty()) {
            edt.setError("Please answer");

        }
        else
        if (answer.equals("Peru")) {
            score6 = 1;
        }

        result = score1 + score2 + score3 + score4 + score5 + score6;
        displayScore(result);
    }

    // method to display result
    public void displayScore(int result) {
        TextView viewScore = findViewById(R.id.result);
        viewScore.setVisibility(View.VISIBLE);

        Button reset = findViewById(R.id.reset);
        reset.setVisibility(View.VISIBLE);
        //result in toast
        Toast.makeText(this, "Your result is " + result + " points", Toast.LENGTH_LONG).show();
        //result in textView
        if (result<=2) {
           viewScore.setText("I'm disappointed.\n Your result is \n " + result + " points");
        }else
        if (result>2 && result<=4){
           viewScore.setText("Not bad.\n Your result is \n " + result + " points");
        } else  viewScore.setText("GOOD JOB.\n Your result is \n " + result + " points" +"\n You are Guinea Pig master");
    }

    public void reset (View view)
    {
        result = 0;
        score1 = 0;
        score2 = 0;
        score3 = 0;
        score4 = 0;
        score5 = 0;
        score6 = 0;

        EditText edt = findViewById(R.id.editText);
        edt.setError(null);

        TextView viewScore = findViewById(R.id.result);
        viewScore.setVisibility(View.GONE);

        Button reset = findViewById(R.id.reset);
        reset.setVisibility(View.GONE);

        CheckBox brown = ( findViewById(R.id.checkBox1Question5));
        CheckBox black = findViewById(R.id.checkBox2Question5);
        CheckBox grey = findViewById(R.id.checkBox3Question5);

        RadioGroup firstradioGroup = findViewById(R.id.firstQuestionRadioGroup);
        firstradioGroup.clearCheck();

        RadioGroup fourthradioGroup = findViewById(R.id.fourthQuestionRadioGroup);
        fourthradioGroup.clearCheck();

        RadioGroup secondradioGroup = findViewById(R.id.secondQuestionRadioGroup);
        secondradioGroup.clearCheck();

        RadioGroup thirdradioGroup = findViewById(R.id.thirdQuestionRadioGroup);
        thirdradioGroup.clearCheck();

        EditText editText = findViewById(R.id.editText);
        editText.setText(null);

        if (brown.isChecked()) {
            brown.setChecked(false);
        }
        if (black.isChecked()) {
            black.setChecked(false);
        }
        if (grey.isChecked()) {
            grey.setChecked(false);
        }

    }
}


