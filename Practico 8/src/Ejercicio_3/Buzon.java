package Ejercicio_3;

import java.util.ArrayList;

public class Buzon extends ElementoAbstracto {
    ArrayList<Ninio>ninios_buenos;
	ArrayList<Carta> cartas;
	private String carbon = "carbon";
   
    public void addNinioBueno(Ninio ninio){
		if ((ninio != null) && (!this.ninios_buenos.contains(ninio))){
			this.ninios_buenos.add(ninio);
		}
	}
	
	public void addCarta (Carta carta){
		if (!this.ninios_buenos.contains(carta.getRemitente())){
			carta.cambioRegaloPorCarbon(carbon);
		}
		else{
			if (!this.cartas.contains(carta)) {
				this.cartas.add(carta);
            }
		}
	}
   
    @Override
    public int cantidadCartasPorRegalo(String regalo) {
        int cantidad = 0;
        for (Carta carta : cartas) {
            if(carta.tieneRegalo(regalo)) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    @Override
    public int cantidadCartasTotal() {
        return this.cartas.size();
    }

    @Override
    public int cantidadNiniosMalos() {
        return this.ninios_buenos.size() - this.cartas.size();
    }
    
}
