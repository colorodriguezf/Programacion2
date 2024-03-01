package Parcial_2022_Plus;
import java.util.ArrayList;

import Parcial_2022_Plus.filtros.Filtro;

public class Seccion extends ElementoPortal {
    protected ArrayList<ElementoPortal> elementos;
	private String defecto;
	private int posicion;
	
	public Seccion(String defecto, int posicion){
		this.elementos = new ArrayList<>();
		this.defecto = defecto;
		this.posicion = posicion;
	}

	public String getDefecto() {
		return defecto;
	}

	public void setDefecto(String defecto) {
		this.defecto = defecto;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public void agregarElemento (ElementoPortal e){
		this.elementos.add(e);
	}

	@Override //a-1
	public String getCategoria() {
		if (posicion > elementos.size()) {
            return "Sin definir";
        }
		else {
			return elementos.get(posicion).getCategoria();
		}
	}

	@Override //a-2
	public ArrayList<String> getPalClaves() {
		ArrayList<String> palClaves = new ArrayList<String>();
		for(ElementoPortal e : elementos) {
			ArrayList<String> palH = e.getPalClaves();
			for(String palabra : palH) {
				if(!palClaves.contains(palabra)) {
					palClaves.add(palabra);
				}
			}
		}
		return palClaves;
	}

	@Override //b
	public ArrayList<Noticia> getNoticiasQue(Filtro f) {
		ArrayList<Noticia> noticias = new ArrayList<Noticia>();
		for (ElementoPortal e : elementos) {
			noticias.addAll(e.getNoticiasQue(f));
		}
		return noticias;
	}

	@Override //PLUS
	public ElementoPortal getCopiaFiltrada(Filtro f) {
	ArrayList<ElementoPortal> hijosQueCumplen = new ArrayList<>();
	for(ElementoPortal e : elementos){
		ElementoPortal cumplenHijo = e.getCopiaFiltrada(f);
		if(cumplenHijo!=null){
			hijosQueCumplen.add(cumplenHijo);
		}
	}
	if(hijosQueCumplen.size() > 0) {
		Seccion seccionCopia = new Seccion(defecto, posicion);
		for(ElementoPortal e : hijosQueCumplen) {
			seccionCopia.agregarElemento(e);
		}
		return seccionCopia;
	}
	else {
		return null;
	}

	}

	//PLUS agregar ordenado:
	public void agregarElementoOrdenado(ElementoPortal e) {
		int pos = 0;
		while(pos < this.elementos.size() && this.elementos.get(pos).compareTo(e) < 0){
			pos++;
		}
		elementos.add(pos, e);
	}



}
