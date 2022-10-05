package Ejercicio_2;

import java.util.ArrayList;

public class MainEscuela {
    public static void main(String[] args) {
        Persona per1 = new Persona("Juan");
        Persona per2 = new Persona("María");
        
        Alumno alumno1 = new Alumno("Pablo");
        Alumno alumno2 = new Alumno("Tomas");
        Alumno alumno3 = new Alumno("Estefania");	
        Alumno alumno4 = new Alumno("Sara");
        Alumno alumno5 = new Alumno("Pedro");
        
        Casa gryffindor = new CasaComun("Gryffindor", 50);
        CasaExigente hufflepuff = new CasaExigente("Slytherin", 40);
        CasaEnemistada ravenclaw = new CasaEnemistada("Ravenclaw", 30);

        alumno1.setCualidad("Valor");
        alumno1.setCualidad("Fuerza");
        alumno1.setCualidad("Audacia");
        alumno1.setCualidad("Justicia");
        alumno1.setCualidad("Lealtad");
        alumno1.setCualidad("Paciencia");
        
        
        alumno2.setCualidad("Valor");
        alumno2.setCualidad("Fuerza");
        
        
        gryffindor.setCualidades("Valor");
        gryffindor.setCualidades("Fuerza");
        gryffindor.setCualidades("Audacia");
        
        gryffindor.setAlumno(alumno1);
        gryffindor.setAlumno(alumno2);
        
        System.out.println("Alumnos de " + gryffindor.getNombre() + ": " + gryffindor.getAlumnos());
        
        hufflepuff.setCualidades("Justicia");
        hufflepuff.setCualidades("Lealtad");
        hufflepuff.setCualidades("Paciencia");
        
        alumno3.setCualidad("Justicia");
        alumno3.setCualidad("Lealtad");
        alumno3.setCualidad("Paciencia");
        alumno3.agregarFamiliar(per2);
        
        hufflepuff.setFamiliar(per2);
        hufflepuff.setAlumno(alumno1);
        hufflepuff.setAlumno(alumno2);
        hufflepuff.setAlumno(alumno3);
        
        System.out.println("Alumnos de " + hufflepuff.getNombre() + ": " + hufflepuff.getAlumnos());
        
        ravenclaw.setCualidades("Creatividad");
        ravenclaw.setCualidades("Erudiccion");
        ravenclaw.setCualidades("Inteligencia");
        
        ravenclaw.agregarCasaEnemiga(hufflepuff);
        
        alumno4.setCualidad("Creatividad");
        alumno4.setCualidad("Erudiccion");
        alumno4.setCualidad("Inteligencia");
        
        alumno5.setCualidad("Creatividad");
        alumno5.setCualidad("Erudiccion");
        alumno5.setCualidad("Inteligencia");
        
        System.out.println();
        System.out.println(alumno1.getNombre() +" cumple requisitos: " + ravenclaw.condicionAgregarAlumno(alumno1));
        System.out.println(alumno2.getNombre() +" cumple requisitos: " + ravenclaw.condicionAgregarAlumno(alumno2));
        System.out.println(alumno3.getNombre() +" cumple requisitos: " + ravenclaw.condicionAgregarAlumno(alumno3));
        System.out.println(alumno4.getNombre() +" cumple requisitos: " + ravenclaw.condicionAgregarAlumno(alumno4));
        System.out.println(alumno5.getNombre() +" cumple requisitos: " + ravenclaw.condicionAgregarAlumno(alumno5));
        
        ravenclaw.setAlumno(alumno4);
        ravenclaw.setAlumno(alumno5);
        
        //PREGUNTO SI EL ALUMNO ESTUVO EN CASA ENEMIGA
        System.out.println();
        System.out.println(alumno4.getNombre() + " " + alumno4.estuvoEnCasaEnemiga(ravenclaw));
        System.out.println(alumno5.getNombre() + " " + alumno5.estuvoEnCasaEnemiga(ravenclaw));
        
        System.out.println();
        System.out.println("Alumnos de " + ravenclaw.getNombre() + ": " + ravenclaw.getAlumnos());
    }
}

