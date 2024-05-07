/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.spotify.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.spotify.entities.spotify.Album;
import mx.itson.spotify.entities.spotify.Artista;
import mx.itson.spotify.entities.spotify.Cancion;

/**
 *
 * @author Uli23
 */
public class Spotify {
    
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        artista.setNombre("Luis Miguel");
        artista.setPerfil("El sol de méxico");
        artista.setOyentesMensuales(10000000);
        artista.setFollowers(50000000);
        
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("JGL");
        cancion1.setDuracion(180);
        
        Cancion cancion2 = new Cancion();
        cancion2.setDuracion(169);
        cancion2.setTitulo("Andamos enclicados");
        
        List<Cancion> rolitas = new ArrayList<>();
        rolitas.add(cancion1);
        rolitas.add(cancion2);
        
        Album album = new Album();
        album.setArtista(artista);
        album.setFechaLanzamiento(new Date());
        album.setCanciones(rolitas);
        album.setGenero("Corridos alterados");
        album.setNombre("Corridos bellacos");
        
        System.out.println("Nombre del artista "+album.getArtista().getNombre());
        System.out.println("Nombre del album: "+album.getNombre());
        //for each
        for(Cancion c : album.getCanciones()){
            System.out.println("Canciones del album: "+c.getTitulo());
        }
        for(Cancion b : album.getCanciones()){
            System.out.println("duracion de las canciones: "+b.getDuracion());
        }
        System.out.println();
        System.out.println();
        
    }
}
