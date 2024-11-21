package com.example.t2appv1.Adapter;

import static android.view.View.inflate;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.example.t2appv1.Controller.Detalle;
import com.example.t2appv1.Controller.Lista;
import com.example.t2appv1.R;
import com.example.t2appv1.model.Personaje;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    List<Personaje> personajes;
    private Context descripcion;
    private AppCompatActivity activity;
    private int selectedPosition = -1;


    private androidx.appcompat.view.ActionMode mActionMode;

    public RecyclerAdapter(List<Personaje> personajes, Context descripcion, AppCompatActivity activity){
        this.personajes = personajes;
        this.descripcion = descripcion;
        this.activity = activity;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje,parent, false);


        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecyclerHolder holder, int position) {

        Personaje personaje = personajes.get(position);
        holder.nompersonaje.setText(personaje.getNombre());
        holder.imgpersonaje.setImageResource(personaje.getImagen());

        holder.itemView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent( descripcion, Detalle.class);

                intent.putExtra("nombre", personaje.getNombre());
                intent.putExtra("imagenResId", personaje.getImagen());
                intent.putExtra("info", personaje.getInfo());

                descripcion.startActivity(intent);
            }
        });
//----------------------------------------------------------------------------
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View view) {
                boolean res=false;
             /*  selectedPosition=position;
                if (mActionMode == null){
                   mActionMode = activity.startSupportActionMode((androidx.appcompat.view.ActionMode.Callback) mActionCallback);

                    res=true;
                }*/


                return res;
            }
        });

        //----------------------------------------------------------------------------
    }


    @Override
    public int getItemCount() {

        return personajes.size();
    }
    public class RecyclerHolder extends RecyclerView.ViewHolder {
        ImageView imgpersonaje;
        TextView nompersonaje;



        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);

            imgpersonaje  = (ImageView) itemView.findViewById(R.id.img_personaje);
            nompersonaje = (TextView)  itemView.findViewById(R.id.nom_personaje);



        }
    }
    private ActionMode.Callback mActionCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.menu, menu);
            actionMode.setTitle("Borrado");

            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {


            if (menuItem.getItemId() == R.id.item_p) {

                new AlertDialog.Builder(descripcion)
                        .setTitle("Confirmación")
                        .setMessage("¿Está seguro de que desea eliminar a este personaje?")
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                personajes.remove(selectedPosition);
                                notifyItemRemoved(selectedPosition);
                                mActionMode.finish();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
                return true;
            }
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
            mActionMode = null;
        }
    };
}


