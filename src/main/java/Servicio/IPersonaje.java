/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Personaje;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface IPersonaje {
    public Personaje crearPersonaje(String nombre, String genero, String actor, int edad, double estatura);
    public ArrayList<Personaje> listarPersonajes();
    public Personaje actualizarPersonaje(String nombre, String genero, String actor, int edad, double estatura, int posicion);
    public Personaje eliminarPeronaje(int posicion);
    
}
