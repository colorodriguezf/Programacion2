package Recu2022;

import java.util.ArrayList;

import Recu2022.filtros.Filtro;

public class SeccionRestringida extends Seccion {
    private ArrayList<String> categoriasPermitidas;

    public SeccionRestringida(String categoria) {
        super(categoria);
        this.categoriasPermitidas = new ArrayList<String>();
    }

    public ArrayList<String> getCategoriasPermitidas() {
        return new ArrayList<String>(this.categoriasPermitidas);
    }

    public void setCategoriasPermitidas(String categoria) {
        if(!categoriasPermitidas.contains(categoria)) {
            categoriasPermitidas.add(categoria);
        }
    }

    @Override
    public ElementoPortal getCopiaRestringidaFiltrada(Filtro f) {
        SeccionRestringida copia = new SeccionRestringida(this.getCategoria());
        for(ElementoPortal e : elementos) {
            if(getCategoriasPermitidas().contains(e.getCategoria())) {
                copia.addElemento(e.getCopiaRestringidaFiltrada(f));
            }
            for(String categoria : getCategoriasPermitidas()) {
                copia.setCategoriasPermitidas(categoria);
            }
        }
        return copia;
    }
    
    
}
