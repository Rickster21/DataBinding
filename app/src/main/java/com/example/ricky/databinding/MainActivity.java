package com.example.ricky.databinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.ricky.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding dataBinding; // holds refrences to new elements

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        dataBinding.yolo.setText(getString(R.string.yolo));
                        // onclick changes the text with the datayolosetText above with the bttn is pressd

      dataBinding.buttn.setOnClickListener(new View.OnClickListener() {

          @Override
          public void onClick(View v) {

              dataBinding.yolo.setText(getString(R.string.odu));

          }
      });

        dataBinding.buttn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secAct.class);
                startActivity(intent);

            }
        });
    }
}
