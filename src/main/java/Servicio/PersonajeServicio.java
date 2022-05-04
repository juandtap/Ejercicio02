/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Personaje;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class PersonajeServicio implements IPersonaje{
    
    ArrayList<Personaje> listaPersonajes = new ArrayList<>();

    @Override
    public Personaje crearPersonaje(String nombre, String genero, String actor, int edad, double estatura) {
        Personaje personaje = new Personaje(nombre, genero, actor, edad, estatura);
        listaPersonajes.add(personaje);
        return personaje;
    }

    @Override
    public ArrayList<Personaje> listarPersonajes() {
        return listaPersonajes;
    }

    @Override
    public Personaje actualizarPersonaje(String nombre, String genero, String actor, int edad, double estatura, int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Personaje eliminarPeronaje(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
