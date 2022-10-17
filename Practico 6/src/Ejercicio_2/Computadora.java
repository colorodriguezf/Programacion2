package Ejercicio_2;

public class Computadora extends ElementoCola {
    private double velocidadCpu;
    private String nombre;
    private Proceso proc;
    
    public Computadora(String nombre, double velocidadCpu) {
        this.velocidadCpu = velocidadCpu;
        this.nombre = nombre;
        this.proc = null;
    }

    public double getVelocidadCpu() {
        return velocidadCpu;
    }
    public void setVelocidad(double velocidadCpu) {
        this.velocidadCpu = velocidadCpu;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ejecutarProceso(Proceso p) {
        this.proc = p;
    }

    @Override
    public String toString() {
        return "Computadora {" +
                "velocidad cpu= " + velocidadCpu +
                ", nombre= '" + nombre + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean esMayor(ElementoCola otro) {
        return this.getVelocidadCpu() > ((Computadora) otro).getVelocidadCpu();        
    }
    
}
