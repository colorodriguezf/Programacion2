package Parcial_1;

import java.time.LocalDate;

public class PaquetePromo extends PaqueteSimple {
    private LocalDate fInicio;
    private LocalDate fFin;
    private double descuento;

    public PaquetePromo(int cantidadPersonas, int id, String origen, String destino, double costo, String datosAlo,
    LocalDate fInicio, LocalDate fFin, double descuento) {
        super(cantidadPersonas, id, origen, destino, costo, datosAlo);
        this.fInicio = fInicio;
		this.fFin = fFin;
		this.descuento = descuento;
    }
   

    public double getCosto() {
        if (this.getFechaPago() != null) {
            if(this.getFechaPago().isBefore(fFin) && this.getFechaPago().isAfter(fInicio)) {
                return super.getCosto() * descuento;
            }
        }
        return super.getCosto();
    }
    
    
}
