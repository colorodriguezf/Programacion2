package Ejercicio_2;

public class Proceso extends ElementoCola {
    private String nombre;
    private double memoriaRequerida;

    public Proceso(String nombre, double memoriaRequerida) {
        this.nombre = nombre;
        this.memoriaRequerida = memoriaRequerida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMemoriaRequerida() {
        return memoriaRequerida;
    }

    public void setMemoriaRequerida(double memoriaRequerida) {
        this.memoriaRequerida = memoriaRequerida;
    }

    @Override
    public boolean esMayor(ElementoCola otro) {
       return this.getMemoriaRequerida() > ((Proceso) otro).getMemoriaRequerida();        
    }

    @Override
    public boolean equals(Object otro) {
        try {
            Proceso otroProceso = (Proceso) otro;
            return this.getNombre().equals(otroProceso.getNombre()) &&
                    this.getMemoriaRequerida() == (otroProceso).getMemoriaRequerida();
        }catch (Exception e) {
            return false;
        }
    }

    public String toString() {
        return "Proceso {" +
                "memoria requerida= " + getMemoriaRequerida() +
                ", nombre= '" + nombre + '\'' +
                '}'+"\n";
    }

    

    
    
}
