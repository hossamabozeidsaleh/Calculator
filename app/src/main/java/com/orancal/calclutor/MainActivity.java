package com.orancal.calclutor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.click_rim){String carrentText = textView.getText().toString();
        String newText = carrentText.substring(0, carrentText.length() - 1);
        if (carrentText.isEmpty())return;
        textView.setText(newText);
        }
        else if (v.getId() == R.id.click_ac){textView.setText(null);}

    }

    TextView textView;
    Button button_ac;
    Button button_rm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button_ac = findViewById(R.id.click_ac);
        button_rm = findViewById(R.id.click_rim);
        button_ac.setOnClickListener(this);
        button_rm.setOnClickListener(this);
    }
    public void ondiget_click(View view) {
        if (view instanceof Button) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        textView.append(buttonText);
    }}






}