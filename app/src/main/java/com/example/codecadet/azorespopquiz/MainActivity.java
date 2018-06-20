package com.example.codecadet.azorespopquiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int points=0;
    int CheckedFirst = 0;
    int CheckedSecond = 0;
    int CheckedThird = 0;
    int CheckedFourth = 0;
    int CheckedFifth = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * When the "submit answers" button is clicked.
     */

    public void SubmitAnswer(View view) {

        //if the first question was answered right,  one point gained
        RadioGroup first = (RadioGroup)findViewById(R.id.first);
        CheckedFirst += first.getCheckedRadioButtonId();
        if (CheckedFirst == R.id.answ2) points++;

        //if the second question was answered right, one point gained
        RadioGroup second = (RadioGroup)findViewById(R.id.second);
        CheckedSecond += second.getCheckedRadioButtonId();
        if (CheckedSecond == R.id.answ23) points++;

        //if the third question was answered right, one point gained
        RadioGroup third = (RadioGroup)findViewById(R.id.third);
        CheckedThird += third.getCheckedRadioButtonId();
        if (CheckedThird == R.id.answ31) points++;

        //if the fourth question was answered right, one point gained
        RadioGroup fourth = (RadioGroup)findViewById(R.id.fourth);
        CheckedFourth += fourth.getCheckedRadioButtonId();
        if (CheckedFourth == R.id.answ41) points++;

        //if the fifth question was answered right, one point gained
        RadioGroup fifth = (RadioGroup)findViewById(R.id.fifth);
        CheckedFourth += fourth.getCheckedRadioButtonId();
        if (CheckedFourth == R.id.answ52) points++;

        // toast telling your score in quiz
        Context context = getApplicationContext();
        CharSequence text = "Congratulations, your score is: " +points + "/7";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }


    /**
     * When the "reset" button is clicked.
     */
    public void Reset (View view) {

        // wipes clean the first question
        RadioGroup first = (RadioGroup)findViewById(R.id.first);
        first.clearCheck();

        //wipes clean the second question
        RadioGroup second = (RadioGroup)findViewById(R.id.second);
        second.clearCheck();

        //wipes clean the third question
        RadioGroup third = (RadioGroup)findViewById(R.id.third);
        third.clearCheck();

        //wipes clean the fourth question
        RadioGroup fourth = (RadioGroup)findViewById(R.id.fourth);
        fourth.clearCheck();

        //wipes clean the fifth question
        RadioGroup fifth = (RadioGroup)findViewById(R.id.fifth);
        fourth.clearCheck();

        // resets the points
        points=0;

    }
}