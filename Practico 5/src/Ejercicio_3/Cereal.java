package Ejercicio_3;

import java.util.ArrayList;

public abstract class Cereal {
    private String nombre;
    private ArrayList<String> minerales_requeridos;

    public Cereal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMineralesRequeridos() {
        return new ArrayList<String>(this.minerales_requeridos);
    }

    public void setMineralesRequeridos(String mineral) {
        if(!this.minerales_requeridos.contains(mineral)) {
            this.minerales_requeridos.add(mineral);
        }
    }

    public boolean cumpleCondicionParaLote(Lote lote) {

		int cant_minerales_lote = this.getMineralesRequeridos().size();

		boolean tieneTodosMinerales = false;
		for (String mineralCereal : this.getMineralesRequeridos()) {
			for (String mineralLote : lote.getMineralesLote()) {
				if (mineralCereal.equals(mineralLote)) {
					cant_minerales_lote--;
				}
				if(cant_minerales_lote == 0) {
					tieneTodosMinerales = true;
				}
			}
		}
		if((tieneTodosMinerales)&&(cumple(lote))) {
			return true;
		}

		return false;
	}

    protected abstract boolean cumple(Lote lote);

    public boolean equals(Object ob) {
		Cereal c = ((Cereal)ob);
		if(c.nombre.equals(this.nombre)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return nombre;
	}

    
}
