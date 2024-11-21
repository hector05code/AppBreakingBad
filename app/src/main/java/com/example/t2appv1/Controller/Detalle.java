package com.example.t2appv1.Controller;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.t2appv1.R;

public class Detalle extends AppCompatActivity {


    TextView nom_detalle;
    ImageView img_detalle;
    TextView info_detalle;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalle);

        this.nom_detalle = findViewById(R.id.nom_detalle);
        this.img_detalle = findViewById(R.id.img_detalle);
        this.info_detalle = findViewById(R.id.info_detalle);

        String nombre = getIntent().getStringExtra("nombre");
        int imagenResId = getIntent().getIntExtra("imagenResId", -1);
        String info = getIntent().getStringExtra("info");


        nom_detalle.setText(nombre);
        info_detalle.setText(info);

        if (imagenResId !=- 1) {
            img_detalle.setImageResource(imagenResId);
        }



    }
}
