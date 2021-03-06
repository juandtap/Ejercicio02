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
    
    final PeliculaService peliculaService =  new PeliculaService();
    
    // Metodos para Pelicula
    
    public Pelicula crearPelicula(String nombre, String produccion, String director, double duracion, int fechaEstreno){
        if (validarFechaEstreno(fechaEstreno) && validarDuracionPelicula(duracion)){
            Pelicula pelicula = new Pelicula(nombre, produccion, director, fechaEstreno, duracion);
            peliculaService.crearPelicula(pelicula);
            return pelicula;
        }
        
        throw new IllegalArgumentException("El anio debe ser mayor a 1960 y la diracion de la pelicula mayor a 0.5 horas");
        
    }
    
    public Pelicula modificarPelicula(Pelicula pelicula, String nombre, String estudio, String director, double duracion, int fechaEstreno){
        if (validarFechaEstreno(fechaEstreno) && validarDuracionPelicula(duracion)){
            Pelicula nuevapelicula = new Pelicula(nombre, estudio, director, fechaEstreno, duracion);
            peliculaService.modificarPelicula(nuevapelicula, pelicula);
            return nuevapelicula;
        }
        
        throw new IllegalArgumentException("El anio debe ser mayor  a 1960 y la duracion de la pelicula mayor a 0.5 horas");
    }
    
    public Pelicula eliminarPelicula(Pelicula pelicula){
            int posicion = peliculaService.listarPeliculas().indexOf(pelicula);
            return peliculaService.eliminarPelicula(posicion);
    }
    
    
    
    public ArrayList<Pelicula> listar(){
        return peliculaService.listarPeliculas();
    }
    
    public Pelicula getPeliculaByPosicion(int posicionPelicula){
        return peliculaService.getPeliculaByPosicion(posicionPelicula);
    }
    
    public Pelicula getPeliculaByName(String nombrePelicula){
        return peliculaService.getPeliculaByName(nombrePelicula);
    }
    
    //Metodos privados clase Pelicula
    // valida que solo se ingresen peliculas estrenadas despues de 1960
    private boolean validarFechaEstreno(int anio){
        var flag = true;
        if (anio < 1960){
            flag = false;
        }
        return flag;
    }
    
    // Valida que la duracion de la pelicula sea mayor de 0.5 horas
    private boolean validarDuracionPelicula(double num){
        var flag = true;
        if(num <= 0.5){
            flag = false;
        }
        return flag;
    }
        
    
    // Metodos para Personaje
    
    
    
    public Personaje crearPersonaje(Pelicula pelicula, String nombre, String genero, String actor, int edad, double estatura){
       
        if (validarEdad(edad) && validarSoloTexto(genero)){
            Personaje personaje = new Personaje(nombre, genero, actor, edad, estatura);
            peliculaService.crearPersonaje(pelicula, nombre, genero, actor, edad, estatura);
            return personaje;
        } else {
            throw new IllegalArgumentException("la edad debe ser un valor positivo y el genero debe contener solo texto");
        }
        
    }
    
    public Personaje modificarPersonaje(Pelicula pelicula, Personaje personaje, String nombre, String genero, String actor, int edad, double estatura ){
        
        if (validarEdad(edad) && validarSoloTexto(genero)){
            
            return peliculaService.modificarPersonaje(pelicula, personaje, nombre, genero, actor, edad, estatura);
        } 
        
        throw new IllegalArgumentException("la edad debe ser un valor positivo y el genero debe contener solo texto");
        
    }
    
    public Personaje eliminarPersonaje(Pelicula pelicula, Personaje personaje){
        return peliculaService.eliminarPersonaje(pelicula, personaje);
    }
    
    
    public Personaje getPersonajeByPosicion(Pelicula pelicula, int posicion){
        return peliculaService.getPersonajeByPosicion(pelicula, posicion);
    }
    
    public Personaje getPersonajeByName(Pelicula pelicula, String name){
        return peliculaService.getPersonajeByName(pelicula, name);
    }
    
    // metodos privados clase Personaje
    //valida que no se ingresen valores negativos en "edad"
    public boolean validarEdad(int edad){
        var flag = true;
        if(edad <= 0){
           flag = false;
        }
        return flag;
    }
    
    //valida que sea solo texto para el atributo genero
    public boolean validarSoloTexto(String texto){
        var flag=true;
        for (char t: texto.toCharArray ()){
            if (!((t >= 'a' && t <= 'z') || (t >= 'A' && t <= 'Z') || t == ' '))
                flag=false;
        }
        return flag;
    }
}
