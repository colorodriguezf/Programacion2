package Parcial2022;

import java.util.ArrayList;
import java.util.Collection;
import Parcial2022.filtros.Filtro;

public abstract class ElementoPortal {
    public abstract String getCategoria();
	public abstract ArrayList<String> getPalabrasClaves();
	public abstract ArrayList<Noticia> buscarNoticias(Filtro f);
}
