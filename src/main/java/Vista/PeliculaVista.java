/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Vista;

import Controlador.PeliculaControl;
import Controlador.PersonajeControl;
import Modelo.Pelicula;





/**
 *
 * @author diego
 */
public class PeliculaVista {

    public static void main(String[] args) {
        
        PeliculaControl peliculaControl = new PeliculaControl();
        Pelicula pelicula1 = peliculaControl.crearPelicula("Batman", "Warner Bros", "Cristofer Nolan", 2, 2008);
        
        
        peliculaControl.crearPersonaje(pelicula1, "Bruce Wayne", "hombre", "Cristian Bale", 35, 1.9);
        peliculaControl.crearPersonaje(pelicula1, "Lucios Fox", "hombre", "Morgan freeman", 55, 1.8);
        peliculaControl.crearPersonaje(pelicula1, "Bruce Wayne", "hombre", "Heat ledger", 1, 1.85);
        
        System.out.println("PELICULAS:");
        System.out.println(peliculaControl.listar());
        
        
       
    }
}
