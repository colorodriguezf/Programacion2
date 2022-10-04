package Ejercicio_2;

import java.util.ArrayList;

public class Alarma {
    private ArrayList<Sensor> sensores;

    public Alarma() {
        this.sensores = new ArrayList<>();
    }
    
    
    public void comprobar(Sensor sensor) {
            if(sensor.isActivado()) {
                activarAlarma(sensor.getNombreZona());
            }
        }
    
    public void activarAlarma(String nombreZona) {       
            dispararAlarma(nombreZona);
    }
    

    public void dispararAlarma(String nombre_zona) {
        Timbre.hacerSonar();
        Luz.encender();
        System.out.println("Sensor activado: "+ nombre_zona);
    }

    public ArrayList<Sensor> getSensores() {
        return new ArrayList<Sensor>(this.sensores);
    }

    public void setSensores(Sensor sensor) {
        if(sensor != null) {
            sensores.add(sensor);
        }
        else {
            System.out.println("No puede agregar un sensor vacio");
        }
    }


    
}
