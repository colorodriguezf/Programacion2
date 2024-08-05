package Parcial_2023_TresArroyos;

import java.util.ArrayList;

import Parcial_2023_TresArroyos.filtro.FiltroEmpresa;

public class TareaCompleja extends Empresa {
    protected ArrayList<Empresa> elementos;

    public TareaCompleja(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void setElemento(Empresa e) {
        if(!elementos.contains(e)) {
            elementos.add(e);
        }
    }
    
    public ArrayList<Empresa> getElementos() {
        return new ArrayList<Empresa>(this.elementos);
    }

    @Override
    public ArrayList<String> getMateriales() {
       ArrayList<String> materiales = new ArrayList<>();
       for(Empresa e : elementos) {
        ArrayList<String> materiales_hijo = e.getMateriales();
        for(String m : materiales_hijo) {
            if(!materiales.contains(m)) {
                materiales.add(m);
            }
        }
       }
       return materiales;
    }

    @Override
    public int getNempleados() {
        int mayor = 0;
        for(Empresa e : elementos) {
            if(e.getNempleados() >= mayor) {
                mayor = e.getNempleados();
            }
        }
        return mayor;
    }

    @Override
    public int getDtiempo() {
        int tiempo = 0;
        for(Empresa e : elementos) {
            tiempo+=e.getDtiempo();
        }
        return tiempo;
    }

    @Override
    public ArrayList<Empresa> getElementosCumple(FiltroEmpresa f) {
        ArrayList<Empresa> elementos = new ArrayList<>();
        if(f.cumple(this)) {
            elementos.add(this);
        } else {
            for(Empresa e : elementos) {
                if(f.cumple(e)) {
                    elementos.add(e);
                }
            }
        }
        return elementos;
    }

    @Override
    public double getCosto() {
        double total = 0;
        for(Empresa e : elementos) {
            total+=e.getCosto();
        }
        return total;
    }

    //ADICIONAL
    @Override
    public Empresa getCopiaFiltrada(FiltroEmpresa f) {
        ArrayList<Empresa> hijosQueCumplen = new ArrayList<>();
        for(Empresa e : elementos) {
            Empresa hijo = e.getCopiaFiltrada(f);
            if(hijo != null) {
                hijosQueCumplen.add(hijo);
            }
        }
        if(hijosQueCumplen.size() > 0) {
            TareaCompleja tccopia = new TareaCompleja(nombre);
            for(Empresa e : hijosQueCumplen) {
                tccopia.setElemento(e);
            }
            return tccopia;
        }
        return null;
    }
}
