package Recuperatorio2020;
import java.util.ArrayList;

import Recuperatorio2020.Filtros.Filtro;

public class Voluntario  extends ElementoOms {
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String genero;
    private ArrayList<String> enfermedades;
    private boolean recibioVacuna;
    private boolean recibioPlacebo;
    private boolean contrajoEnfermedad;

    public Voluntario(String nombre, String nacionalidad, String genero, int edad, boolean recibioVacuna,
           boolean recibioPlacebo, boolean contrajoEnfermedad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.genero = genero;
        this.recibioVacuna = recibioVacuna;
        this.recibioPlacebo = recibioPlacebo;
        this.contrajoEnfermedad = contrajoEnfermedad;
        this.enfermedades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isRecibioPlacebo() {
        return recibioPlacebo;
    }

    public void setRecibioPlacebo(boolean recibioPlacebo) {
        this.recibioPlacebo = recibioPlacebo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<String> getEnfermedades() {
        return new ArrayList<String>(this.enfermedades);
    }

    public void addEnfermedad(String enfermedad) {
        if (!enfermedades.contains(enfermedad)) {
            this.enfermedades.add(enfermedad);
        }
    }

    public boolean isRecibioVacuna() {
        return recibioVacuna;
    }

    public void setRecibioVacuna(boolean recibioVacuna) {
        this.recibioVacuna = recibioVacuna;
    }

    public boolean isContrajoEnfermedad() {
        return contrajoEnfermedad;
    }

    public void setContrajoEnfermedad(boolean contrajoEnfermedad) {
        this.contrajoEnfermedad = contrajoEnfermedad;
    }

    @Override //1
    public int getCantidadVoluntarios() {
        return 1;
    }

    @Override
    public int cantidadVoluntariosCondicion(Filtro f) {
       if(f.cumple(this)) {
        return 1;
       }
       else {
        return 0;
       }
        
    }

    @Override
    public ArrayList<Voluntario> getVoluntariosCondicion(Filtro f) {
       ArrayList<Voluntario> voluntario = new ArrayList<>();
       if (f.cumple(this)) {
        voluntario.add(this);
       }
       return voluntario;
    }

    public String toString() {
        return "{Voluntario: "+getNombre()+" de "+getEdad()+" años, con enfermedades: "+getEnfermedades()+" }\n";
    }


    

    
}
