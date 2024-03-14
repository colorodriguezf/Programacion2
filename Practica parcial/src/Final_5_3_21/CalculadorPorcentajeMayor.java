package Final_5_3_21;

public class CalculadorPorcentajeMayor extends Calculador {
    private int porcentaje;
    

    public CalculadorPorcentajeMayor(int porcentaje) {
        this.porcentaje = porcentaje;
    }    

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public boolean cumpleCondicion(int cantidad, int baches) {
       return (baches * 100 / cantidad) > porcentaje;
    }

    
}
