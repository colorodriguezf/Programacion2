package Ejercicio_5;

import java.time.LocalDate;

public class CongeladoXAire extends ProductoCongelado{
    private double cantidad_nitrogeno;
    private double cantidad_oxigeno;
    private double cantidad_co2;
    private double cantidad_vapor_agua;

    public CongeladoXAire(String nombre,LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado, String granjaOrigen ,
            int codigo_organismo_supervision, double temperatura_mantenimiento_recomendada,
            double cantidad_nitrogeno, double cantidad_oxigeno, double cantidad_co2, double cantidad_vapor_agua){
        super(nombre, fecha_vencimiento, numero_lote, fecha_envasado, granjaOrigen, codigo_organismo_supervision, temperatura_mantenimiento_recomendada);
        this.cantidad_nitrogeno = cantidad_nitrogeno;
        this.cantidad_oxigeno = cantidad_oxigeno;
        this.cantidad_co2 = cantidad_co2;
        this.cantidad_vapor_agua = cantidad_vapor_agua; 
    }

    public double getCantidad_nitrogeno() {
        return cantidad_nitrogeno;
    }

    public void setCantidad_nitrogeno(double cantidad_nitrogeno) {
        this.cantidad_nitrogeno = cantidad_nitrogeno;
    }

    public double getCantidad_oxigeno() {
        return cantidad_oxigeno;
    }

    public void setCantidad_oxigeno(double cantidad_oxigeno) {
        this.cantidad_oxigeno = cantidad_oxigeno;
    }

    public double getCantidad_co2() {
        return cantidad_co2;
    }

    public void setCantidad_co2(double cantidad_co2) {
        this.cantidad_co2 = cantidad_co2;
    }

    public double getCantidad_vapor_agua() {
        return cantidad_vapor_agua;
    }

    public void setCantidad_vapor_agua(double cantidad_vapor_agua) {
        this.cantidad_vapor_agua = cantidad_vapor_agua;
    }

    
}
