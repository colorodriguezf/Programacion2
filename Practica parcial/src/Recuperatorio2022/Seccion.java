package Recuperatorio2022;
import java.util.ArrayList;

import Recuperatorio2022.filtros.Filtro;

public class Seccion extends ElementoPortal {
    protected ArrayList<ElementoPortal> elementos;

    public Seccion(String categoria) {
        super(categoria);
        this.elementos = new ArrayList<ElementoPortal>();
    }


    @Override //a-1
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> palabras = new ArrayList<String>();
        for(ElementoPortal elemento : elementos) {
            ArrayList<String> palHijas = elemento.getPalabrasClaves();
             for(String pal : palHijas) {
                if(!palabras.contains(pal)) {
                    palabras.add(pal);
                }
             }
        }
        return palabras;
    }

    //Insertamos ordenado, esta mal crear comparador
    public void addElemento(ElementoPortal elemento) {
        int pos = 0;
        while(pos < this.elementos.size() && this.elementos.get(pos).compareTo(elemento) < 0) {
            pos++;
        }
        this.elementos.add(pos, elemento);
    }


    @Override //b
    public ElementoPortal getCopiaFiltrada(Filtro f) {
       ArrayList<ElementoPortal> hijosQueCumplen = new ArrayList<>();
       for (ElementoPortal elemento : elementos) {
        ElementoPortal copiaHija = elemento.getCopiaFiltrada(f);
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
