package Ejercicio_4;

import java.time.LocalDate;

public class Integrante {
    private String nombre;
    private String apellido;
    private int numero_pasaporte;
    private LocalDate fecha_nacimiento;
    private boolean viajando;
	private boolean concentrando;
	private boolean enPaisDeOrigen;

    public Integrante(String nombre, String apellido, int nroPasaporte, LocalDate fechaNac, boolean viajando,
    boolean concentrando, boolean enPaisDeOrigen) {
super();
this.nombre = nombre;
this.apellido = apellido;
this.numero_pasaporte = nroPasaporte;
this.fecha_nacimiento = fechaNac;
this.viajando = viajando;
this.concentrando = concentrando;
this.enPaisDeOrigen = enPaisDeOrigen;
}


public String getNombre() {
return nombre;
}

public String getApellido() {
return apellido;
}

public int getNroPasaporte() {
return numero_pasaporte;
}

public LocalDate getFechaNac() {
return fecha_nacimiento;
}

public boolean estaDisponible() {
if(this.enPaisDeOrigen&&(!this.concentrando)) {
    return true;
}
return false;
}

public String getEstado() {
    if(this.concentrando) {
        return "Concentrando";
    }
    if(this.enPaisDeOrigen) {
        return "En pais de origen";
    }
    if(this.viajando) {
        return "Viajando";
    }
    return null;
}
    

    

}
