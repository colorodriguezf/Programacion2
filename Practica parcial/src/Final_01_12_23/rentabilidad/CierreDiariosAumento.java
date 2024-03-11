package Final_01_12_23.rentabilidad;

import java.util.ArrayList;

import Final_01_12_23.ElementoAseguradora;

public class CierreDiariosAumento implements EstrategiaRentabilidad{

    @Override
    public boolean esRentable(ElementoAseguradora ea) {
            ArrayList<Integer> elementos = ea.getValoresCierre();
            boolean rentable = true;
            for (int i = 0; i < elementos.size() - 1; i++) {
                int actual = elementos.get(i);
                int siguiente = elementos.get(i + 1);
                if (actual >= siguiente) {
                    rentable = false;
                    return rentable;
                } 
            }
            return rentable;
    }
    
}
