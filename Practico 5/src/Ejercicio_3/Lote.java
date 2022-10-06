package Ejercicio_3;

import java.util.ArrayList;

public class Lote {
    private String nombre;
    private ArrayList<String> minerales_lote;
    private double hectareas;
    private ArrayList<Cereal> cereales;

    public Lote(String nombre, double hectareas) {
        this.nombre = nombre;
        this.minerales_lote = new ArrayList<String>();
        this.hectareas = hectareas;
        this.cereales = new ArrayList<Cereal>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMineralesLote() {
        return new ArrayList<String>(this.minerales_lote);
    }

    public void setMineralesLote(String mineralesLote) {
        if(!this.minerales_lote.equals(mineralesLote)) {
            this.minerales_lote.add(mineralesLote);
        }
    }

    public double getHectareas() {
        return this.hectareas;
    }

    public void setHectareas(double hectareas) {
        this.hectareas = hectareas;
    }

    public void setCereal(Cereal cereal) {
        if (cereal != null)  {
            if(loteCumpleRequisitoCereal(cereal)) {
                this.cereales.add(cereal);
            }
        } 
    }

    public boolean loteCumpleRequisitoCereal(Cereal cereal) {
        int cant_minerales_lote = this.getMineralesLote().size();
        boolean cumple_requisitos = false;

        for(String mineral_cereal : cereal.getMineralesRequeridos()) {

            for(String mineral_lote : this.getMineralesLote() ) {
                if(mineral_cereal.equals(mineral_lote)) {
                    cant_minerales_lote--;
                }
                if ((cant_minerales_lote == 0) && (cereal.cumple(this))) {
                    cumple_requisitos = true;
                }
                else {
                    cumple_requisitos = false;
                }
            }
        }
        return cumple_requisitos;
    }

    public boolean equals(Object ob) {
		Lote l = ((Lote) ob);
		if (l.nombre.equals(this.nombre)) {
			return true;
		}
		return false;
	}


}
