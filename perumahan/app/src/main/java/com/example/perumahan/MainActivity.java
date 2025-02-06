package com.example.perumahan;

import android.os.Bundle;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(200);
            }catch(InterruptedException ex){
                    ex.printStackTrace();
                }finally{
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    finish();
                }
        }
        };
        thread.start();
    }
}