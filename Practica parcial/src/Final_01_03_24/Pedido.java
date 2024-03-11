package Final_01_03_24;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<ElementoSimple> orden;
    private int mesa;
    private String mozo;

    public Pedido(int mesa, String mozo) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.orden = new ArrayList<>();
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getMozo() {
        return mozo;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    public ArrayList<ElementoSimple> getElementos() {
        return new ArrayList<ElementoSimple>();
    }

    public void setElementos(ElementoSimple elemento) {
        if(!orden.contains(elemento)) {
            orden.add(elemento);
        }
    }

    

    
}
