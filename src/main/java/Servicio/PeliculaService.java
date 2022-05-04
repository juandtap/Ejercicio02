/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class PeliculaService implements IPelicula{
    
    final ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    
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
    public Pelicula actualizarPelicula(Pelicula pelicula, int posicion) {
        listaPeliculas.add(posicion, pelicula);
        return pelicula;
    }

    @Override
    public Pelicula eliminarPelicula(int posicion) {
        return listaPeliculas.remove(posicion);
    }
    
    
    
}
