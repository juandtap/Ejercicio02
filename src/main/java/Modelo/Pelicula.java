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
    private String produccion;
    private String director;
    private int fechaEstreno;
    private double duracion;
    private ArrayList<Personaje> listaPersonajes;

    public Pelicula(String nombre, String produccion, String director, int fechaEstreno, double duracion) {
        this.nombre = nombre;
        this.produccion = produccion;
        this.director = director;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
        this.listaPersonajes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Pelicula: \nnombre: " + nombre + "\nproduccion: " + produccion + "\ndirector:" + director + "\nfechaEstreno:" + fechaEstreno + "\nduracion:" + duracion + "\nLista de personajes: \n" + listaPersonajes;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProduccion() {
        return produccion;
    }

    public void setProduccion(String produccion) {
        this.produccion = produccion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
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
