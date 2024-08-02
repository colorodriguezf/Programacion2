package Final_17_febrero;
import java.util.ArrayList;

public class Vagon extends FFAA{
    private String tipo;
    private ArrayList<FFAA> elementos;

    public Vagon(String tipo) {
        this.tipo = tipo;
        this.elementos = new ArrayList<FFAA>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<FFAA> getElementos() {
        return new  ArrayList<FFAA>(elementos);
    }

    public void setElementos(FFAA elemento) {
        if(!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }

    

    
}
