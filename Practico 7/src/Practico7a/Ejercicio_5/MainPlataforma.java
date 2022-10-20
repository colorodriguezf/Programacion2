package Practico7a.Ejercicio_5;

import Practico7a.Ejercicio_5.Condicion.Condicion;
import Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Actor.ContieneActor;
import Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Director.ConDirectorIdentico;
import Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Duracion.DuracionMayor;
import Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Estreno.AnioIgual;
import Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Estreno.AnioMayor;
import Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Genero.ContieneGenero;
import Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Titulo.TituloContienePalabra;
import Practico7a.Ejercicio_5.Condicion.CondicionesLogicas.CondicionAnd;
import Practico7a.Ejercicio_5.Condicion.CondicionesLogicas.CondicionNot;
import Practico7a.Ejercicio_5.Condicion.CondicionesLogicas.CondicionOr;

public class MainPlataforma {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Batman: el caballero de la noche asciende", "Ocho años después de asumir la culpa por la muerte de Harvey Dent y desaparecer en la noche, Batman se ve obligado a salir del exilio autoimpuesto gracias a una ladrona astuta y a un terrorista despiadado.", "Christopher Nolan", 2012, 165, 13);
        pelicula1.agregarGenero("accion");
        pelicula1.agregarGenero("policial");
        pelicula1.agregarGenero("drama");
        pelicula1.agregarGenero("thriller");
        pelicula1.agregarActor("actor1");
        pelicula1.agregarActor("actor7");
        pelicula1.agregarActor("actor3");
        pelicula1.agregarActor("actor9");
        pelicula1.agregarActor("actor10");

        Pelicula pelicula2 = new Pelicula("Blonde", "Una mirada al ascenso a la fama y la épica desaparición de la actriz Marilyn Monroe, una de las estrellas más grandes del mundo.", "Andrew Dominik", 2022, 90, 16);
        pelicula2.agregarGenero("drama");
        pelicula2.agregarActor("actor1");
        pelicula2.agregarActor("actor4");
        pelicula2.agregarActor("actor2");
        pelicula2.agregarActor("actor8");

        Pelicula pelicula3 = new Pelicula("El Camino", "Tras un dramático escape de su cautiverio, Jesse Pinkman debe lidiar con su pasado para pensar en un futuro.", "Vince Gilligan", 2019, 80, 16);
        pelicula3.agregarGenero("drama");
        pelicula3.agregarGenero("crimen");
        pelicula3.agregarActor("actor4");
        pelicula3.agregarActor("actor2");
        pelicula3.agregarActor("actor5");
        pelicula3.agregarActor("actor6");

        Pelicula pelicula4 = new Pelicula("1917", "Durante la Primera Guerra Mundial, dos jóvenes soldados británicos reciben una orden, aparentemente, imposible de ejecutar: en una carrera contra el reloj, deben infiltrarse en territorio enemigo para entregar un mensaje que podría salvar a miles de compañeros.", "Sam Mendes", 2019, 119, 13);
        pelicula4.agregarGenero("guerra");
        pelicula4.agregarGenero("drama");
        pelicula4.agregarGenero("historia");
        pelicula4.agregarGenero("accion");
        pelicula4.agregarGenero("ficcion");
        pelicula4.agregarActor("actor2");
        pelicula4.agregarActor("actor3");
        pelicula4.agregarActor("actor7");
        pelicula4.agregarActor("actor11");

        Plataforma plataforma1 = new Plataforma();
        plataforma1.agregarPelicula(pelicula1);
        plataforma1.agregarPelicula(pelicula2);
        plataforma1.agregarPelicula(pelicula3);
        plataforma1.agregarPelicula(pelicula4);

        System.out.println("a) Buscar todas las películas que en el título contenga la palabra 'luna' "+ plataforma1.getPeliculasQue(new TituloContienePalabra("luna")));
        System.out.println("---------------------");
        System.out.println("b) Buscar todas las películas que contengan un género específico (por ejemplo,'terror')"+ plataforma1.getPeliculasQue(new ContieneGenero("terror")));
        System.out.println("---------------------");
        System.out.println("c) Buscar todas las películas en las que haya actuado 'actor1' y cuyo director NO haya sido 'Andrew Dominik': "+ 
        plataforma1.getPeliculasQue(
                        new CondicionAnd(
                            new ContieneActor("actor 1"),
                            new CondicionNot(
                                new ConDirectorIdentico("Andrew Dominik")
                            )
                        )));
        System.out.println("---------------------");
        System.out.println("d) Buscar todas las películas que se hayan grabado antes del 2015 y cuya duración sea menor a 95 minutos: "+ 
        plataforma1.getPeliculasQue(
                            new CondicionNot(
                                new CondicionAnd(
                                    new AnioIgual(2015),
                                    new DuracionMayor(95)
                                )
                            )));
        System.out.println("---------------------");
        System.out.println("e) Películas cuya duración sea menor a 120 minutos, que no sean del género “comedia”: "+ 
        plataforma1.getPeliculasQue(
                            new CondicionNot(
                                new CondicionAnd(
                                    new DuracionMayor(2015),
                                    new ContieneGenero("comedia")
                                )
                            )));
        System.out.println("---------------------");
        System.out.println("f) Películas posteriores del 2017, a no ser que se trate de películas del género“infantil” o “documental”: "+
        plataforma1.getPeliculasQue(
            new CondicionOr(
                        new AnioMayor(2017),   
                    new CondicionOr(
                        new ContieneGenero("comedia"),
                        new ContieneGenero("documental")
                                    )
                            )                 
            
                )
            );
        System.out.println("---------------------");

    }
}
