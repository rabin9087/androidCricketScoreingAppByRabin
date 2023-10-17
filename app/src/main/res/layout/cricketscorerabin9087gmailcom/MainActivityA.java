package com.example.cricketscorerabin9087gmailcom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Date;

public class MainActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);

        final EditText dateNow =findViewById(R.id.date);
        Date currentDate = new Date(System.currentTimeMillis());
        String dateTime = currentDate.toString();
        dateNow.setText(dateTime);

        Bundle extras = getIntent().getExtras();
        if(extras == null){
            return;
        }
        String qStringA = extras.getString("qStringA");
        final TextView textViewA = findViewById(R.id.team_A);
        final TextView teamARadioButton = findViewById(R.id.teamARadioButton);
        textViewA.setText(qStringA);
        teamARadioButton.setText(qStringA);

        String qStringB = extras.getString("qStringB");
        final TextView textViewB = findViewById(R.id.team_B);
        final TextView teamBRadioButton = findViewById(R.id.teamBRadioButton);
        textViewB.setText(qStringB);
        teamBRadioButton.setText(qStringB);

    }

    public void onTeamRadioButtonClicked(View view) {

        boolean checked =((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.teamARadioButton:
                if (checked)
                    break;
            case R.id.teamBRadioButton:
                if (checked)
                    break;
        }
    }

    public void onBatAndBallRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.batRadioButton:
                if (checked)
                    break;
            case R.id.ballRadioButton:
                if (checked)
                    break;
        }
    }



}