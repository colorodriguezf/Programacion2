package Ejercicio_2;

import java.time.LocalDate;

import Ejercicio_2.Filtros.Filtro;
import Ejercicio_2.Filtros.simples.*;
import Ejercicio_2.Filtros.logicos.*;



public class Main {
    public static void main(String[] args) {
        Gasto g1 = new Gasto("Madera", LocalDate.of(2020, 1, 1), 10000);
		Gasto g2 = new Gasto("Hierro", LocalDate.of(2020, 1, 1), 10000);
		Gasto g3 = new Gasto("Ladrillo", LocalDate.of(2020, 1, 1), 10000);
		Gasto g4 = new Gasto("Cables", LocalDate.of(2020, 1, 1), 10000);

		g1.agregarCaracteristica("Calidad Alta");
		g2.agregarCaracteristica("Calidad Media");
		g3.agregarCaracteristica("Calidad Alta");
        g4.agregarCaracteristica("Calidad Alta");

        GastoDetallado gd = new GastoDetallado("Construccion", LocalDate.of(2020, 1, 1), 400);

		gd.agregarGasto(g1);
		gd.agregarGasto(g2);
		gd.agregarGasto(g3);
        gd.agregarGasto(g4);

		GastoPendiente gp = new GastoPendiente(0.5, false, "Madera", LocalDate.of(2000, 1, 10), 10000);

        System.out.println(gp);
        System.out.println("-------------------------");


        Filtro compuesto = new FiltroAnd(
                                    new FiltroRubro("Madera"), 
                                    new FiltroCalidad("Calidad Alta")
                                );
        System.out.println("Gasto total por criterio AND: "+gd.gastosTotalPorCriterio(compuesto));
        System.out.println("-------------------------");
        System.out.println("Gasto total por criterio simple: "+gd.gastosTotalPorCriterio(new FiltroCalidad("Calidad Alta")));





    }
}
