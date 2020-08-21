package com.example.switchproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nightonke.jellytogglebutton.JellyToggleButton;
import com.nightonke.jellytogglebutton.State;

public class MainActivity extends AppCompatActivity implements
        JellyToggleButton.OnStateChangeListener{

    private static final int JTB_ID = R.id.switch10;
    private MyJelly myJelly = new MyJelly();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((JellyToggleButton)findViewById(JTB_ID)).setOnStateChangeListener(this);
    }

    @Override
    public void onStateChange(float process, State state, JellyToggleButton jbt) {
        jbt.setCustomJelly(myJelly);
        if (state.equals(State.LEFT)) {

        }
        if (state.equals(State.RIGHT)) {

        }
        if(state.equals(State.RIGHT_TO_LEFT)) {

        }
        if(state.equals(State.LEFT_TO_RIGHT)) {

        }
    }
}
