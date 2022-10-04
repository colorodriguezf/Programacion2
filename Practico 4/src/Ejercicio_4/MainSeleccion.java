package Ejercicio_4;

import java.time.LocalDate;

public class MainSeleccion {
    public static void main(String[] args){
        Futbolista futbolista = new Futbolista("Juan", "Perez", 123, LocalDate.of(1998, 6, 24), false, true, false, "Zurdo", 350);
            Masajista masajista = new Masajista("Maria", "Gonzalez", 213, LocalDate.of(1999, 4, 14), false, true, true, "Masajista", LocalDate.of(2020, 07, 12));
            Entrenador entrenador = new Entrenador("Fernando", "Gomez", 555, LocalDate.of(1984, 3, 10), true, false, true, 132);
            Entrenador entrenadorMismoId = new Entrenador("Fernando1", "Gomez1", 555, LocalDate.of(1984, 3, 10), false, false, true, 132);
            
             Seleccion seleccion = new Seleccion("Seleccion 1");
             
             seleccion.agregarContingente(futbolista);
             seleccion.agregarContingente(masajista);
             seleccion.agregarContingente(entrenador);
             seleccion.agregarContingente(entrenadorMismoId);
             
             System.out.println(seleccion.getContingentes().size());
             
             System.out.println(seleccion.estaDisponible(futbolista));
             System.out.println(seleccion.estaDisponible(entrenador));
             System.out.println(seleccion.estaDisponible(masajista));
             System.out.println(seleccion.estaDisponible(entrenadorMismoId));

    }
}
