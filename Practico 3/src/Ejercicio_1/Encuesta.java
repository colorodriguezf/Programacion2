package Ejercicio_1;

import java.util.ArrayList;

public class Encuesta {
   private String nombre;
   private ArrayList<String> preguntas;
   private ArrayList<Persona> personasQueRespondieron;
	private ArrayList<Integer> dniPersonasQueRespondieron;
   private Empleado empleadoEncuestador;

   public Encuesta(String nombre, Empleado empleado) {
      this.nombre = nombre;
      this.empleadoEncuestador = empleado;
      this.preguntas = new ArrayList<>();
      this.personasQueRespondieron = new ArrayList<>();
      this.dniPersonasQueRespondieron = new ArrayList<>();
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public ArrayList<String> getPreguntas() {
      return preguntas;
   }

   public void setPreguntas(String pregunta) {
      if (!this.preguntas.contains(pregunta)) {
         preguntas.add(pregunta);
      }
      
   }

   public Empleado getEmpleadoEncuestador() {
		return empleadoEncuestador;
	}

   public ArrayList<Persona> getPersonasQueRespondieron() {
      return personasQueRespondieron;
   }

   public void setPersonasQueRespondieron(PersonaEncuestada persona) {
      if(!this.personasQueRespondieron.contains(persona)) {
         if(!persona.getEncuestasRespondidas().contains(this)) {
            this.personasQueRespondieron.add(persona);
            agregarDniQuePersonaQueRespondion();
         }

      }
   }

   public void agregarDniQuePersonaQueRespondion(){
      if(!this.dniPersonasQueRespondieron.isEmpty()){
         for(Persona p : this.personasQueRespondieron) {
				this.dniPersonasQueRespondieron.add(p.getDni());
			}
      }
   }

   public ArrayList<Integer> getDniPersonasQueRespondieron() {
      return dniPersonasQueRespondieron;
   }

   public void setDniPersonasQueRespondieron(ArrayList<Integer> dniPersonasQueRespondieron) {
      this.dniPersonasQueRespondieron = dniPersonasQueRespondieron;
   }

   public void setEmpleadoEncuestador(Empleado empleadoEncuestador) {
      this.empleadoEncuestador = empleadoEncuestador;
   }

   @Override
	public String toString() {
		return "Encuesta [nombre=" + nombre + "]";
	}

   


}
