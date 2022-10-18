package Practico7a.Ejercicio_1;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estados_patologicos_a_tratar;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estados_patologicos_a_tratar = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEstadosPatologicosATratar() {
        return new ArrayList<String>(estados_patologicos_a_tratar);
    }

    public void addEstadoPatologico(String estado) {
        if ((estado != "") && (!estados_patologicos_a_tratar.contains(estado))) {
            estados_patologicos_a_tratar.add(estado);
        }   
    }

    @Override
    public boolean equals(Object obj) {
      Enfermedad enfermedad = (Enfermedad)obj;
      return enfermedad.getNombre() == this.getNombre();
    }    
    

    
}
