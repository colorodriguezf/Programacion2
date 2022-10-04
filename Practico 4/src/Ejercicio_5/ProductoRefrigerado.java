package Ejercicio_5;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
    private int codigo_organismo_supervision;
    private double temperatura_mantenimiento_recomendada;

    public ProductoRefrigerado(String nombre, LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado,
            String granjaOrigen, int codigo_organismo_supervision, double temperatura_mantenimiento_recomendada) {
        super(nombre, fecha_vencimiento, numero_lote, fecha_envasado, granjaOrigen);
    }

    public int getCodigo_organismo_supervision() {
        return codigo_organismo_supervision;
    }

    public void setCodigo_organismo_supervision(int codigo_organismo_supervision) {
        this.codigo_organismo_supervision = codigo_organismo_supervision;
    }

    public double getTemperatura_mantenimiento_recomendada() {
        return temperatura_mantenimiento_recomendada;
    }

    public void setTemperatura_mantenimiento_recomendada(double temperatura_mantenimiento_recomendada) {
        this.temperatura_mantenimiento_recomendada = temperatura_mantenimiento_recomendada;
    }

    


}