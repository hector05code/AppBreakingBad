package com.example.t2appv1.Controller;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;

import androidx.appcompat.app.AppCompatActivity;

import com.example.t2appv1.R;

public class Registro extends AppCompatActivity {


   private  EditText text_gmail;
   private  EditText text_nombtre;
   private  EditText text_edad;

    private Button btn_registrarse;





    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);


       this.btn_registrarse = findViewById(R.id.btn_registrarse);
        this.text_gmail = findViewById(R.id.text_gmail);
        this.text_nombtre = findViewById(R.id.text_nombtre);
        this.text_edad = findViewById(R.id.text_edad);



        this.btn_registrarse.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {

                String email = text_gmail.getText().toString().trim();
                String nombre = text_nombtre.getText().toString().trim();
                String tedad = text_edad.getText().toString().trim();

                if (email.isEmpty() || nombre.isEmpty() || tedad.isEmpty()) {
                    
                    myLongToast("Complete todos los campos");
                    return;
                }

                int edad = Integer.parseInt(text_edad.getText().toString());

                if (edad < 18) {
                    myLongToast("Debes ser mayor de 18 años");
                    return;
                }



                myLongToast("Registro exitoso");

                finish();

            }
        });
    }

    public void myLongToast(String msg) {
        Toast.makeText(Registro.this, msg, Toast.LENGTH_LONG).show();
    }
}


