/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectomusica;

/**
 *
 * @author Berke
 */
public class ProyectoMusica {

    public static void main(String[] args) {
       ArrayList<Artist> artistas = new ArrayList<>();
       
       Artist a = new Artist ("Mienteme","Imagination");
       Song s = new Song("House of glass","What once was");
       a.addSongs(s);
       
       artistas.add(a);
    }
}
