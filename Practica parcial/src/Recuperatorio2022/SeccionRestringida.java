package Recuperatorio2022;
import java.util.ArrayList;
import Recuperatorio2022.filtros.Filtro;

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
        SeccionRestringida copia = new SeccionRestringida(this.getCategoria());
        for(String categoria : copia.getCategoriasPermitidas()) {
            copia.setCategoriasPermitidas(categoria);
        }
        for(ElementoPortal copiHijo : hijosQueCumplen) {
            copia.addElemento(copiHijo);
        }
        return copia;
       }
       else { //ningun hijo fue duplicado, devuelvo null (no duplico la seccion)
        return null;
       }
    }




    
}
