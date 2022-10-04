package Ejercicio_5;

import java.time.LocalDate;

public class CongeladoXAgua extends ProductoCongelado {
    private double sal_gramosXLt_agua;

    public CongeladoXAgua(String nombre, LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado, String granjaOrigen, int codigo_organismo_supervision, 
                        double temperatura_mantenimiento_recomendada, double sal_gramosXLt_agua) {
        super(nombre, fecha_vencimiento, numero_lote, fecha_envasado, granjaOrigen, codigo_organismo_supervision, temperatura_mantenimiento_recomendada);
        this.sal_gramosXLt_agua = sal_gramosXLt_agua;
    }

    public double getSalGramosXLTAgua() {
        return sal_gramosXLt_agua;
    }

    public void setSalGramosXLTAgua(double sal_gramosXLt_agua) {
        this.sal_gramosXLt_agua = sal_gramosXLt_agua;
    }

    @Override
	public String toString() {
		return "[Cantidad de gramos de sal por litro de agua: "+sal_gramosXLt_agua+ "]";
	}
}
