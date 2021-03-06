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

    
    // Muestra la informacion de personaje 
    @Override
    public String toString() {
        return "\n\t Personaje: \n\t nombre: " + nombre + "\n\t genero: " + genero + "\n\t actor: " + actor + "\n\t edad: " + edad + "\n\t estatura: " + estatura + " m\n---------------------\n";
    }
    
    // muestra si el personaje es alto o bajo en funcion de su estatura
    // altura > 1.8m alto, de lo contrario, bajo
    public String personajeEsAlto(){
        if (this.estatura >= 1.8){
            return "el personaje "+getNombre()+" es alto";
        } 
        return " el personaje "+getNombre()+" es de baja estatura";
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
