package com.example.t2appv1.model;

public class Personaje {

    private String nombre;
    private int imagen;
    private String info;

    public Personaje (String nombre,int imagen,String info){

        this.nombre=nombre;
        this.imagen=imagen;
        this.info=info;


    }



    public String getNombre() {
        return nombre;
    }
    public int getImagen() {
        return imagen;
    }
    public String getInfo() {
        return info;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setImagen(int imagen) {
        this.imagen = imagen;
        }
        public void setInfo(String info) {
        this.info = info;
    }
}
