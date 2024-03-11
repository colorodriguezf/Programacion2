package Final_01_12_23;

import java.util.ArrayList;
import java.util.List;

import Final_01_12_23.filtros.noLogicos.FiltroNombreContenga;

public class Main {
    public static void main(String [] args) {

         Accion accion1 = new Accion("NVIDIA", 10000, "simbolo1");
        Accion accion2 = new Accion("ASFA", 1500, "simbolo2");
        Accion accion3 = new Accion("NVIDIA", 25111, "simbolo3");
        Accion accion4 = new Accion("NVIDIA", 53123, "simbolo4");
        accion1.cerrar();
        accion2.cerrar();
        accion3.cerrar();
        accion4.cerrar();
          // Crear Fondos de Inversión
        ArrayList<ElementoAseguradora> inversionesFondo = new ArrayList<>();
        inversionesFondo.add(accion1);
        inversionesFondo.add(accion2);
        FondoInversion fondo = new FondoInversion("Fondo Tecnológico", 14000, 10000);
        fondo.setElementos(accion1);
        fondo.setElementos(accion2);
        fondo.setElementos(accion3);
        fondo.setElementos(accion4);


        // Filtros:
        System.out.println("1-a) Todas las inversiones cuyo nombre contenga NVIDIA: " +
        fondo.elementosQueCumplen(new FiltroNombreContenga("NVIDIA")));
       
    }
}
