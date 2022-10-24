package Ejercicio_4;

public class Candidato {
    private String nombre;
    private String partido_politico;
    private String agrupacion;

    public Candidato(String nombre, String partido_politico, String agrupacion) {
        this.nombre = nombre;
        this.partido_politico = partido_politico;
        this.agrupacion = agrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartido_politico() {
        return partido_politico;
    }

    public void setPartido_politico(String partido_politico) {
        this.partido_politico = partido_politico;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    

}
