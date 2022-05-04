/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.PeliculaControl;
import Modelo.Pelicula;
import java.util.Scanner;

/**  Crear aqui los metodos para recibir y mostrar datos desde la consola
 *
 * 
 */
public class PeliculaVista {
    PeliculaControl peliculaControl = new PeliculaControl();
    
    public void agregarPelicula(){
        System.out.println("Agregar Pelicula");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Nombre: ");
        var nombre = scaner.nextLine();
        System.out.println("Estudio: ");
        var estudio = scaner.nextLine();
        System.out.println("Director: ");
        var director = scaner.nextLine();
        System.out.println("Anio estreno: ");
        var anioEstreno = scaner.nextInt();
        System.out.println("Duracion: (min) ");
        var duracion = scaner.nextDouble();
        
        peliculaControl.crearPelicula(nombre, estudio, director, duracion, anioEstreno);
        System.out.println("Pelicula agregada!");
        
    }
    
    
    public void listarPeliculas(){
        
        System.out.println("Peliculas");
        for(Pelicula peli: peliculaControl.listar()){
            System.out.println(peli.toString());
        }
    }
    
    
    
    
    
}
