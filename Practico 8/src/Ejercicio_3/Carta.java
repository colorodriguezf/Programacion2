package Ejercicio_3;

import java.util.ArrayList;

public class Carta {
    private Ninio remitente;
	private ArrayList<String> regalos;

    public Carta (Ninio remitente){
		this.remitente = remitente;
		this.regalos = new ArrayList<>();
	}

	public Ninio getRemitente() {
		return remitente;
	}

	public void setRemitente(Ninio remitente) {
		this.remitente = remitente;
	}

	public void addRegalo(String regalo){
		regalos.add(regalo);
	}

    public boolean tieneRegalo(String regalo){
		return this.regalos.contains(regalo);
	}

    public void cambioRegaloPorCarbon(String carbon) {
		regalos.clear();
		regalos.add(carbon);
	}

}
