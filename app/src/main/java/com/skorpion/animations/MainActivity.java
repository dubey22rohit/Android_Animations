package com.skorpion.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public TextView txtHelloWorld;
public TextView txtHiWorld;
public TextView txtApp;
public Button txtButton;
public boolean isHelloWorldShowing = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtApp = findViewById(R.id.txtApp);
        txtButton = findViewById(R.id.txtButton);

        txtHelloWorld.setX(2000);
        txtHiWorld.setX(2000);
        txtApp.setY(2000);



        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyTag","Hello World");

                if(isHelloWorldShowing){
                    txtHelloWorld.animate().alpha(0).setDuration(1000);
                    txtHiWorld.animate().alpha(1).setDuration(1000);
                    isHelloWorldShowing = false;
                }else if(!isHelloWorldShowing){
                    txtHelloWorld.animate().alpha(1).setDuration(1000);
                    txtHiWorld.animate().alpha(0).setDuration(1000);
                    isHelloWorldShowing = true;
                }
            }
        });

        txtApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtApp.animate().translationXBy(1200).setDuration(1000);

            }
        });
        txtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHelloWorld.animate().translationXBy(-2000).rotation(45).setDuration(1200);
                txtHiWorld.animate().translationXBy(-2500).rotation(-45).setDuration(2000);
                txtApp.animate().translationYBy(-2000).rotation(25).setDuration(1000);

            }
        });




    }


}
