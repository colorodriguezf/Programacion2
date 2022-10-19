package Practico7a.Ejercicio_3;

import java.util.ArrayList;

import Practico7a.Ejercicio_3.Filtro.Combinado.CondicionAnd;
import Practico7a.Ejercicio_3.Filtro.Simple.CondicionClasificacion;
import Practico7a.Ejercicio_3.Filtro.Simple.CondicionNombreContengaPalabra;
import Practico7a.Ejercicio_3.Filtro.Simple.CondicionNombreVulgar;
import Practico7a.Ejercicio_3.Filtro.Simple.Agua.CondicionRiesgoRiego;
import Practico7a.Ejercicio_3.Filtro.Simple.Agua.CondicionSinRiesgoRiego;
import Practico7a.Ejercicio_3.Filtro.Simple.Sol.CondicionSolMayor;
import Practico7a.Ejercicio_3.Filtro.Simple.Sol.CondicionSolMenor;

public class MainVivero {
    public static void main (String[] args) {

        Planta p1 = new Planta("Epipremnum aureum", "Epipremnum",
        "Araceae", "Monocotyledoneae", "Planta de interior",6, 1 );
        p1.addNombreVulgar("potus");
        p1.addNombreVulgar("photos");
        p1.addNombreVulgar("potos");
        // System.out.println(p1);
        // System.out.println("---------------------");

        Planta p2 = new Planta("Epipremnum", "Epipremnum",
        "Araceae", "Monocotyledoneae", "Planta de exterior",2, 5 );
        p2.addNombreVulgar("potus");
        p2.addNombreVulgar("plantita");
        p2.addNombreVulgar("potos");
        // System.out.println(p2);
        // System.out.println("---------------------");

        Planta p3 = new Planta("Esdum auartum", "Arpilutum",
        "Mertarae", "Clocotilno", "Planta de exterior",7, 2 );
        p3.addNombreVulgar("cactus");
        p3.addNombreVulgar("photos");
        p3.addNombreVulgar("potos");
        // System.out.println(p3);
        // System.out.println("---------------------");

        Vivero v1 = new Vivero("Vivero 1");
        v1.addPlanta(p1);
        v1.addPlanta(p2);
        v1.addPlanta(p3);
        // System.out.println(v1);


        //Consignas:
        //a)
       System.out.println("a) Plantas que contengan la palabra 'EPIPREMNUM' en su nombre: \n"+v1.getPlantasQueCumplen(new CondicionNombreContengaPalabra("Epipremnum")));
       System.out.println("---------------------");
       //b)
       System.out.println("b) Plantas a la cual se le diga 'PHOTOS': \n"+v1.getPlantasQueCumplen(new CondicionNombreVulgar("photos")));
       System.out.println("---------------------");
       //c)
       System.out.println("c) Plantas a la cual se la clasifique como 'EPIPREMNUM': \n"+v1.getPlantasQueCumplen(new CondicionClasificacion("Epipremnum")));
       System.out.println("---------------------");
       //d)
       System.out.println("d) Plantas que requieran un nivel de sol superior a 5 y riego inferior a 3: \n"+v1.getPlantasQueCumplen(new CondicionAnd (
                                    new CondicionSolMayor(5),
                                    new CondicionSinRiesgoRiego(3)
                                    )));
       System.out.println("---------------------");
       //e)
       System.out.println("e) Plantas  que requieran un nivel de sol inferior a 4 y riego superior a 4: \n"+v1.getPlantasQueCumplen(new CondicionAnd (
                                    new CondicionSolMenor(4),
                                    new CondicionRiesgoRiego(4)
                                    )));
       System.out.println("---------------------");
       //f)
       System.out.println("f) Plantas que no tengan riesgo de agua (menor a 3): \n"+v1.getPlantasQueCumplen(new CondicionSinRiesgoRiego(3)));
       System.out.println("---------------------");
       //g)
       System.out.println("g) Combinacion: contenga en nombre 'EPIPREMNUM' y riesgo agua menor a 6: \n"+v1.getPlantasQueCumplen(new CondicionAnd (
        new CondicionNombreContengaPalabra("Epipremnum"),
        new CondicionSinRiesgoRiego(6)
        )));
System.out.println("---------------------");
    }
}
