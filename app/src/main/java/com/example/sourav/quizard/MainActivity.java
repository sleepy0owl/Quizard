package com.example.sourav.quizard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find topic one card
        CardView TopicOne = findViewById(R.id.card_view_1);
        //set onClickListener
        TopicOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create Intent
                Intent intent = new Intent(MainActivity.this, TopicOneActivity.class);
                //start intent
                startActivity(intent);
            }
        });

        //find topic two card
        CardView TopicTwo = findViewById(R.id.card_view_2);
        TopicTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create Intent
                Intent intent = new Intent(MainActivity.this, TopicTwoActivity.class);
                //start intent
                startActivity(intent);
            }
        });
    }
}
