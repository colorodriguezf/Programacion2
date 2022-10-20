package Practico7b;
public class Comprimido extends Carpeta  {
    private double factor_compresion;

    public Comprimido(String nombre, double factor_compresion) {
        super(nombre);
        this.factor_compresion = factor_compresion;
    }    

    
    public double getFactor_compresion() {
        return factor_compresion;
    }
    
    public void setFactor_compresion(double factor_compresion) {
        this.factor_compresion = factor_compresion;
    }
    
    @Override
    public double getTamanio() {
        return super.getTamanio()*factor_compresion;
    }

}
