/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectomusica;

import java.util.ArrayList;

/**
 *
 * @author Berke
 */
public class Albumes {
     private String nombre;
    ArrayList<Musica> musica;

    public Albumes(String nombre) {
        this.nombre = nombre;
        musica = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void add(Musica cancion) {
        this.musica.add(cancion);
    }
    
    public void remove(Musica cancion){
        this.musica.remove(cancion);
    }

    public ArrayList<Musica> getMusica() {
        return musica;
    }

    public Musica getMusica(int po){
        return musica.get(po);
    }

}
