package Ejercicio_5;

import java.time.LocalDate;

public class CongeladoXNitrogeno extends ProductoCongelado {

    public CongeladoXNitrogeno(String nombre, LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado,
            String granjaOrigen, int codigo_organismo_supervision, double temperatura_mantenimiento_recomendada) {
        super(nombre, fecha_vencimiento, numero_lote, fecha_envasado, granjaOrigen, codigo_organismo_supervision,
                temperatura_mantenimiento_recomendada);
    }
    
}
