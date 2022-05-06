/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Vista;

import Controlador.PeliculaControl;






/**
 *
 * @author diego
 */
public class PeliculaVista {

    public static void main(String[] args) {
        
        PeliculaControl peliculaControl = new PeliculaControl();
        //Pelicula 1
        var pelicula1 = peliculaControl.crearPelicula("Batman: Caballero de la noche", "Warner Bros", "Cristofer Nolan", 2, 1980);
        peliculaControl.crearPersonaje(pelicula1, "Bruce Wayne", "hombre", "Cristian Bale", 35, 1.9);
        peliculaControl.crearPersonaje(pelicula1, "Lucios Fox", "hombre", "Morgan freeman", 55, 1.8);
        peliculaControl.crearPersonaje(pelicula1, "Joker", "hombre", "Heat ledger", 1, 1.85);
        // Pelicula 2
        var pelicula2 = peliculaControl.crearPelicula("El hobbit", "Warner Bros", "Peter jackson", 2.5, 2012);
        peliculaControl.crearPersonaje(pelicula2, "Bilbo Boloson", "hombre hobbit", "Martin freeman", 30, 1.2);
        peliculaControl.crearPersonaje(pelicula2, "Gandalf", "hombre mago", "Ian Mckellen", 1000, 1.9);
        peliculaControl.crearPersonaje(pelicula2, "legolas", "hombre elfo", "orlando blom", 800, 1.9);
        
        
        System.out.println("PELICULAS:");
        System.out.println(peliculaControl.listar());
        
        // Modificar pelicula 2
        pelicula2 = peliculaControl.modificarPelicula(1, "El hobbit : Un viaje inesperado", "Warner Bros MGM ", "Peter Jackson ", 2.5, 2012);
        System.out.println("modificacion pelicula 2\nPELICULAS: ");
        System.out.println(peliculaControl.listar());
        
        // modificar personaje1 pelicula1
        peliculaControl.modificarPersonaje(pelicula1, 0, "Batman", "hombre murcielago", "Christian Bale", 35, 1.9);
        System.out.println("modificacion peronaje1 de pelicula1\nPELICULAS: ");
        System.out.println(peliculaControl.listar());
       
        
        //eliminar pelicula 1
        peliculaControl.eliminarPelicula(pelicula1);
        System.out.println("eliminar pelicula1\nPELICULAS: ");
        System.out.println(peliculaControl.listar());
        
        // eliminar personaje2 pelicula 2
        peliculaControl.eliminarPersonaje(pelicula2, 1);
        System.out.println("eliminar personaje2 pelicula 2\nPELICULAS: ");
        System.out.println(peliculaControl.listar());
        
    }
}
