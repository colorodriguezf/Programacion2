package Final_01_12_23.rentabilidad;

import java.util.ArrayList;

import Final_01_12_23.ElementoAseguradora;

public class VariacionMayorA implements EstrategiaRentabilidad {
    private int pos1;
    private int pos2;
    private int porcentaje;
    
    public VariacionMayorA(int pos1, int pos2, int porcentaje) {
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.porcentaje = porcentaje;
    }

    public int getPos1() {
        return pos1;
    }

    public void setPos1(int pos1) {
        this.pos1 = pos1;
    }

    public int getPos2() {
        return pos2;
    }

    public void setPos2(int pos2) {
        this.pos2 = pos2;
    }
    
    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public boolean esRentable(ElementoAseguradora ea) {
        ArrayList<Integer> valores = ea.getValoresCierre();
        return ((valores.get(pos1) - valores.get(pos2)) / valores.get(pos2) * 100 > porcentaje);
    }

    
}
