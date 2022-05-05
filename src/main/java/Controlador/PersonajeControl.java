/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pelicula;
import Modelo.Personaje;
import Servicio.PeliculaService;

/**
 *
 * @author diego
 */
public class PersonajeControl {
    
    // usamos los metodos de la clase PeiculaService para la creacion de 
    //personajes
    PeliculaService peliculaService = new PeliculaService();
    
    public Personaje crearPersonaje(Pelicula pelicula, String nombre, String genero, String actor, int edad, double estatura){
       
        if (validarEdad(edad)){
            Personaje personaje = new Personaje(nombre, genero, actor, edad, estatura);
            peliculaService.crearPersonaje(pelicula, nombre, genero, actor, edad, estatura);
            return personaje;
        }
        
        throw new IllegalArgumentException("la edad debe ser un valor positivo");

        
    }
    
    //valida que no se ingresen valores negativos
    public boolean validarEdad(int edad){
        var flag = true;
        if(edad <= 0){
           flag = false;
        }
        return flag;
    }
}
