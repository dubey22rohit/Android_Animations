package com.skorpion.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public TextView txtHelloWorld;
public TextView txtHiWorld;
public boolean isHelloWorldShowing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);



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



    }


}
