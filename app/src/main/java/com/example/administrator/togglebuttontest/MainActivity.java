package com.example.administrator.togglebuttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
        Switch switchbtn = (Switch) findViewById(R.id.switchbtn);
        final LinearLayout test = (LinearLayout) findViewById(R.id.test);
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener(){
            @Override
        public void onCheckedChanged(CompoundButton button,boolean isChecked){
                if(isChecked)
                {
                    test.setOrientation(LinearLayout.VERTICAL);
                }
                else {
                    test.setOrientation(LinearLayout.HORIZONTAL);
                }
            }
        };
        toggleButton.setOnCheckedChangeListener(listener);
        switchbtn.setOnCheckedChangeListener(listener);
    }
}
