package Ejercicio_1;

import java.util.ArrayList;

import Ejercicio_1.Filtros.Filtro;

public abstract class AdministradorContenido {
    public abstract int cantidadNoticias();
    public abstract AdministradorContenido copiaFiltro(Filtro f);
	public abstract ArrayList<Noticia> buscarSegunFiltro(Filtro f);
	public abstract AdministradorContenido copia();
	public abstract String getMapeoSitio();

}
