package Parcial_2022_Plus;

import java.util.ArrayList;
import java.util.Collections;

public class SeccionEspecial extends Seccion{
    private int cantidad;
	private String categoria;

    public SeccionEspecial(String defecto, int cantidad, int posicion, String categoria){
		super(defecto, posicion);
		this.cantidad = cantidad;
		this.categoria = categoria;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String getCategoria() {
		return categoria;
	}
	
    @Override
	public ArrayList<String> getPalClaves() {
        ArrayList<String> palClaves = super.getPalClaves();
        Collections.sort(palClaves);

        ArrayList<String> resultado = new ArrayList<String>();
        for(int i = 0; i<=palClaves.size()&&  i<= cantidad; i++) {
            resultado.add(palClaves.get(i));
        }
        return resultado;
    }
}
