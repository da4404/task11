package com.example.task11;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    RadioGroup radioGroup;
    Button button_check;
    ConstraintLayout screen;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        radioGroup = findViewById(R.id.radioGroup);
        button_check = findViewById(R.id.button_check);
        screen = findViewById(R.id.main);
    }
    public void applyColor(View view)
    {
        if (sw.isChecked())
        {
            changeColor();
        }
    }

        public void check(View view)
        {
            if (!sw.isChecked())
            {
                changeColor();
            }
        }

        public void changeColor()
    {
            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == R.id.rbRed)
            {
                screen.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            }
            else if (selectedId == R.id.rbGreen)
            {
                screen.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            }
            else if (selectedId == R.id.rbBlue)
            {
                screen.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
            }
            else if (selectedId == R.id.rbYellow)
            {
                screen.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
        }
    }