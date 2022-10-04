package Ejercicio_5;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {
    private int codigo_organismo_supervision;
    private double temperatura_mantenimiento_recomendada;

    public ProductoCongelado(String nombre,LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado,
            String granjaOrigen, int codigo_organismo_supervision, double temperatura_mantenimiento_recomendada) {
        super(nombre, fecha_vencimiento, numero_lote, fecha_envasado, granjaOrigen);
        this.codigo_organismo_supervision = codigo_organismo_supervision;
        this.temperatura_mantenimiento_recomendada = temperatura_mantenimiento_recomendada;
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

    @Override
	public String toString() {
		return "[Codigo organismo de supervision=" + codigo_organismo_supervision +", Temperatura recomendada =" + temperatura_mantenimiento_recomendada + " grados]";
	}

}
