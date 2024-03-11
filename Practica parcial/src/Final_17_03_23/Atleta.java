package Final_17_03_23;

import java.util.ArrayList;

import Final_17_03_23.efectos.Efecto;

public class Atleta {
    private String nombre;
    private ArrayList<Entrenamiento> entrenamientos;
    private double frecuencia_cardiaca_maxima;
    private double cant_calorias_gastadas_dia;
    private int cant_pasos_dia;
    private double cant_hs_recuperacion;

    private ArrayList<Efecto> efectos;

    public Atleta(String nombre, double frecuencia_cardiaca_maxima, double cant_calorias_gastadas_dia,
            int cant_pasos_dia, double cant_hs_recuperacion) {
        this.nombre = nombre;
        this.frecuencia_cardiaca_maxima = frecuencia_cardiaca_maxima;
        this.cant_calorias_gastadas_dia = cant_calorias_gastadas_dia;
        this.cant_pasos_dia = cant_pasos_dia;
        this.cant_hs_recuperacion = cant_hs_recuperacion;
        this.entrenamientos = new ArrayList<Entrenamiento>();
        this.efectos = new ArrayList<Efecto>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Entrenamiento> getEntrenamientos() {
        return new ArrayList<Entrenamiento>(entrenamientos);
    }

    public void setEntrenamientos(Entrenamiento entrenamiento) {
        if(!entrenamientos.contains(entrenamiento)) {
            entrenamientos.add(entrenamiento);
        }
    }

    public double getFrecuencia_cardiaca_maxima() {
        return frecuencia_cardiaca_maxima;
    }

    public void setFrecuencia_cardiaca_maxima(double frecuencia_cardiaca_maxima) {
        this.frecuencia_cardiaca_maxima = frecuencia_cardiaca_maxima;
    }

    public double getCant_calorias_gastadas_dia() {
        return cant_calorias_gastadas_dia;
    }

    public void setCant_calorias_gastadas_dia(double cant_calorias_gastadas_dia) {
        this.cant_calorias_gastadas_dia = cant_calorias_gastadas_dia;
    }

    public int getCant_pasos_dia() {
        return cant_pasos_dia;
    }

    public void setCant_pasos_dia(int cant_pasos_dia) {
        this.cant_pasos_dia = cant_pasos_dia;
    }

    public double getCant_hs_recuperacion() {
        return cant_hs_recuperacion;
    }

    public void setCant_hs_recuperacion(double cant_hs_recuperacion) {
        this.cant_hs_recuperacion = cant_hs_recuperacion;
    }


    public ArrayList<Efecto> getEfectos() {
        return new ArrayList<Efecto>(efectos);
    }

    public void setEfectos(Efecto efecto) {
        this.efectos.add(efecto);
    }

    public void ejecutarEntrenamiento() {
        for (Entrenamiento e : entrenamientos) {
            for(Efecto efecto : efectos) {
                efecto.aplicarEfecto(this, e);
            }
        }
    }

    
    

    

}
