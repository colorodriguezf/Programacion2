package Parcial_2023_TresArroyos;

import java.util.ArrayList;

import Parcial_2023_TresArroyos.calculador.Calculador;
import Parcial_2023_TresArroyos.filtro.FiltroEmpresa;

public class PresupuestoBasico extends Empresa {
    private ArrayList<String> materiales;
    private int n_empleados;
    private int d_tiempo; //en dias
    private Calculador c;

    public PresupuestoBasico(String nombre, int n_empleados, int d_tiempo, Calculador c) {
        super(nombre);
        this.n_empleados = n_empleados;
        this.d_tiempo = d_tiempo;
        this.materiales = new ArrayList<>();
        this.c = c;
    }

    public Calculador getC() {
        return c;
    }

    public void setC(Calculador c) {
        this.c = c;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNempleados(int n) {
        n_empleados = n;
    }

    public void setDtiempo(int d) {
        d_tiempo = d;
    }

    public void setMaterial(String material) {
        if(!materiales.contains(material)) {
            materiales.add(material);
        }
    }
    
    @Override
    public ArrayList<String> getMateriales() {
        return new ArrayList<String>(materiales);
    }

    @Override
    public int getNempleados() {
        return n_empleados;
    }

    @Override
    public int getDtiempo() {
        return d_tiempo;
    }

    @Override
    public ArrayList<Empresa> getElementosCumple(FiltroEmpresa f) {
        ArrayList<Empresa> elementos = new ArrayList<>();
        if(f.cumple(this)) {
            elementos.add(this);
        }
        return elementos;
    }

    @Override
    public double getCosto() {
        return c.getCosto(this);
    }

    //ADICIONAL
    @Override
    public Empresa getCopiaFiltrada(FiltroEmpresa f) {
        if(f.cumple(this)) {
            PresupuestoBasico copia = new PresupuestoBasico(nombre, n_empleados, d_tiempo, c);
            for(String m : materiales){
                copia.setMaterial(m);
            }
            return copia;
        }
        return null;
    }
}
