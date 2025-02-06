package com.example.perumahan;

import android.os.Bundle;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button LOGIN, CREATE;
    EditText nama, password;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        nama = findViewById(R.id.editTextText);
        password = findViewById(R.id.editTextTextPassword);
        LOGIN = findViewById(R.id.button4);
        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = nama.getText().toString();
                pass = password.getText().toString();

                if (user.equals("QAIS")) pass.equals("QAIS123");
                {
                    Toast.makeText(MainActivity2.this, "Berhasil Login", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity2.this, MainActivity4.class));
                }
            }
        });

        CREATE = findViewById(R.id.button3);
        CREATE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, com.example.perumahan.MainActivity3.class));
            }
        });
    }
}



