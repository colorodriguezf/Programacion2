package Final_17_febrero;
import java.util.ArrayList;

public class Asiento extends FFAA {
    private int id;
    private ArrayList<String> facilidades;
    private boolean ocupado;
    private Pasajero ocupado_por;

    public Asiento(int id) {
        this.id = id;
        this.facilidades = new ArrayList<String>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getFacilidades() {
        return new ArrayList<String>(facilidades);
    }

    public void setFacilidades(String facilidad) {
        if(!facilidades.contains(facilidad)) {
            facilidades.add(facilidad);
        }
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Pasajero getOcupado_por() {
        return ocupado_por;
    }

    public void setOcupado_por(Pasajero pasajero) {
        if(!isOcupado()) {
            setOcupado(true);
            ocupado_por = pasajero;
        }
    }

    

    
}
