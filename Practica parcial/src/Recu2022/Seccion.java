package Recu2022;

import java.util.ArrayList;
import Recu2022.filtros.Filtro;

public class Seccion extends ElementoPortal {
    protected ArrayList<ElementoPortal> elementos;
    
    public Seccion(String categoria) {
        super(categoria);
        this.elementos = new ArrayList<>();
    }
    public void addElemento(ElementoPortal elemento) {
        int pos = 0;
        while(pos < this.elementos.size() && this.elementos.get(pos).compareTo(elemento) < 0 ) {
                pos++;
               }
               this.elementos.add(pos, elemento);
    }

    @Override //1
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> palabras = new ArrayList<>();
        for(ElementoPortal elemento : elementos) {
            ArrayList<String> palH = elemento.getPalabrasClaves();
            for(String palabra : palH) {
                if(!palabras.contains(palabra)) {
                    palabras.add(palabra);
                }
            }
        }
        return palabras;
    }
    @Override
    public ElementoPortal getCopiaRestringidaFiltrada(Filtro f) {    
    ArrayList<ElementoPortal> hijosQueCumplen = new ArrayList<>();
    for (ElementoPortal elemento : elementos) {
     ElementoPortal copiaHija = elemento.getCopiaRestringidaFiltrada(f);
     if(copiaHija != null) {
         hijosQueCumplen.add(copiaHija);
     }
    }
    if(hijosQueCumplen.size() > 0) { //algun hijo fue duplicado, debo retorar la seccion
     Seccion copia = new Seccion(this.getCategoria());
     for(ElementoPortal copiaHijo : hijosQueCumplen) {
         copia.addElemento(copiaHijo);
     }
     return copia;
    }
    else { //ningun hijo fue duplicado, devuelvo null (no duplico la seccion)
     return null;
    }
    }

    
}
