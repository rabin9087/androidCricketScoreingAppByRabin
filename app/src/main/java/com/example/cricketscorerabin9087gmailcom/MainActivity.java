package com.example.cricketscorerabin9087gmailcom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.cricketscorerabin9087gmailcom.ui.score.ScoreFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scoreactivity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, ScoreFragment.newInstance())
                .commitNow();
        }
    }
}