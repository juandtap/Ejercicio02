/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Pelicula {
    private String nombre;
    private String estudio;
    private String director;
    private int anioEstreno;
    private double duracion;
    private ArrayList<Personaje> listaPersonajes;

    public Pelicula(String nombre, String estudio, String director, int anioEstreno, double duracion) {
        this.nombre = nombre;
        this.estudio = estudio;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.listaPersonajes = new ArrayList<>();
    }
    // Muestra la informacion de Pelicula
    @Override
    public String toString() {
        return "Pelicula: \nnombre: " + nombre + "\nestudio: " + estudio + "\ndirector:" + director + "\nfechaEstreno:" + anioEstreno + "\nduracion:" + duracion + "\nLista de personajes: \n" + listaPersonajes;
    }
    
    //muestra la antiguedad de la pelicula basado en el anio actual
    public String antiguedadPelicula(int anioActual){
        int antiguedad = anioActual - this.anioEstreno;
        String antiguedadPelicula = "La pellicula tiene "+antiguedad+ "anios de antiguedad";
        return antiguedadPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String produccion) {
        this.estudio = produccion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }

    public void setListaPersonajes(ArrayList<Personaje> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }
    
    
    
}
