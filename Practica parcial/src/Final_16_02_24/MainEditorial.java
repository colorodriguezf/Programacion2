package Final_16_02_24;

import Aseguradora_Strategy.calculador.Calculador;
import Final_16_02_24.calculadores.CalculadorMas;
import Final_16_02_24.calculadores.CostoFijoPorAutor;
import Final_16_02_24.calculadores.CostoFijoPorPagina;
import Final_16_02_24.calculadores.CostoPreestablecido;
import Final_16_02_24.filtros.logicos.FiltroAnd;
import Final_16_02_24.filtros.noLogicos.FiltroEscritosPor;
import Final_16_02_24.filtros.noLogicos.FiltroPaginasMenor;
import Final_16_02_24.filtros.noLogicos.FiltroRevisadosPor;

public class MainEditorial {
    public static void main(String[] args) {

        Persona autor1 = new Persona("Leo", "Messi", "leomessi@gmail.com");
        Persona autor2 = new Persona("Fideo", "Di Maria", "fideodm@gmail.com");
        Persona revisor = new Persona("Dibu", "Martinez", "dibutecomo@gmail.com");

        CostoFijoPorPagina cpp = new CostoFijoPorPagina(2);
        CostoPreestablecido cp = new CostoPreestablecido(100);
        CostoFijoPorAutor cpa = new CostoFijoPorAutor(25);
        CalculadorMas cmas1 = new CalculadorMas(cpp, cp);
        CalculadorMas cmas2 = new CalculadorMas(cpa, cp);



        Capitulo capitulo1 = new Capitulo("Capítulo 1", 20, "Tema 1", revisor, cpp);
        capitulo1.setAutores(autor1);
        capitulo1.setAutores(autor2);


        Capitulo capitulo2 = new Capitulo("Capítulo 2", 30, "Tema 2", revisor, cp);
        capitulo2.setAutores(autor2);


        Capitulo capitulo3 = new Capitulo("Capítulo 3", 25, "Tema 3", revisor, cmas1);
        capitulo3.setAutores(autor2);


        Capitulo capitulo4 = new Capitulo("Capítulo 4", 25, "Tema 3", revisor, cpa);
        capitulo4.setAutores(autor1);
        capitulo4.setAutores(autor2);


        Capitulo capitulo5 = new Capitulo("Capítulo 5", 48, "Tema 2", revisor, cpp);
        capitulo5.setAutores(autor2);

        Capitulo capitulo6 = new Capitulo("Capítulo 6", 17, "Tema 1", revisor, cp);
        capitulo6.setAutores(autor1);


        Capitulo capitulo7 = new Capitulo("Capítulo 7", 42, "Tema 7", revisor, cmas2);
        capitulo7.setAutores(autor1);
        capitulo7.setAutores(autor2);
        

        ElementoCompuesto enciclopedia1 = new ElementoCompuesto("Enciclopedia de Programación", 2024, revisor);
        enciclopedia1.setElementos(capitulo1);
        enciclopedia1.setElementos(capitulo2);
        enciclopedia1.setElementos(capitulo3);
        enciclopedia1.setElementos(capitulo6);

        ElementoCompuesto enciclopedia2= new ElementoCompuesto("Enciclopedia compuesta", 2025, revisor);
        enciclopedia2.setElementos(capitulo1);
        enciclopedia2.setElementos(capitulo2);
        enciclopedia2.setElementos(capitulo3);
        enciclopedia2.setElementos(capitulo4);
        enciclopedia2.setElementos(capitulo5);
        enciclopedia2.setElementos(capitulo6);
        enciclopedia2.setElementos(capitulo7);
        enciclopedia2.setElementos(enciclopedia1);



        System.out.println("1a) Listado de los temas que trata una enciclopedia/libro: " + enciclopedia2.obtenerTemas());
        System.out.println("1b) Listado de los autores sin repetir de un/a enciclopedia/libro: " + enciclopedia2.obtenerAutores());
        System.out.println("1c) Listado de los editores sin repetir de un/a enciclopedia/libro: " + enciclopedia2.obtenerEditores());
        System.out.println("1d) Cantidad de paginas de un/a enciclopedia/libro: " + enciclopedia2.obtenerCantpaginas());
        System.out.println("1e) Copia de un/a enciclopedia/libro acotada a: ");
        System.out.println("    -Escritos por autor 2: " +enciclopedia2.getCopiaFiltrada(new FiltroEscritosPor(autor2)));
        System.out.println("    -Revisados por revisor: " +enciclopedia2.getCopiaFiltrada(new FiltroRevisadosPor(revisor)));
        System.out.println("    -Menos de 26 paginas: " +enciclopedia2.getCopiaFiltrada(new FiltroPaginasMenor(26)));
        System.out.println("    -Escritos por autor 2 y menos de 26 paginas: " +enciclopedia2.getCopiaFiltrada(new FiltroAnd (
                                                                                                                    new FiltroEscritosPor(autor2),
                                                                                                                    new FiltroPaginasMenor(26)
                                                                                                                    )
                                                                                                                ));

       System.out.println("");
       System.out.println("2) Formas de calcular el precio de un capitulo: ");
       System.out.println("2a) Costo fijo por cantidad de paginas --> Capitulo 1: $" + capitulo1.getCosto());                                                                                                         
       System.out.println("2b) Costo preestablecido --> Capitulo 2: $" + capitulo2.getCosto());    
       System.out.println("2c) Costo preestablecido MAS costo fijo por cantidad de paginas --> Capitulo 3: $" + capitulo3.getCosto());
       System.out.println("2d) Costo fijo por cantidad de autores --> Capitulo 4: $" + capitulo4.getCosto());   
       System.out.println("2e) Costo fijo por cantidad de autores MAS valor preestablecido --> Capitulo 7: $" + capitulo7.getCosto());    
 
                                                                                                    
                                                                                                     




    }
    
}
