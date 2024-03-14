package Final_5_3_21;

import java.sql.Timestamp;
import java.util.ArrayList;

import Final_5_3_21.Servicios.Baches.Bache;

public class Registro extends Monitoreo {
    private int x;
    private int y;
    private int z;
    private Timestamp sensado;
    private Bache bache;

    public Registro(Timestamp inicio_recorrido, Timestamp final_recorrido, Bache bache) {
        super(inicio_recorrido, final_recorrido);
        this.x = x;
        this.y = y;
        this.z = z;
        this.bache = bache;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Timestamp getSensado() {
        return sensado;
    }

    public void setSensado(Timestamp sensado) {
        this.sensado = sensado;
    }

    public Bache getBache() {
        return bache;
    }

    public void setBache(Bache bache) {
        this.bache = bache;
    }

    // 1 saber si el registro es generado por un bache
    public boolean representaBache() {
        return bache.generadoPorBache(this);
    }

    @Override //2
    public ArrayList<Monitoreo> getElementoDeteriorado(Bache b) {
        ArrayList<Monitoreo> cumple = new ArrayList<>();
        if(b.generadoPorBache(this)) {
            cumple.add(this);
        }
        return cumple;
    }

    @Override 
    public int getCantBaches(Bache b) {
        if(b.generadoPorBache(this)) {
            return 1;
        }
        return 0;
    }
    @Override 
    public int getCantRegistros() {
        return 1;
    }
    
}
