package Final_23_febrero;

import java.util.ArrayList;

class Pasajero {
    private String nombre;
    private int edad;
    private ArrayList<String> preferencias;

    public Pasajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.preferencias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<String> getPreferencias() {
        return new ArrayList<String>(preferencias);
    }

    public void setPreferencias(String preferencia) {
        if(!preferencias.contains(preferencia)) {
            preferencias.add(preferencia);
        }
    }
    
}
