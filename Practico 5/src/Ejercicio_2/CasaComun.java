package Ejercicio_2;

public class CasaComun extends Casa{
    public CasaComun(String nombre, int cantMaxAlumnos) {
		super(nombre, cantMaxAlumnos);
	}

	@Override
	public boolean condicionAgregarAlumno(Alumno alumn) {
		if((!this.getAlumnos().contains(alumn)) && (getAlumnos().size() <= getCantMaximaAlumnos())
		&& (cumpleCualidades(alumn))&&(!alumn.perteneceAalgunaCasa())) {
			return true;
		}
		return false;
	}
}
