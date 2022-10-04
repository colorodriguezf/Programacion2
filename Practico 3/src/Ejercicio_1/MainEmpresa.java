package Ejercicio_1;

public class MainEmpresa {
    
    public static void main(String[] args){
        //Personas que se encuestaron
        PersonaEncuestada perEnc1 = new PersonaEncuestada("Juan", "Perez", 40434677);
		PersonaEncuestada perEnc2 = new PersonaEncuestada("Pirulo", "Martinez", 39456879);

        //Empleado que hizo las encuestas
        Empleado emp1 = new Empleado("Mario", "Casas", 30254498, 100);

        //Encuestas
        Encuesta enc1 = new Encuesta("Encuesta 1 - Futbol", emp1);
		Encuesta enc2 = new Encuesta("Encuesta 2 - Animales", emp1);
		Encuesta enc3 = new Encuesta("Encuesta 3 - Drogas", emp1);

        //Preguntas encuesta 1
        enc1.setPreguntas("Pregunta 1");
		enc1.setPreguntas("Pregunta 2");
		enc1.setPreguntas("Pregunta 3");
		enc1.setPreguntas("Pregunta 4");
		enc1.setPreguntas("Pregunta 5");

        //Preguntas encuesta 2
        enc2.setPreguntas("Pregunta 1");
		enc2.setPreguntas("Pregunta 2");
		enc2.setPreguntas("Pregunta 3");
		enc2.setPreguntas("Pregunta 4");
		enc2.setPreguntas("Pregunta 5");

        //Preguntas encuesta 3
        enc3.setPreguntas("Pregunta 1");
		enc3.setPreguntas("Pregunta 2");
		enc3.setPreguntas("Pregunta 3");
		enc3.setPreguntas("Pregunta 4");
		enc3.setPreguntas("Pregunta 5");

        perEnc1.setEncuestasRespondidas(enc1);
		perEnc2.setEncuestasRespondidas(enc2);

        System.out.println("Personas que respondieron la encuessta: "+enc1.getNombre()+": " + enc1.getPersonasQueRespondieron().size());
		System.out.println("Personas que respondieron la encuessta: "+enc2.getNombre()+": " + enc2.getPersonasQueRespondieron().size());
        
        //Creamos la empresa
        Empresa empresa1 = new Empresa("Empresa S.A");
        empresa1.setEncuestaARealizar(enc1);
		empresa1.setEncuestaARealizar(enc2);
		empresa1.setEncuestaARealizar(enc3);
        
        empresa1.setEncuestasRespondidas();

        System.out.println("Encuestas Realizadas: "+empresa1.getEncuestasRealizadas().size());
		System.out.println("Encuestas Respondidas: "+empresa1.getEncuestasRespondidas());
		System.out.println("Sueldo empleado: $" + emp1.getSueldo() + ". Total a cobrar con el plus: $" + empresa1.getSueldoEmpleado(emp1));
   
   
    }
}
