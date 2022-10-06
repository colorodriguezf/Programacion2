package Ejercicio_3;

public class CerealPastura extends Cereal{
    private int min_cantidad_hectareas;

    public CerealPastura(String nombre, int min_cantidad_hectareas) {
        super(nombre);
        this.min_cantidad_hectareas = min_cantidad_hectareas;
    }

    
        public int getMin_cantidad_hectareas() {
            return min_cantidad_hectareas;
        }
    
        public void setMin_cantidad_hectareas(int min_cantidad_hectareas) {
            this.min_cantidad_hectareas = min_cantidad_hectareas;
        }


    @Override
    protected boolean cumple(Lote lote) {
        if(lote.getHectareas() >= this.getMin_cantidad_hectareas()) {
            return true;
        }
        return false;
    }



    
    
}
