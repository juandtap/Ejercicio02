/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import Modelo.Personaje;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class PeliculaService implements IPelicula, IPersonaje{
    
    private final ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    
    // Metodos IPelicula
    
    @Override
    public Pelicula crearPelicula(Pelicula pelicula) {
        listaPeliculas.add(pelicula);
        return pelicula;
    }

    @Override
    public ArrayList<Pelicula> listarPeliculas() {
        return listaPeliculas;
    }

    @Override
    public Pelicula modificarPelicula(Pelicula nuevapelicula, int posicion) {
        listaPeliculas.set(posicion, nuevapelicula);
        return nuevapelicula;
    }

    @Override
    public Pelicula eliminarPelicula(int posicion) {
        return listaPeliculas.remove(posicion);
    }
    
    // metodos Ipersonaje

    @Override
    public Personaje crearPersonaje(Pelicula pelicula, String nombre, String genero, String actor, int edad, double estatura) {
        Personaje personaje = new Personaje(nombre, genero, actor, edad, estatura);
        int posicion = listaPeliculas.indexOf(pelicula);
        listaPeliculas.get(posicion).getListaPersonajes().add(personaje);
        return personaje;
        
    }

    @Override
    public Personaje modificarPersonaje(Pelicula pelicula, int posicion, String nombre, String genero, String actor, int edad, double estatura) {
        Personaje nuevoPersonaje = new Personaje(nombre, genero, actor, edad, estatura);
        int posicionPelicula = listaPeliculas.indexOf(pelicula);
        listaPeliculas.get(posicionPelicula).getListaPersonajes().set(posicion, nuevoPersonaje);
        return nuevoPersonaje;
    }

    @Override
    public Personaje eliminarPeronaje(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    
    
    
    
}
