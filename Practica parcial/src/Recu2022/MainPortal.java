package Recu2022;

import Recu2022.filtros.FiltroCategoria;
import Recu2022.filtros.FiltroTituloContengaPalabra;

public class MainPortal {
    public static void main(String[] args) {
        Noticia n1 = new Noticia("futbol", "aguante messi", "messi arg", "yo");
        Noticia n2 = new Noticia("tenis", "aguante federer", "federer el numero uno", "tu");
        Noticia n3 = new Noticia("basquet", "ginobil", "ginobili arg basquet", "yo");
        Noticia n4 = new Noticia("tiros", "aguante el cs", "tiros cs", "el");
        Noticia n5 = new Noticia("naturaleza", " greta", "greta", "yo");

        Seccion s1 = new Seccion("de todo");
        s1.addElemento(n1);
        s1.addElemento(n2);
        s1.addElemento(n3);

        Seccion s2 = new Seccion("un poco mas");
        s2.addElemento(n4);
        s2.addElemento(n5);

        s1.addElemento(s2);

        System.out.println("Copia restringida: Titulo arg: "+s1.getCopiaRestringidaFiltrada(new FiltroTituloContengaPalabra("arg")));

        SeccionRestringida s3 = new SeccionRestringida("deporte");
        s3.setCategoriasPermitidas("futbol");
        s3.setCategoriasPermitidas("basquet");
        s3.setCategoriasPermitidas("tenis");

        s3.addElemento(n1);

        System.out.println("Copia grupo deporte: "+s3.getCopiaRestringidaFiltrada(new FiltroCategoria("deporte")));


        Portal p = new Portal(n1);

        Suscriptor sus1 = new Suscriptor("juan","perez", "sda@asd", new FiltroCategoria("futbol"));
        Suscriptor sus2 = new Suscriptor("pedro","rodriguez", "sda@asd", new FiltroCategoria("tiros"));
        Suscriptor sus3 = new Suscriptor("tomas","fernandez", "sda@asd", new FiltroCategoria("futbol"));
        Suscriptor sus4 = new Suscriptor("roque","perez", "sda@asd", new FiltroCategoria("futbol"));
        Suscriptor sus5 = new Suscriptor("carlos","guiterrerz", "sda@asd", new FiltroCategoria("programacion"));
        Suscriptor sus6 = new Suscriptor("cacho","martinez", "sda@asd", new FiltroCategoria("naturaleza"));

        p.setSuscriptores(sus1);
        p.setSuscriptores(sus2);
        p.setSuscriptores(sus3);
        p.setSuscriptores(sus4);
        p.setSuscriptores(sus5);
        p.setSuscriptores(sus6);

       
        p.repartirNoticia(n1);
        System.out.println("Usuario 1 noticias recibidas "+sus1.getNoticiasRecibidas());


    }
}
