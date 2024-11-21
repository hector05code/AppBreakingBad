package com.example.t2appv1.Controller;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t2appv1.Adapter.RecyclerAdapter;
import com.example.t2appv1.R;

import com.example.t2appv1.model.Utilidades;
import java.util.List;
import com.example.t2appv1.model.Personaje;

public class Lista extends AppCompatActivity  {


    RecyclerView recyclerView;
    RecyclerAdapter adapter;

        @Override
        protected  void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_lista);

            List<Personaje> personajes = Utilidades.getPersonajes();
            recyclerView = findViewById(R.id.recyclerView);

            adapter = new RecyclerAdapter(personajes,this,this);


            GridLayoutManager layoutManager = new GridLayoutManager(this, 2);


            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(layoutManager);

        }



}
