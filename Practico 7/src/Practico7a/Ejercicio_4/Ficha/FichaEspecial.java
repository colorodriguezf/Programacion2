package Practico7a.Ejercicio_4.Ficha;

public class FichaEspecial extends Ficha {

    public FichaEspecial(String nombre, int fortaleza, int espacio_tablero, int poder_destruccion) {
        super(nombre, fortaleza, espacio_tablero, poder_destruccion);
    }

    @Override
    public double getPoderDestruccion(){
      // Sino hace la division entre int, dando como resultado un int (En vez de un double)
      return (double)this.getFortaleza() / (double)this.getEspacioTablero();
    }
    
}
