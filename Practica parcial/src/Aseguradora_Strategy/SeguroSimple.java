package Aseguradora_Strategy;
import java.util.ArrayList;
import Aseguradora_Strategy.calculadores.Calculador;
import Aseguradora_Strategy.filtros.Filtro;

public class SeguroSimple extends ElementoAseguradora {
    private int nroPoliza;
    private String descripcion;
    private double montoAsegurado;
    private int dni;
    private Calculador calculador;

    public SeguroSimple(int nroPoliza, String descripcion, double montoAsegurado, int dni, Calculador calculador) {
        super(dni);
        this.nroPoliza = nroPoliza;
        this.descripcion = descripcion;
        this.montoAsegurado = montoAsegurado;
        this.calculador = calculador;
    }

    
    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }
    
    public int getDni() {
        return dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }

    public Calculador getCalculador() {
        return calculador;
    }

    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }
    
    
    @Override //1
    public double getMontoAsegurado() {
        return montoAsegurado;
    }
    
    @Override //2
    public int getNroPoliza() {
        return nroPoliza;
    }

    @Override
    public double getCosto() {
       return calculador.getCostoPoliza(this);
    }
    
    @Override //3
    public ArrayList<SeguroSimple> getSegurosQue(Filtro f1) {
        ArrayList<SeguroSimple> seguro = new ArrayList<>();
        if(f1.cumple(this)) {
            seguro.add(this);
        }
        return seguro;
    }

    @Override
    public String toString() {
        return "{Seguro: "+getDescripcion()+",$, asegurado:  "+getMontoAsegurado()+", monto total: "+getCosto()+"}";
    }

}