package Final_01_03_24;

import Final_01_03_24.filtros.Filtro;

public class Estacion {
    private String nombre;
    private Filtro  especialidad;
    private boolean cocinando;
    private ElementoSimple pedidoEnPreparacion;

    
    public Estacion(String nombre, Filtro especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        cocinando = false;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Filtro getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Filtro especialidad) {
        this.especialidad = especialidad;
    }

    public ElementoSimple getpedidoEnPreparacion() {
        return pedidoEnPreparacion;
    }

    public void puedeCocinar(Filtro especialidad, ElementoSimple e) {
        if((!cocinando) && especialidad.cumple(e)) {
            pedidoEnPreparacion = e;
            cocinando = true;
        }
        else {
            cocinando = false;
        }
    }
    
}
