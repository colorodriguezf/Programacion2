package Ejercicio_1;
public class MainSerie {
    public static void main(String[] args) {
       //Capitulos 1ra temporada
       Capitulo cap_1 = new Capitulo("Le collier de la reine","Descripcion capitulo 1", false, 3);
       Capitulo cap_2 = new Capitulo("L’illusion","Descripcion capitulo 2", true, 5);
       Capitulo cap_3 = new Capitulo("Le commissaire Dumont","Descripcion capitulo 3", true, 5);
       Capitulo cap_4 = new Capitulo("Volte-face","Descripcion capitulo 4", true, 4);
       Capitulo cap_5 = new Capitulo("Étretat","Descripcion capitulo 5",  true, 7);

       //Capitulos segunda temporadas
       Capitulo cap_6 = new Capitulo("Capitulo 6","Descripcion capitulo 6", true, 8);
       Capitulo cap_7 = new Capitulo("Capitulo 7","Descripcion capitulo 7", true, 4);
       Capitulo cap_8 = new Capitulo("Capitulo 8","Descripcion capitulo 8", true, 5);
       Capitulo cap_9 = new Capitulo("Capitulo 9","Descripcion capitulo 9", true, 4);
       Capitulo cap_10 = new Capitulo("Capitulo 10","Descripcion capitulo 10",  true, 7);
        
       //Creo un array para poder crear el objeto temporada 1
        Capitulo[] capitulos_temporada1 = {cap_1, cap_2, cap_3, cap_4, cap_5};
        //Creo un array para poder crear el objeto temporada 2
        Capitulo[] capitulos_temporada2 = {cap_6, cap_7, cap_8, cap_9, cap_10};

        //Creacion de los objetos de tipo temporada
        Temporada temporada_1 = new Temporada(capitulos_temporada1);
        Temporada temporada_2 = new Temporada(capitulos_temporada2);

        //Creo un array para poder crear el objeto serie y le paso las 2 temporadas
        Temporada[] temporadas = {temporada_1, temporada_2};

        Serie serie_lupin = new Serie("Lupin","La historia sigue al ladrón profesional Assane Diop..", "George Kay y François Uzan", "Suspenso y misterio", temporadas);
    
    
        // Mostramos pruebas de los metodos
        System.out.println("Info del cap_1: ");
        mostrarInfoDelCapitulo(cap_1);
        System.out.println("Info del cap_3: ");
        mostrarInfoDelCapitulo(cap_3);
        System.out.println("Info de la temp_1: ");
        mostrarInfoDeLaTemporada(temporada_1);
        System.out.println("Info de la temp_2: ");
        mostrarInfoDeLaTemporada(temporada_2);
        System.out.println("La cantidad de caps que se vieron de la serie es de: " + serie_lupin.contarCapitulosVistos());
        System.out.println("El promedio asignado de todos los caps vistos de la serie es de: " + serie_lupin.calcularPromedio());
        System.out.println("Se vieron todos los capitulos de la serie: " + serie_lupin.vioTodosLosCapitulos());

    }
    
    public static void mostrarInfoDelCapitulo(Capitulo cap){
        System.out.println("El titulo del cap es: " + cap.getTitulo());
        System.out.println("La descripcion del cap es: " + cap.getDescripcion());
        System.out.println("El cap fue visto: " + cap.getVisto());
        System.out.println("La calificacion del cap es: " + cap.getCalificacion());
        System.out.println("");
      }
      public static void mostrarInfoDeLaTemporada(Temporada temp){
        System.out.println("Cantidad de capitulos vistos de la temporada: " + temp.contarCapitulosVistos());
        System.out.println("El promedio de calificacion de los caps vistos de la temporada es: " + temp.promedioCalificacionTemporada());
        System.out.println("Vio todos los capitulos de la temporada: " + temp.vioTodosLosCaps());
        System.out.println("");
      }
    
    
    }
