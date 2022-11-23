package Aseguradora_Strategy;

import Aseguradora_Strategy.calculadores.Calculador;
import Aseguradora_Strategy.calculadores.CalculadorMontoFijo;
import Aseguradora_Strategy.comparadores.ComparadorCompuesto;
import Aseguradora_Strategy.comparadores.ComparadorDni;
import Aseguradora_Strategy.comparadores.ComparadorNroPoliza;
import Aseguradora_Strategy.filtros.FiltroAnd;
import Aseguradora_Strategy.filtros.FiltroDescripcionContienePalabra;
import Aseguradora_Strategy.filtros.FiltroMontoMayorA;

public class Main {
    public static void main(String[] args) {
        Calculador cmf = new CalculadorMontoFijo(2000);
        //Problema no me deja agregar calculador como atributo!
        SeguroSimple s1 = new SeguroSimple(111,"seguro hogar", 23000.0, 4032234);
        SeguroSimple s2 = new SeguroSimple(222,"seguro riesgo", 12000.0, 43354567);
        SeguroSimple s3 = new SeguroSimple(333,"seguro vida", 25000.0, 39849567);
        SeguroSimple s4 = new SeguroSimple(444,"seguro hogar", 26500.0, 32456764);
        SeguroSimple s5 = new SeguroSimple(555,"seguro auto", 10000.0, 45345321);
        SeguroSimple s6 = new SeguroSimple(666,"seguro hogar", 24200.0, 37567763);

        SeguroIntegrador si = new SeguroIntegrador(4032234);
        
        si.setElemento(s1);
        si.setElemento(s2);
        si.setElemento(s3);
        si.setElemento(s4);
        si.setElemento(s5);
        si.setElemento(s6);

        System.out.println("a- Listar todos los seguros cuya descripción contenga la palabra “Hogar”, ordenados por dni y poliza"+ 
                                                                        si.getSegurosQueOrdenados(
                                                                                            new FiltroDescripcionContienePalabra("hogar"),
                                                                                            new ComparadorCompuesto(
                                                                                                new ComparadorDni(),
                                                                                                new ComparadorNroPoliza()
                                                                                            )
                                                                        ));
        System.out.println("-------------------------------------------------");
        System.out.println("b- Listar todos los seguros cuya descripción contenga la palabra “Seguro” y el monto asegurado sea superior a $250.000, ordenados por dni del asegurado"+ 
                                        si.getSegurosQueOrdenados(
                                                            new FiltroAnd(
                                                                new FiltroDescripcionContienePalabra("seguro"),
                                                                new FiltroMontoMayorA(20000)
                                                            ),
                                                            new ComparadorCompuesto(
                                                                new ComparadorDni(),
                                                                new ComparadorNroPoliza()
                                                            )
                                          ));

    }   
}
