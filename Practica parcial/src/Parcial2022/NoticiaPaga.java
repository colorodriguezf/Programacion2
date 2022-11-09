package Parcial2022;

import java.util.ArrayList;

import Parcial2022.filtros.Filtro;

public class NoticiaPaga extends Noticia {

    public NoticiaPaga(String contenido, String titulo, String autor, String categoria) {
        super(contenido, titulo, autor, categoria);
    }


	@Override
	public ArrayList<Noticia> buscarNoticias(Filtro f1) {
		ArrayList<Noticia> resultado = new ArrayList<Noticia>();
		resultado.add(this);
		return resultado;
	}
    
}
