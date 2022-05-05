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
    
    public void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        
        
        int opcion;
        
        do{
            //Runtime.getRuntime().exec("clear"); 
            System.out.println("MENU");
            System.out.println("1. agregar pelicula");
            System.out.println("2. listar peliculas");
            System.out.println("3. agregar personaje");
           
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            if(opcion == 1){
                agregarPelicula();
            } else if(opcion == 2){
                listarPeliculas();
            } 
            
        } while(opcion != 0);
    }
    
    
    public void agregarPelicula(){
        int opc;
        System.out.println("Agregar Pelicula");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre: ");
        var nombre = scanner.nextLine();
        System.out.println("Estudio: ");
        var estudio = scanner.nextLine();
        System.out.println("Director: ");
        var director = scanner.nextLine();
        System.out.println("Anio estreno: ");
        var anioEstreno = scanner.nextInt();
        System.out.println("Duracion: (min) ");
        var duracion = scanner.nextDouble();
        
        Pelicula peli = peliculaControl.crearPelicula(nombre, estudio, director, duracion, anioEstreno);
        System.out.println("Pelicula agregada!");
        do{
            System.out.println("agregar personajes?");
            System.out.println("1. Si\n2. No");
            opc= scanner.nextInt();
            if(opc == 1){
                agregarPersonaje(peli);
            }
                
        } while (opc!=2);
        
        
    }
    
    public void agregarPersonaje(Pelicula pelicula){
        System.out.println("Agregar Peesonaje");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Nombre: ");
        var nombre = scaner.nextLine();
        System.out.println("Genero: ");
        var genero = scaner.nextLine();
        System.out.println("actor: ");
        var actor = scaner.nextLine();
        System.out.println("edad: ");
        var edad = scaner.nextInt();
        System.out.println("estatura (m): ");
        var estatura = scaner.nextDouble();
        
        peliculaControl.crearPersonaje(pelicula, nombre, genero, actor, edad, estatura);
        
        System.out.println("Personaje agregado!");
    }
    
    
    public void listarPeliculas(){
        
        System.out.println("Peliculas");
        for(Pelicula peli: peliculaControl.listar()){
            System.out.println(peli.toString());
        }
    }
    
    
    
    
    
}
