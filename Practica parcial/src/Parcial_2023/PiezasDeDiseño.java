package Parcial_2023;

import java.util.ArrayList;

import Parcial_2023.filtros.Filtro;

public class PiezasDeDiseño extends PiezaCompuesta {
    private Filtro f;
    private ArrayList<Empresa> elementos;

    public PiezasDeDiseño(String nombre, String descripcion, int gr_adicional_pla, int seg_extra, int precio_grpla,
            int precio_segundo, Filtro f) {
        super(nombre, descripcion, gr_adicional_pla, seg_extra, precio_grpla, precio_segundo);
        this.f = f;
        this.elementos = new ArrayList<>();
    }  

    public Filtro getF() {
        return f;
    }

    public void setF(Filtro f) {
        this.f = f;
    }

    public ArrayList<Empresa> getElementos() {
        return new ArrayList<Empresa>(elementos);
    }
    public void setElemento(Empresa e) {
        if(!f.cumple(e)) {
            elementos.add(e);
        }
    }

    
}
