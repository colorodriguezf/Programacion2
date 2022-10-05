package Ejercicio_2;

public class CasaExigente extends Casa {
    public CasaExigente(String nombre, int cantMaxAlumnos) {
		super(nombre, cantMaxAlumnos);
	}

    @Override
    public boolean condicionAgregarAlumno(Alumno alumno) {
        if((!this.getAlumnos().contains(alumno) && (this.getAlumnos().size() < getCantMaximaAlumnos()) 
            && (this.cumpleCualidades(alumno)) 
            &&  (alumno.familiarPermaneceMismaCasaQueAlumno(this)) &&(!alumno.perteneceAalgunaCasa()))) {

        return true;
    }
    return false;
}

    
}
