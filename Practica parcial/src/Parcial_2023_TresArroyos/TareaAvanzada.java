package Parcial_2023_TresArroyos;

import java.util.ArrayList;

public class TareaAvanzada extends TareaCompleja {

    public TareaAvanzada(String nombre) {
        super(nombre);
    }

    @Override
    public int getDtiempo() {
        int mayor = 0;
        for(Empresa e : elementos) {
            if(e.getDtiempo() >= mayor) {
                mayor = e.getDtiempo();
            }
        }
        return mayor;
    }

    @Override
    public ArrayList<String> getMateriales() {
        ArrayList<String> materiales = new ArrayList<>();
        for(Empresa e : elementos) {
            materiales.addAll(e.getMateriales());
        }
        return materiales;
    }

    @Override
    public int getNempleados() {
        int total = 0;
        for(Empresa e : elementos) {
            total+=e.getNempleados();
        }
        return total;
    }
    
}
