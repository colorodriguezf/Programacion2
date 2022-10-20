package Practico7a.Ejercicio_4;
import Practico7a.Ejercicio_4.Condicion.CondicionEspecifica.EspacioOcupa.*;
import Practico7a.Ejercicio_4.Condicion.CondicionEspecifica.PoderDestruccion.*;
import Practico7a.Ejercicio_4.Condicion.CondicionEspecifica.Fortaleza.*;
import Practico7a.Ejercicio_4.Condicion.CondicionLogica.*;
import Practico7a.Ejercicio_4.Ficha.*;

public class MainCandyCrush {
    public static void main(String[] args) {
        Tablero t1 = new Tablero(1000);
        Ficha fverde = new Ficha("Verde",1,1,0);
        Ficha famarilla = new Ficha("Amarilla",1,1,0);
        Ficha froja = new Ficha("Roja",1,1,0);
        Ficha fpiedra = new Ficha("Piedra",6,1,0);
        Ficha ftorta = new FichaEspecial("Torta",8,4,4);

        t1.addFicha(fverde);
        t1.addFicha(famarilla);
        t1.addFicha(froja);
        t1.addFicha(fpiedra);
        t1.addFicha(ftorta);
        
        System.out.println("a) Fichas que posean un poder de destrucción mayor a 2: "+t1.getFichasQue(new PoderDestruccionMayor(2)));
        System.out.println("---------------------");
        System.out.println("b) Fichas que ocupen más de 3 lugares: "+t1.getFichasQue(new EspacioOcupaMayor(3)));
        System.out.println("---------------------");
        System.out.println("c) Fichas que fichas que tengan una fortaleza mayor a 5: "+t1.getFichasQue(new FortalezaMayor(5)));
        System.out.println("---------------------");
        System.out.println("d) Combinaciones lógicas de los anteriores: "+ 
                                    t1.getFichasQue(new CondicionOr(
                                                        new PoderDestruccionMayor(3),
                                                        new EspacioOcupaMayor(0)
                                    )));
    }
}
