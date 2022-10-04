package Ejercicio_1;

import java.util.ArrayList;

public class Empresa {
  private String nombre;
  private ArrayList<Encuesta> encuestasRealizadas;
  private ArrayList<Encuesta> encuestasRespondidas;
  private double plusParaEmpleado;

public Empresa(String nombre) {
    this.plusParaEmpleado = 100;
    this.encuestasRealizadas = new ArrayList<>();
    this.encuestasRespondidas = new ArrayList<>();
}


public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public ArrayList<Encuesta> getEncuestasRealizadas() {
    return new ArrayList<Encuesta>(this.encuestasRealizadas);
}
public void setEncuestaARealizar(Encuesta encuesta) {
    if ((!this.encuestasRealizadas.contains(encuesta)) && (!this.encuestasRespondidas.contains(encuesta))) {
        //verificamos que la encuesta agregar no exista, ni este respondida, y la agregamos
        this.encuestasRealizadas.add(encuesta);
    }
}
public ArrayList<Encuesta> getEncuestasRespondidas() {
    return new ArrayList<Encuesta>(this.encuestasRespondidas);
}
public void setEncuestasRespondidas() {
    if (!this.encuestasRealizadas.isEmpty()) {
        for (Encuesta e : this.encuestasRealizadas) {
            if (!e.getPersonasQueRespondieron().isEmpty()) {
                this.encuestasRespondidas.add(e);
            }
        }
    }
}
public double getPlusParaEmpleado() {
    return plusParaEmpleado;
}
public void setPlusParaEmpleado(double plusParaEmpleado) {
    this.plusParaEmpleado = plusParaEmpleado;
}

public double getSueldoEmpleado(Empleado empleado) {

    double totalAcobrar = 0;
    int cantEncuestasPorEmpleado = 0;

    for (Encuesta e : this.encuestasRealizadas) {
        if (e.getEmpleadoEncuestador().equals(empleado)) {
            cantEncuestasPorEmpleado++;
        }
    }

    totalAcobrar = (empleado.getSueldo() + (cantEncuestasPorEmpleado * this.plusParaEmpleado));

    return totalAcobrar;
}


  

}
