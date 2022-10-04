package Ejercicio_3;

public class MainGastosPublicos {
    public static void main(String[] args){
        //Ciudades bsas
        Ciudad tandil = new Ciudad("Tandil",125000, 234533, 10000,20000,43000,23000,15000);
        Ciudad necochea = new Ciudad("Necochea", 92933, 23000, 13500, 2235, 135, 1276, 12345);
        Ciudad la_plata = new Ciudad("La Plata", 900000, 230000, 135000, 213564, 135373, 12756, 124356);
        Ciudad mar_del_plata = new Ciudad("Mar Del Plata",  650000 , 2300, 135346, 213564, 1235373, 1352756, 7643);

        //Ciudades Cordoba
        Ciudad ciudad_cordoba = new Ciudad("Ciudad de Córdoba",1500000, 234533, 10000,20000,43000,23000,15000);
        Ciudad villa_dolores = new Ciudad("Villa Dolores", 76888, 23000, 13500, 2235, 135, 1276, 12345);
        Ciudad la_cumbrecita = new Ciudad("La Cumbrecita", 61326, 230000, 135000, 213564, 135373, 12756, 124356);
        Ciudad yacanto = new Ciudad("Yacanto",  250400 , 2300, 135346, 213564, 1235373, 1352756, 7643);

        //En vez de crear:
        //Ciudad[]ciudades_bsas = {tandil, necochea,la_plata,mar_del_plata}; y eso se lo pasamos a new Provincia("Buenos Aires", ciudades)
        //le pasamos directamente a el arreglo de tipo Ciudad. 
        Provincia buenos_aires = new Provincia("Buenos Aires", new Ciudad[]{tandil, necochea, la_plata, mar_del_plata});
        Provincia cordoba = new Provincia("Cordoba", new Ciudad[]{ciudad_cordoba, villa_dolores, la_cumbrecita, yacanto});

        Pais argentina = new Pais("Argentina", new Provincia[]{buenos_aires, cordoba});

        // System.out.println("El dinero recaudado por impuestos en tandil es de: $" + tandil.sumaTotalDeImpuestos());
       // tandil.agregarDineroAMonto1(10000);
       // System.out.println("El dinero recaudado por impuestos en tandil es de: $" + tandil.sumaTotalDeImpuestos());
       // System.out.println("El dinero que gasta en obras publicas es de: $" + tandil.getGastos_realizados());
       // System.out.println("Gasta mas dinero que el recaudado por los impuestos: " + tandil.gastaMasDeLoQueRecauda());
        comprobarDatosProvincia(buenos_aires);
        comprobarDatosProvincia(cordoba);
        comprobarDatosPais(argentina);
    }

    public static void comprobarDatosProvincia(Provincia prov){
      System.out.println("Datos de la provincia: " + prov.getNombre());
      System.out.println("La ciudad cuenta con " + prov.contarCiudades() + " ciudades");
      System.out.println(prov.obtenerNombresDeLasCiudades());
      System.out.println((prov.tieneMasDeLaMitadEnDeficit())? "Tiene mas de la mitad de sus ciudades en deficit" : "NO tiene mas de la mitad de sus ciudades en deficit");
      System.out.println("Listado de ciudades con deficit: " + prov.obtenerCiudadesQueGastanMasDeLoQueRecaudan());
      System.out.println("");
    }
  
    public static void comprobarDatosPais(Pais pais){
      System.out.println("Datos del pais: " + pais.getNombre());
      System.out.println("El pais cuenta con " + pais.contarProvincias() + " provincias");
      System.out.println("Listado de ciudades (con sus provincias) que gastan mas de lo que recaudan");
      System.out.println(pais.obtenerCiudadesQueGastanMasDeLoQueRecaudan());
    }
    
  } 


