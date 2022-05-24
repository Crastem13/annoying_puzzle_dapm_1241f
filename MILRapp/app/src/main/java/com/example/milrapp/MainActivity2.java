package com.example.milrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {

    public int counter = 0;
    public int overpushed_play = 1;
    public int overpushed_start = 1;
    public boolean first_start = false;
    public boolean first_play = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView title = (TextView) findViewById(R.id.title);
        TextView score = (TextView) findViewById(R.id.score);
        TextView hint = (TextView) findViewById(R.id.hint);
        Button play_btn = (Button) findViewById(R.id.play);
        Button start_btn = (Button) findViewById(R.id.start);
        Button hint_btn = (Button) findViewById(R.id.btnhint);

        hint_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint.setText("What a sissy! The hint is: Jason Voorhees or Ari Lehman.");
                counter = -49;
                score.setText(Integer.toString(counter));
            }
        });

        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first_play) {
                    title.setText("So you are a playful type?");
                    play_btn.setText("Yes");
                    start_btn.setText("No?");
                    first_play = true;
                    first_start = false;
                }

                if (counter == 30) {
                    title.setText("Are you proud of yourself? Now what?");
                    play_btn.setVisibility(View.GONE);
                    start_btn.setVisibility(View.GONE);
                }

                if (overpushed_play % 5 == 0){
                    title.setText("Aren't you tired?");
                    play_btn.setText("NO!");
                    start_btn.setText("Kinda");
                } else {
                    counter++;
                    overpushed_start = 1;
                    overpushed_play++;
                }

                score.setText(Integer.toString(counter));
            }
        });

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first_start) {
                    title.setText("So you are a serious type?");
                    play_btn.setText("Yes!");
                    start_btn.setText("No");
                    first_start = true;
                    first_play = false;
                }

                if (counter == -50) {
                    title.setText("How can you be this bad?");
                    play_btn.setVisibility(View.GONE);
                    start_btn.setVisibility(View.GONE);
                }

                if (overpushed_start % 3 == 0){
                    title.setText("I thought you were serious?");
                    play_btn.setText("Sorry.");
                    start_btn.setText("No?!");
                } else {
                    counter--;
                    overpushed_play = 1;
                    overpushed_start++;
                }

                score.setText(Integer.toString(counter));

                if (counter == 13) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
    }
}