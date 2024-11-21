package com.example.t2appv1.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.t2appv1.R;

public class MainActivity extends AppCompatActivity {


    Button btn_registro;
    Button btn_lista;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        this.btn_registro = findViewById(R.id.btn_registro);
        this.btn_lista = findViewById(R.id.btn_lista);

        this.btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Registro.class));

            }
        });


        this.btn_lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Lista.class));
            }
        });






    }
}