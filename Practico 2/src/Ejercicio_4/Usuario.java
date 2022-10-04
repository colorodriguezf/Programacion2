package Ejercicio_4;

import java.time.LocalDate;

public class Usuario {
 private String nombre;
 private String apellido;
 private LocalDate ultimoTurnoSacado; 

 public Usuario(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.ultimoTurnoSacado = LocalDate.of(2000, 1, 1);
 }

 public Usuario(String nombre, String apellido, LocalDate ultimoTurnoSacado) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.ultimoTurnoSacado = ultimoTurnoSacado;
 }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public LocalDate getUltimoTurnoSacado() {
    return ultimoTurnoSacado;
}

public void setUltimoTurnoSacado(LocalDate ultimoTurnoSacado) {
    this.ultimoTurnoSacado = ultimoTurnoSacado;
}

 
}
