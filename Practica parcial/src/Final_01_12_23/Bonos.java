package Final_01_12_23;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

import Final_01_12_23.filtros.Filtro;

public class Bonos extends Accion {
    private String entidadEmisora;
    private Date fecha_emision;
    private Date fecha_vencimiento;

    public Bonos(String nombre, String simbolo,  int ultimoValorOperado, String entidadEmisora, Date fecha_emision, Date fecha_vencimiento) {
        super(nombre, ultimoValorOperado, simbolo);
        this.entidadEmisora = entidadEmisora;
        this.fecha_emision = fecha_emision;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    


    public String getEntidadEmisora() {
        return entidadEmisora;
    }

    public void setEntidadEmisora(String entidadEmisora) {
        this.entidadEmisora = entidadEmisora;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    @Override
    public void cerrar() {
        Date hoy = new Date();
        if(hoy.after(fecha_emision) && hoy.before(fecha_vencimiento)){
            if (!valoresCierre.isEmpty()) {
                valoresCierre.add(0, ultimoValorOperado);
            } else {
                valoresCierre.add(ultimoValorOperado);
            }
        }
    }

    public void setValorOperado(int valor) {
        this.ultimoValorOperado = valor;
    }

    
}
