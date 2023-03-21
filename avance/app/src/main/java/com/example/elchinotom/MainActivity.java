package com.example.elchinotom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.registro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento= new Intent(MainActivity.this,Registro.class);
                startActivity(intento);
            }

        });
        findViewById(R.id.btnlogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento= new Intent(MainActivity.this,Principal.class);
                startActivity(intento);
            }
        });
    }
}