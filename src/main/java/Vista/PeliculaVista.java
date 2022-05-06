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
        peliculaControl.crearPelicula("Batman: Caballero de la noche", "Warner Bros", "Cristofer Nolan", 2, 1980);
        peliculaControl.crearPersonaje(peliculaControl.getPeliculaByPosicion(0), "Bruce Wayne", "hombre", "Cristian Bale", 35, 1.9);
        peliculaControl.crearPersonaje(peliculaControl.getPeliculaByPosicion(0), "Lucios Fox", "hombre", "Morgan freeman", 55, 1.8);
        peliculaControl.crearPersonaje(peliculaControl.getPeliculaByName("Batman: Caballero de la noche"), "Joker", "hombre", "Heat ledger", 1, 1.85);
        // Pelicula 2
        peliculaControl.crearPelicula("El hobbit", "Warner Bros", "Peter jackson", 2.5, 2012);
        peliculaControl.crearPersonaje(peliculaControl.getPeliculaByPosicion(1), "Bilbo Boloson", "hombre hobbit", "Martin freeman", 30, 1.2);
        peliculaControl.crearPersonaje(peliculaControl.getPeliculaByPosicion(1), "Gandalf", "hombre mago", "Ian Mckellen", 1000, 1.9);
        peliculaControl.crearPersonaje(peliculaControl.getPeliculaByName("El hobbit"), "legolas", "hombre elfo", "orlando blom", 800, 1.9);
        
        
        System.out.println("PELICULAS:");
        System.out.println(peliculaControl.listar());
        
        // Modificar pelicula 2
        peliculaControl.modificarPelicula(peliculaControl.getPeliculaByName("El hobbit"), "El hobbit : Un viaje inesperado", "Warner Bros MGM ", "Peter Jackson ", 2.5, 2012);
        System.out.println("modificacion pelicula 2\nPELICULAS: ");
        System.out.println(peliculaControl.listar());
        
        // modificar personaje1 pelicula1
        peliculaControl.modificarPersonaje(peliculaControl.getPeliculaByPosicion(0), 0, "Batman", "hombre murcielago", "Christian Bale", 35, 1.9);
        System.out.println("modificacion peronaje1 de pelicula1\nPELICULAS: ");
        System.out.println(peliculaControl.listar());
       
        
        //eliminar pelicula 1
        peliculaControl.eliminarPelicula(peliculaControl.getPeliculaByPosicion(0));
        System.out.println("eliminar pelicula1\nPELICULAS: ");
        System.out.println(peliculaControl.listar());
        
        // eliminar personaje2 pelicula 2
        peliculaControl.eliminarPersonaje(peliculaControl.getPeliculaByName("El hobbit : Un viaje inesperado"), 1);
        System.out.println("eliminar personaje2 pelicula 2\nPELICULAS: ");
        System.out.println(peliculaControl.listar());
        
        //
        
    }
}
