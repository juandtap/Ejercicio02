/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import Modelo.Personaje;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class PeliculaService implements IPelicula, IPersonaje{
    
    private final ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    
    // METODOS IPELICULA
    
    @Override
    public Pelicula crearPelicula(Pelicula pelicula) {
        listaPeliculas.add(pelicula);
        return pelicula;
    }

    @Override
    public ArrayList<Pelicula> listarPeliculas() {
        return listaPeliculas;
    }

    @Override
    public Pelicula getPeliculaByPosicion(int posicionPelicula) {
        return listaPeliculas.get(posicionPelicula);
    }

    @Override
    public Pelicula getPeliculaByName(String name) {
        int posicion=-1;
        for (Pelicula peli : listaPeliculas){
            if(peli.getNombre().equalsIgnoreCase(name)){
                posicion = listaPeliculas.indexOf(peli);
                break;
            }
        }
        
        
        return  listaPeliculas.get(posicion);
    }
    
    
    
    
    @Override
    public Pelicula modificarPelicula(Pelicula nuevaPelicula, Pelicula pelicula) {
        // mantener personajes
        int posicion = listaPeliculas.indexOf(pelicula);
        nuevaPelicula.setListaPersonajes(listaPeliculas.get(posicion).getListaPersonajes());
        listaPeliculas.set(posicion, nuevaPelicula);
        return nuevaPelicula;
    }

    @Override
    public Pelicula eliminarPelicula(int posicion) {
        return listaPeliculas.remove(posicion);
    }
    
    // METODOS IPERSONAJE

    @Override
    public Personaje crearPersonaje(Pelicula pelicula, String nombre, String genero, String actor, int edad, double estatura) {
        Personaje personaje = new Personaje(nombre, genero, actor, edad, estatura);
        int posicion = listaPeliculas.indexOf(pelicula);
        listaPeliculas.get(posicion).getListaPersonajes().add(personaje);
        return personaje;
        
    }

    @Override
    public Personaje modificarPersonaje(Pelicula pelicula, Personaje personaje, String nombre, String genero, String actor, int edad, double estatura) {
        Personaje nuevoPersonaje = new Personaje(nombre, genero, actor, edad, estatura);
        int posicionPelicula = listaPeliculas.indexOf(pelicula);
        int posicionPersonaje = listaPeliculas.get(posicionPelicula).getListaPersonajes().indexOf(personaje);
        listaPeliculas.get(posicionPelicula).getListaPersonajes().set(posicionPersonaje, nuevoPersonaje);
        return nuevoPersonaje;
    }

    @Override
    public Personaje eliminarPersonaje(Pelicula pelicula, Personaje personaje) {
        int posicionPelicula = listaPeliculas.indexOf(pelicula);
        int posicionPersonaje = listaPeliculas.get(posicionPelicula).getListaPersonajes().indexOf(personaje);
        return listaPeliculas.get(posicionPelicula).getListaPersonajes().remove(posicionPersonaje);
    }

    @Override
    public Personaje getPersonajeByName(Pelicula pelicula, String name) {
        int posicionPersonaje = -1;
        int posicionPelicula = listaPeliculas.indexOf(pelicula);
        for (Personaje pers : listaPeliculas.get(posicionPelicula).getListaPersonajes()){
            if(pers.getNombre().equalsIgnoreCase(name)){
                posicionPersonaje = listaPeliculas.get(posicionPelicula).getListaPersonajes().indexOf(pers);
            }
        }
        return listaPeliculas.get(posicionPelicula).getListaPersonajes().get(posicionPersonaje);
    }

    @Override
    public Personaje getPersonajeByPosicion(Pelicula pelicula, int posicion) {
        int posicioPelicula = listaPeliculas.indexOf(pelicula);
        return listaPeliculas.get(posicioPelicula).getListaPersonajes().get(posicion);
        
    }

    
    
    
    
    
    
    
}
