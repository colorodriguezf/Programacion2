package Aseguradora_Strategy;
import java.util.ArrayList;

import Aseguradora_Strategy.filtros.Filtro;

public class SeguroIntegrador extends ElementoAseguradora {
    private ArrayList<ElementoAseguradora> elementos;

    public SeguroIntegrador(int dni) {
        super(dni);
        this.elementos = new ArrayList<>();
    }

    public void setElemento(ElementoAseguradora elemento) {
        if(!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }

    @Override //1
    public double getMontoAsegurado() {
        double total = 0;
        for(ElementoAseguradora elemento : elementos) {
            total += elemento.getMontoAsegurado();
        }
        return total;
    }

    @Override //2
    public int getNroPoliza() {
        int mayor =0;
        for(ElementoAseguradora elemento : elementos) {
            if(elemento.getNroPoliza() > mayor) {
                mayor = elemento.getNroPoliza();
            }
        }
        return mayor;
    }

    @Override //3
    public double getCosto() {
        double costoTotal = 0;
        for(ElementoAseguradora elemento : elementos) {
            costoTotal += elemento.getCosto();
        }
        return costoTotal;
    }

    @Override //4
    public ArrayList<SeguroSimple> getSegurosQue(Filtro f) {
        ArrayList<SeguroSimple> seguros = new ArrayList<>();
        for(ElementoAseguradora elemento : elementos) {
            seguros.addAll(elemento.getSegurosQue(f));
        }
        return seguros;
    }

}
