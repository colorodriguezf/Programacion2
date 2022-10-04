package Ejercicio_1;

import java.util.ArrayList;

public class PersonaEncuestada extends Persona {
    private ArrayList<Encuesta> encuestasRespondidas;

    public PersonaEncuestada(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.encuestasRespondidas = new ArrayList<>();
    }

    public ArrayList<Encuesta> getEncuestasRespondidas() {
        return encuestasRespondidas;
    }

    public void setEncuestasRespondidas(Encuesta encuesta) {
       if(!this.encuestasRespondidas.contains(encuesta)) {
        encuestasRespondidas.add(encuesta);
       }
    }

    
}
