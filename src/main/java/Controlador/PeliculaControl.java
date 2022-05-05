/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pelicula;
import Modelo.Personaje;
import Servicio.PeliculaService;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class PeliculaControl {
    
    PeliculaService peliculaService =  new PeliculaService();
    
    public Pelicula crearPelicula(String nombre, String produccion, String director, double duracion, int fechaEstreno){
        if (validarFechaEstreno(fechaEstreno)){
            Pelicula pelicula = new Pelicula(nombre, produccion, director, fechaEstreno, duracion);
            peliculaService.crearPelicula(pelicula);
            return pelicula;
        }
        
        throw new IllegalArgumentException("El anio debe ser mayor  a 2000");
        
    }
    
    public Pelicula modificarPelicula(int posicion, String nombre, String produccion, String director, double duracion, int fechaEstreno){
        if (validarFechaEstreno(fechaEstreno)){
            Pelicula pelicula = new Pelicula(nombre, director, director, fechaEstreno, duracion);
            peliculaService.modificarPelicula(pelicula, posicion);
            return pelicula;
        }
        
        throw new IllegalArgumentException("El anio debe ser mayor  a 2000");
    }
    
    
    
    public ArrayList<Pelicula> listar(){
        return peliculaService.listarPeliculas();
    }
    
    // valida que solo se ingresen peliculas estrenadas despues de los 2000s
    private boolean validarFechaEstreno(int anio){
        var flag = true;
        if (anio < 2000){
            flag = false;
        }
        return flag;
    }
}
