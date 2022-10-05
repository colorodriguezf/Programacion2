package Ejercicio_2;

import java.util.ArrayList;

public abstract class Casa {
   private String nombre;
   private int cant_maxima_alumnos;
   private ArrayList<String> cualidades;
   private ArrayList<Alumno> alumnos;
   private ArrayList<Persona> familiares;  

   public Casa(String nombre, int cant_maxima_alumnos) {
    this.nombre = nombre;
    this.cant_maxima_alumnos = cant_maxima_alumnos;
    this.cualidades = new ArrayList<>();
    this.alumnos = new ArrayList<Alumno>();
    this.familiares = new ArrayList<Persona>();
   }

   public String getNombre() {
    return this.nombre;
   }

   public void setNombre(String nombre) {
    this.nombre = nombre;
   }

   public int getCantMaximaAlumnos() {
    return this.cant_maxima_alumnos;
   }

   public void setCantidadMaximaAlumnos(int cant_maxima_alumnos) {
    this.cant_maxima_alumnos = cant_maxima_alumnos;
   }

   public ArrayList<String> getCualidades() {
    return new ArrayList<String>(this.cualidades);
   }

   public void setCualidades(String cualidad) {
    if(!this.cualidades.contains(cualidad)) {
        this.cualidades.add(cualidad);
    }
   }

   public ArrayList<Alumno> getAlumnos() {
    return new ArrayList<Alumno>(this.alumnos);
   }

   public void setAlumno(Alumno alumno) {
    int capacidad = this.cant_maxima_alumnos;
    if(condicionAgregarAlumno(alumno)) {
        this.alumnos.add(alumno);
        alumno.agregarCasaEnLaQueEstuvo(this);
		alumno.asignarCasa(this);
        capacidad --;
    }
    else if(alumno.perteneceAalgunaCasa()) {
        alumno.setCasa(this);
        alumno.agregarCasaEnLaQueEstuvo(this);
        capacidad--;
    }
    this.alumnos.add(alumno);
   }

   public abstract boolean condicionAgregarAlumno(Alumno alumn);

   protected boolean cumpleCualidades(Alumno alumno) {
    int cantCualidadesAcumplir = this.cualidades.size();
    for(int i = 0; i< alumno.getCualidades().size(); i++) {
        for(int j = 0; j<this.cualidades.size(); j++) {
            if(alumno.getCualidades().get(i).equals(this.cualidades.get(j))) {
                cantCualidadesAcumplir--;
            }
        }
    }
    if(cantCualidadesAcumplir<=0) {
        return true;
    }
    return false;
}

   public ArrayList<Persona> getFamiliares() {
    return new ArrayList<Persona>(this.familiares);
   }

   public void setFamiliar(Persona familiar) {
    if(!this.familiares.contains(familiar)) {
        this.familiares.add(familiar);
    }
   }

   public boolean equals(Object o1) {
    try {
        Casa c = ((Casa)o1);
        if(c.getNombre() == this.getNombre()) {
            return true;
        }
    } catch(Exception e) {
        return false;
    }
    return false;
}
}
