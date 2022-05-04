/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio02;

import Vista.PeliculaVista;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Ejercicio02 {

    public static void main(String[] args) throws IOException {
        
        PeliculaVista pelivista = new PeliculaVista();
        Scanner sc = new Scanner(System.in);
        
        
        int opcion;
        
        do{
            Runtime.getRuntime().exec("clear"); 
            System.out.println("MENU");
            System.out.println("1. agregar pelicula");
            System.out.println("2. listar peliculas");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            if(opcion == 1){
                pelivista.agregarPelicula();
            } else if(opcion == 2){
                pelivista.listarPeliculas();
            } 
            
        } while(opcion != 0);
       
    }
}
