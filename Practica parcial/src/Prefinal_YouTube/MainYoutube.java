package Prefinal_YouTube;
import java.time.LocalDate;

import Parcial_2.Filtros.logicos.FiltroAnd;
import Prefinal_YouTube.comparadores.compuesto.ComparadorAnd;
import Prefinal_YouTube.comparadores.simples.ComparadorEmail;
import Prefinal_YouTube.comparadores.simples.ComparadorNombreUsuario;
import Prefinal_YouTube.filtros.Filtro;
import Prefinal_YouTube.filtros.FiltroVideoAnioIgual;
import Prefinal_YouTube.filtros.FiltroVideoAutor;
import Prefinal_YouTube.filtros.FiltroVideoContienePalabraClave;
import Prefinal_YouTube.filtros.FiltroVideoMeGustasMayorA;
import Prefinal_YouTube.filtros.FiltroVideoVisualizacionesMayorA;

public class MainYoutube {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("juanperez",LocalDate.of(2015, 7, 23), "juanperez@gmail.com");
        Usuario u2 = new Usuario("tomascoca",LocalDate.of(2016, 10, 10), "tomascoca@gmail.com");
        Usuario u3 = new Usuario("juanadearco",LocalDate.of(2013, 1, 14), "juanadearco@gmail.com");
        Usuario u4 = new Usuario("leomessi",LocalDate.of(2016, 10, 10), "leomessi@gmail.com");

        Video v1 = new Video("Copa america", u4, 2000, 13000, 600, 20, LocalDate.of(2020, 7, 23));
        v1.setPalabrasClave("futbol");
        v1.setPalabrasClave("messi");

        Video v2 = new Video("Programacion", u1, 1000, 14000, 550, 200, LocalDate.now());
        v2.setPalabrasClave("java");

        Video v3 = new Video("Mejores goles de messi", u4, 1000, 14000, 550, 200, LocalDate.now());
        v3.setPalabrasClave("messi");

        Video v4 = new Video("Animales", u3, 1000, 14000, 550, 200, LocalDate.now());
        v4.setPalabrasClave("animales");
        v4.setPalabrasClave("perro");
        v4.setPalabrasClave("gato");

        Video v5 = new Video("Mejores bloopers", u2, 5000, 1500, 200, 200, LocalDate.of(2020, 7, 23));
        v5.setPalabrasClave("risas");
        v5.setPalabrasClave("caidas");
        v5.setPalabrasClave("messi");


        PlayList p1 = new PlayList("Top mejores videos 2022", 25); //creo playList 1 y agrego 4 videos
        p1.addElemento(v1);
        p1.addElemento(v2);
        p1.addElemento(v3);
        p1.addElemento(v4);

        PlayList p2 = new PlayList("Mejores videos", 20); //creo playList 2 y le agrego 1 video
        p2.addElemento(v5);

        p1.addElemento(p2); //le agrego la playlist 2 a la playlist 1

        System.out.println("Pregunta 1:");
        System.out.println("a- Videos con más de 1000 visualizaciones:"+p1.buscarVideosOrdenado(
                                                                     new FiltroVideoVisualizacionesMayorA(1000),
                                                                      new ComparadorAnd(
                                                                                    new ComparadorNombreUsuario(),
                                                                                    new ComparadorEmail()     
                                                                                    )
                                                                    ));
        System.out.println("\n----------------------------------------------\n");
        System.out.println("b- Videos del año 2020: "+p1.buscarVideosOrdenado(
                                                            new FiltroVideoAnioIgual(2020),
                                                            new ComparadorAnd(
                                                                                    new ComparadorNombreUsuario(),
                                                                                    new ComparadorEmail()
                                                                                )
                                                    ));
        System.out.println("\n----------------------------------------------\n");

        // System.out.println("b- Videos  cuyo autor es “Messi”, recibieron más de 500 “me gusta” y tienen más de 5000 visualizaciones: "+
        // p1.buscarVideosOrdenado(                           
        //     new FiltroAnd(
        //         new FiltroVideoAutor(u4),   
        //         new FiltroAnd(
        //                         new FiltroVideoMeGustasMayorA(500),
        //                         new FiltroVideoVisualizacionesMayorA(200)),
        //                     ),
        //     new ComparadorAnd(
        //                     new ComparadorNombreUsuario(),
        //                     new ComparadorEmail()
        //                 )     
        //     )); //no se por que no me toma los filtros AND concatenados
        System.out.println("\n----------------------------------------------\n");
        System.out.println("d- Videos que contengan la palabra clave messi: "+p1.buscarVideosOrdenado(
                                                            new FiltroVideoContienePalabraClave("messi"),
                                                            new ComparadorAnd(
                                                                                    new ComparadorNombreUsuario(),
                                                                                    new ComparadorEmail()
                                                                                )
                                                    ));
        System.out.println("\n----------------------------------------------\n");
        // System.out.println("e- Cualquier combinación lógica de los anteriores: "+p1.buscarVideosOrdenado(
        //                                                     new FiltroAnd(
        //                                                         new FiltroVideoContienePalabraClave("messi"), 
        //                                                         new FiltroAnd(
        //                                                             new FiltroVideoMeGustasMayorA(2000), 
        //                                                             new FiltroVideoVisualizacionesMayorA(5000)
        //                                                         ),
        //                                                     ),
        //                                                     new ComparadorAnd(
        //                                                                             new ComparadorNombreUsuario(),
        //                                                                             new ComparadorEmail()
        //                                                                         )
        //                                             )); me dice que la funcion de la abstracta espera un filtro no un filtroAnd


      
        System.out.println("\n----------------------------------------------\n");
        System.out.println("2-a Palabras claves video: video 4: "+ v4.getPalabrasClaves());
        System.out.println("b- Palabras claves playlist: Playlist 1: "+ p1.getPalabrasClaves());

        System.out.println("\n----------------------------------------------\n");
        System.out.println("3 Cantidad de videos playlist: Playlist 2: "+ p2.getCantidadVideos()+" videos");
        System.out.println("3 Cantidad de videos playlist: Playlist 1: "+ p1.getCantidadVideos()+" videos");

        System.out.println("\n----------------------------------------------\n");
        System.out.println("4 Duracion de playlist: Playlist 2: "+ p2.getDuracionTotal()+" segundos");
        System.out.println("4 Duracion de playlist: Playlist 1: "+ p1.getDuracionTotal()+" segundos");

        
    }

}
