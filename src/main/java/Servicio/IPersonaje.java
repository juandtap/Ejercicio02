/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import Modelo.Personaje;

/**
 *
 * @author diego
 */
public interface IPersonaje {
    public Personaje crearPersonaje( Pelicula pelicula, String nombre, String genero, String actor, int edad, double estatura);
    ////public ArrayList<Personaje> listarPersonajes(); 
    // listapersonajes se muestra en Pelicula
    public Personaje getPersonajeByName(Pelicula pelicula, String name);
    public Personaje getPersonajeByPosicion(Pelicula pelicula, int posicion);
    public Personaje modificarPersonaje(Pelicula pelicula, Personaje personaje, String nombre, String genero, String actor, int edad, double estatura);
    public Personaje eliminarPersonaje(Pelicula pelicula, Personaje personaje);
    
}
