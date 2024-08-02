package Parcial_2022_Olavarria;

import java.util.Comparator;

import Parcial_2022_Olavarria.comparadores.ComparadorCompuesto;
import Parcial_2022_Olavarria.comparadores.ComparadorColor;
import Parcial_2022_Olavarria.comparadores.ComparadorCosto;
import Parcial_2022_Olavarria.comparadores.ComparadorMarca;
import Parcial_2022_Olavarria.comparadores.ComparadorCantidadEncastres;
import Parcial_2022_Olavarria.filtro.logicos.FiltroAnd;
import Parcial_2022_Olavarria.filtro.logicos.FiltroOr;
import Parcial_2022_Olavarria.filtro.noLogicos.FiltroElementoColor;
import Parcial_2022_Olavarria.filtro.noLogicos.FiltroElementoEncastresMenor;
import Parcial_2022_Olavarria.filtro.noLogicos.FiltroElementoPesoMenor;

public class MainJugueteria {
    public static void main(String[] args) {
        Pieza p1 = new Pieza("lego", "verde", 8, 8, 8);
        Pieza p2 = new Pieza("lego", "amarillo", 12, 14, 12);
        Pieza p4 = new Pieza("lego", "rojo", 15, 16, 14);
        Pieza p6 = new Pieza("lego", "rojo", 12, 13, 14);
        Pieza p3 = new Pieza("rasti", "rojo", 12, 8, 10);
        Pieza p5 = new Pieza("rasti", "amarillo", 12, 10, 10);
        Pieza p7 = new Pieza("rasti", "amarillo", 8, 10, 10);
        
        Combo c = new Combo("lego", 10);

        c.setElementos(p1);
        c.setElementos(p2);
        c.setElementos(p3);
        c.setElementos(p4);
        c.setElementos(p5);
        c.setElementos(p6);
        c.setElementos(p7);

        System.out.println("a)");
        System.out.println("funciona- Peso del combo c: "+c.getPeso()+" gr");
        System.out.println("funciona- Color del combo c: (deberia ser el ultimo, es p7 amarillo) "+c.getColor());
        System.out.println("funciona- Cantidad de encastres del combo c: "+c.getCantidadEncastres());
        System.out.println("funciona- Costo del combo c: $"+c.getCosto());

        //Los listados se devuelve ordenados por marca, costo, encastres y por color
       Comparator<Jugueteria> comparador = new ComparadorCompuesto(
            new ComparadorMarca(),
            new ComparadorCompuesto(
                new ComparadorCosto(),
                new ComparadorCompuesto(
                    new ComparadorCantidadEncastres(),
                    new ComparadorColor()
                )
            )
        );

        System.out.println("1)");
        System.out.println("a) Listar todos los elementos de color rojo: \n"+
            c.getElementosFiltrados( new FiltroElementoColor("rojo"), comparador));
        
        System.out.println("b) Listar todos los elementos de color rojo y peso menor a 14: \n"+
            c.getElementosFiltrados(new FiltroAnd(new FiltroElementoColor("rojo"), new FiltroElementoPesoMenor(14)) , comparador));

        System.out.println("c) Listar todos los elementos de color rojo o amarillo y encastres menor a 14: \n"+
        c.getElementosFiltrados(new FiltroAnd(
            new FiltroOr(new FiltroElementoColor("rojo"), new FiltroElementoColor("amarillo")),
             new FiltroElementoEncastresMenor(14))
             , comparador));
    }


}
