package Parcial_2023;
import java.util.ArrayList;

import Parcial_2023.filtros.Filtro;

public class PiezaCompuesta extends Empresa {
    private ArrayList<Empresa> elementos;
    private int gr_adicional_pla;
    private int seg_extra;

    public PiezaCompuesta(String nombre, String descripcion, int gr_adicional_pla, int seg_extra,  int precio_grpla, int precio_segundo) {
        super(nombre, descripcion, precio_grpla, precio_segundo);
        this.elementos = new ArrayList<>();
        this.gr_adicional_pla = gr_adicional_pla;
        this.seg_extra = seg_extra;
    }

    public int getGr_adicional_pla() {
        return gr_adicional_pla;
    }

    public void setGr_adicional_pla(int gr_adicional_pla) {
        this.gr_adicional_pla = gr_adicional_pla;
    }

    public int getSeg_extra() {
        return seg_extra;
    }

    public void setSeg_extra(int seg_extra) {
        this.seg_extra = seg_extra;
    }

    public ArrayList<Empresa> getElementos() {
        return new ArrayList<Empresa>(this.elementos);
    }
    public void addElemento(Empresa elemento) {
        elementos.add(elemento);
    }

    @Override //1a
    public int getPla() {
       int totalPla = 0;
       for(Empresa e : elementos) {
        totalPla += e.getPla() + gr_adicional_pla;
       }
       return totalPla;
    }

    @Override //1b
    public int getTiempo() {
       int tiempoTotal = 0;
       for(Empresa e : elementos) {
        tiempoTotal += e.getTiempo();
       }
       return tiempoTotal + seg_extra;
    }
 
    @Override //1c
    public ArrayList<String> getColor() {
       ArrayList<String> colores = new ArrayList<>();
       for(Empresa e : elementos) {
        ArrayList<String> aux = e.getColor();
            for(String color : aux) {
                if(!colores.contains(color)) {
                    colores.add(color);
                }
            }
        }
        return colores;
    }

    @Override //2a
    public int getCantPiezas() {
       int cantPiezas = 0;
       for(Empresa e : elementos) {
        cantPiezas += e.getCantPiezas();
       }
       return cantPiezas;
    }

    @Override //2b
    public ArrayList<Pieza> getPiezasQue(Filtro f) {
        ArrayList<Pieza> cumplen = new ArrayList<>();
        for(Empresa e : elementos) {
            cumplen.addAll(e.getPiezasQue(f));
        }
        return cumplen;
    }

    @Override //3
    public int getCosto() {
       int total = 0;
       for(Empresa e : elementos) {
        
        total += e.getCosto();
       }
       return total;
    }
}
