package Ejercicio_3;

import java.util.ArrayList;

public class Zona extends ElementoAbstracto{
    private ArrayList<ElementoAbstracto> elementos;
	
	public Zona(){
		this.elementos = new ArrayList<>();
	}

    public void addElemento(ElementoAbstracto elemento){
		this.elementos.add(elemento);
	}

    @Override
    public int cantidadCartasPorRegalo(String regalo) {
        int cantidad = 0;
		for(ElementoAbstracto elemento : elementos){
			cantidad += elemento.cantidadCartasPorRegalo(regalo);
		}
		return cantidad;
    }

    @Override
    public int cantidadCartasTotal() {
        int cantidad = 0;
		for(ElementoAbstracto elemento : elementos){
			cantidad += elemento.cantidadCartasTotal();
		}
		return cantidad;
    }

    @Override
    public int cantidadNiniosMalos() {
        int cantidad = 0;
		for (ElementoAbstracto elemento : elementos) {
			cantidad += elemento.cantidadNiniosMalos();
        }
		return cantidad;
    }
    
}
