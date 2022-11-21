package Recuperatorio2020;

import Recuperatorio2020.Filtros.FiltroAñosMayorQue;
import Recuperatorio2020.Filtros.FiltroContrajoEnfermedad;
import Recuperatorio2020.Filtros.FiltroSinEnfermedad;
import Recuperatorio2020.Filtros.FiltroVoluntarioEnfermedad;
import Recuperatorio2020.Filtros.FiltroVoluntarioRecibioPlacebo;
import Recuperatorio2020.Filtros.FiltroVoluntarioRecibioVacuna;
import Recuperatorio2020.Filtros.logicos.FiltroAnd;
import Recuperatorio2020.Filtros.logicos.FiltroNot;

public class MainOms {
    public static void main(String[] args) {
        Voluntario v1=new Voluntario("Tomas", "masculino", "Argentina", 32, true, false, false);
        Voluntario v2=new Voluntario("Juan perez", "masculino", "Argentina", 22, true, false, true);
        Voluntario v3=new Voluntario("Marta", "femenino", "Argentina", 21, false,false, true );
        Voluntario v4=new Voluntario("Manuel", "masculino", "Argentina", 14, true, true, false);
        Voluntario v5=new Voluntario("Ramon", "masculino", "Argentina", 15, false, true, true);
        Voluntario v6=new Voluntario("Sofia", "femenino", "Argentina", 40, true, false, true);
        Voluntario v7=new Voluntario("Carlos", "masculino", "Argentina", 52, false, false, false);
        Voluntario v8=new Voluntario("Emanuel", "masculino", "Argentina", 63, false, true, true);

        v1.addEnfermedad("asma");
        v1.addEnfermedad("diabetes");
        v1.addEnfermedad("ladilla");
        v2.addEnfermedad("asma");
        v2.addEnfermedad("gripe");
        v2.addEnfermedad("epoc");
        v3.addEnfermedad("asma");
        v3.addEnfermedad("diabetes");
        v3.addEnfermedad("asma");
        v4.addEnfermedad("gripe");
        v4.addEnfermedad("asma");
        v5.addEnfermedad("asma");
        v6.addEnfermedad("diabetes");
        v7.addEnfermedad("asma");

        Zona z1 = new Zona("tandil");
        z1.addElemento(v1);
        z1.addElemento(v2);
        z1.addElemento(v3);
        z1.addElemento(v4);

        Zona z2 = new Zona("buenos aires");
        z2.addElemento(v5);
        z2.addElemento(v6);
        z2.addElemento(v7);
        z2.addElemento(v8);

        z2.addElemento(z1);

        System.out.println("1-a) Cantidad de voluntarios que participaron del estudio: "+ z2.getCantidadVoluntarios()+ " voluntarios");
        System.out.println("1-b) Cantidad de voluntarios que recibieron placebo: "+ z2.cantidadVoluntariosCondicion( new FiltroVoluntarioRecibioPlacebo())+ " voluntarios");
        System.out.println("1-c) Cantidad de voluntarios con “diabetes” que recibieron la vacuna y no contrajeron la enfermedad: "+ z2.cantidadVoluntariosCondicion(new FiltroAnd (
                                                                                                                                        new FiltroVoluntarioEnfermedad("diabetes"),
                                                                                                                                        new FiltroAnd(
                                                                                                                                            new FiltroVoluntarioRecibioVacuna(), 
                                                                                                                                            new FiltroNot(new FiltroContrajoEnfermedad())
                                                                                                                                   ))
                                                                                                                            )+ " voluntarios");
                
        System.out.println("1-f) Porcentaje de voluntarios que recibieron la vacuna: "+ z2.porcentajeVacunados( new FiltroVoluntarioRecibioVacuna())+ "%");
        System.out.println("1-f) Porcentaje de voluntarios que recibieron la vacuna (mayor de 40): "+ z2.porcentajeVacunados( new FiltroAñosMayorQue(40))+ "%");
        System.out.println("\n----------------------------\n");

        System.out.println("2) Voluntarios de más de 25 años, que no posean hipertensión: "+ z2.getVoluntariosCondicion(
                                                                                                                    new FiltroAnd(
                                                                                                                        new FiltroAñosMayorQue(25),
                                                                                                                        new FiltroNot(new FiltroVoluntarioEnfermedad("asma")))    
                                                                                                                    ));
        System.out.println("2) Voluntarios tengan asma, pero no sean diabéticos: "+ z2.getVoluntariosCondicion(
            new FiltroAnd(
                new FiltroVoluntarioEnfermedad("asma"),
                new FiltroNot(new FiltroVoluntarioEnfermedad("diabetes")))    
            ));
            System.out.println("2) Voluntarios sin enfermedades"+ z2.getVoluntariosCondicion(new FiltroSinEnfermedad()));

    }
}
