package Practico7a.Ejercicio_4.Ficha;

public class Ficha {
    private String nombre;
    private int fortaleza;
    private int espacio_tablero;
    private double poder_destruccion;

    public Ficha(String nombre, int fortaleza, int espacio_tablero, double poder_destruccion) {
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.espacio_tablero = espacio_tablero;
        this.poder_destruccion = poder_destruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getEspacioTablero() {
        return espacio_tablero;
    }

    public void setEspacioTablero(int espacio_tablero) {
        this.espacio_tablero = espacio_tablero;
    }

    public double getPoderDestruccion() {
        return poder_destruccion;
    }

    public void setPoderDestruccion(double poder_destruccion) {
        this.poder_destruccion = poder_destruccion;
    }

    
    @Override
    public String toString() {
      return "nombre: " + this.getNombre() + ", fortaleza: " + this.getFortaleza() + ", espacio que ocupa: " + this.getEspacioTablero() + ", poder de destruccion: " + this.getPoderDestruccion() + "\n";
    }
    
}
