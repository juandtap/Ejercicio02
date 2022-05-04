/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author diego
 */
public class Personaje {
    private String nombre;
    private String genero;
    private String actor;
    private int edad;
    private double estatura;

    public Personaje(String nombre, String genero, String actor, int edad, double estatura) {
        this.nombre = nombre;
        this.genero = genero;
        this.actor = actor;
        this.edad = edad;
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Personaje: \nnombre: " + nombre + "\ngenero" + genero + "\nactor: " + actor + "\nedad: " + edad + "\nestatura: " + estatura + '}';
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    
    
    
}
