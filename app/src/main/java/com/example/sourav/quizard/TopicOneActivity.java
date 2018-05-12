package com.example.sourav.quizard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TopicOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_one);

        //setting question one
        String mQuestionOne = "Who invented C programming language?";
        String mOptionOne = "Options: A)D. Ritchie B)K.Thompson C)B.Kernighan D)B.Stroustrup";

        //get question text view
        TextView questionTextView = findViewById(R.id.question_one);
        questionTextView.setPadding(16,8,16,8);
        questionTextView.setTextSize(24);
        questionTextView.setText(mQuestionOne);
        //get option text view
        TextView optionsTextView = findViewById(R.id.option_one);
        optionsTextView.setPadding(16,8,16,8);
        optionsTextView.setText(mOptionOne);

        //setting question one
        String mQuestionTwo = "Who invented C plus plus programming language?";
        String mOptionTwo = "Options: A)D. Ritchie B)K.Thompson C)B.Kernighan D)B.Stroustrup";

        //get question text view
        TextView questionTwoTextView = findViewById(R.id.question_two);
        questionTwoTextView.setPadding(16,8,16,8);
        questionTwoTextView.setTextSize(24);
        questionTwoTextView.setText(mQuestionTwo);
        //get option text view
        TextView optionsTwoTextView = findViewById(R.id.option_two);
        optionsTwoTextView.setPadding(16,8,16,8);
        optionsTwoTextView.setText(mOptionTwo);

        String mQuestionThree = "Who invented Java programming language?";
        String mOptionThree = "Options: A)D. Ritchie B)K.Thompson C)J.Gosling D)B.Stroustrup";

        //get question text view
        TextView questionThreeTextView = findViewById(R.id.question_three);
        questionThreeTextView.setPadding(16,8,16,8);
        questionThreeTextView.setTextSize(24);
        questionThreeTextView.setText(mQuestionThree);
        //get option text view
        TextView optionsThreeTextView = findViewById(R.id.option_three);
        optionsThreeTextView.setPadding(16,8,16,8);
        optionsThreeTextView.setText(mOptionThree);

        String mQuestionFour = "Who invented Java Script programming language?";
        String mOptionFour = "Options: A)R. Lerdorf B)J. Resig C)J.Gosling D)B.Eich";

        //get question text view
        TextView questionFourTextView = findViewById(R.id.question_four);
        questionFourTextView.setPadding(16,8,16,8);
        questionFourTextView.setTextSize(24);
        questionFourTextView.setText(mQuestionFour);
        //get option text view
        TextView optionsFourTextView = findViewById(R.id.option_four);
        optionsFourTextView.setPadding(16,8,16,8);
        optionsFourTextView.setText(mOptionFour);

        String mQuestionFive = "Who invented Python programming language?";
        String mOptionFive = "Options: A)G.v.Rossum B)L.Wall C)J.Gosling D)B.Eich";

        //get question text view
        TextView questionFiveTextView = findViewById(R.id.question_five);
        questionFiveTextView.setPadding(16,8,16,8);
        questionFiveTextView.setTextSize(24);
        questionFiveTextView.setText(mQuestionFive);
        //get option text view
        TextView optionsFiveTextView = findViewById(R.id.option_five);
        optionsFiveTextView.setPadding(16,8,16,8);
        optionsFiveTextView.setText(mOptionFive);
    }
}
