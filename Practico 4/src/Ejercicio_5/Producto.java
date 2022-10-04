package Ejercicio_5;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private LocalDate fecha_vencimiento;
    private int numero_lote;
    private LocalDate fecha_envasado;
    private String granjaOrigen;

    public Producto(String nombre, LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado, String granjaOrigen) {
        this.nombre = nombre;
        this.fecha_vencimiento = fecha_vencimiento;
        this.numero_lote = numero_lote;
        this.fecha_envasado = fecha_envasado;
        this.granjaOrigen = granjaOrigen;
        
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getNumero_lote() {
        return numero_lote;
    }

    public void setNumero_lote(int numero_lote) {
        this.numero_lote = numero_lote;
    }

    public LocalDate getFecha_envasado() {
        return fecha_envasado;
    }

    public void setFecha_envasado(LocalDate fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
	public String toString() {
		return "Producto: [nombre=" + nombre +", Fecha vencimiento =" + fecha_vencimiento + " proveniente de la granja: "+granjaOrigen+ "]";
	}

}
