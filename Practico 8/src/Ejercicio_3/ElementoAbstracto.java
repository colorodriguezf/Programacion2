package Ejercicio_3;

public abstract class ElementoAbstracto { 
	
	public abstract int cantidadCartasPorRegalo(String regalo);
	public abstract int cantidadCartasTotal();
	public abstract int cantidadNiniosMalos();
	
	//método template
	public double porcentajeCartasPorRegalo (String regalo){
		return (cantidadCartasPorRegalo(regalo)/cantidadCartasTotal()*100);
	}
}
