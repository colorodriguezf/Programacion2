package Practico7a.Ejercicio_4.Condicion.CondicionEspecifica.Fortaleza;
import Practico7a.Ejercicio_4.Condicion.Condicion;
import Practico7a.Ejercicio_4.Ficha.Ficha;

public class FortalezaMayor extends Condicion {
    private int fortaleza;

    public FortalezaMayor(int fortaleza) {
        this.fortaleza = fortaleza;
    }
    
    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getFortaleza() > fortaleza;
    }
    
}