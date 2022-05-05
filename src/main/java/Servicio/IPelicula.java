/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface IPelicula {
    public Pelicula crearPelicula(Pelicula pelicula);
    public ArrayList<Pelicula> listarPeliculas();
    public Pelicula modificarPelicula(Pelicula pelicula, int posicion);
    public Pelicula eliminarPelicula(int posicion);
}
