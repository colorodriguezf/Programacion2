package Recuperatorio_EmpSoftware;

import Recuperatorio_EmpSoftware.comparadores.ComparadorApellido;
import Recuperatorio_EmpSoftware.comparadores.ComparadorCompuesto;
import Recuperatorio_EmpSoftware.comparadores.ComparadorNombre;
import Recuperatorio_EmpSoftware.sueldo.SueldoFijoMensual;
import Recuperatorio_EmpSoftware.sueldo.SueldoHsExtra;
import Recuperatorio_EmpSoftware.sueldo.SueldoPorHora;

public class Main {
    public static void main(String[] args) {
        Jefe Leon = new Jefe("Leon", "Perez", 38, 120000, new SueldoFijoMensual(), 5);
		Jefe Andres = new Jefe("Andres", "Gomez", 38, 180000, new SueldoFijoMensual(), 5);
		Jefe Timoteo = new Jefe("Timoteo", "Perales", 35, 220000, new SueldoFijoMensual(), 5);
		Jefe Ciro = new Jefe("Ciro", "Locomo", 38, 220000, new SueldoFijoMensual(), 5);
		Programador Luisana = new Programador("Luisana", "Suarez", 38, 20000, new SueldoFijoMensual());
		Programador Viti = new Programador("Viti", "Cybrian", 38,20000, new SueldoFijoMensual());
		Programador Sole = new Programador("Sole", "Solarium", 38, 25000, new SueldoFijoMensual());
		Programador Cort = new Programador("Cort", "Cortazar", 38, 15000, new SueldoFijoMensual());
		Programador Ale = new Programador("Ale", "Perez", 38, 1000, new SueldoPorHora(20));
		Programador Siri = new Programador("Siri", "Perez", 38, 10000, new SueldoHsExtra( 
                                                                                                          new SueldoFijoMensual(),
                                                                                                          10,
                                                                                                          2000
                                                                                                          ));
		Programador Maria = new Programador("Maria", "Perez", 38, 20000, new SueldoHsExtra( 
                                                                                                            new SueldoFijoMensual(),
                                                                                                            10,
                                                                                                            200
                                                                                                            ));
		
		Programador Jose = new Programador("Jose", "Perez", 38, 1000, new SueldoPorHora(2000));
		
		Siri.addEspecialidad("php");
		Siri.addEspecialidad("java");
		Siri.addEspecialidad("css");
		Ale.addEspecialidad("java");
		Ale.addEspecialidad("js");
		Cort.addEspecialidad("angular");
		Cort.addEspecialidad("java");
		Cort.addEspecialidad("bbdd");

        Leon.addElemento(Andres);
		Leon.addElemento(Timoteo);
		Leon.addElemento(Luisana);
		Andres.addElemento(Ciro);
		Andres.addElemento(Viti);
		Andres.addElemento(Sole);
		Ciro.addElemento(Maria);
		Ciro.addElemento(Jose);
		Timoteo.addElemento(Cort);
		Timoteo.addElemento(Ale);
		Timoteo.addElemento(Siri);


		System.out.println("1) Especialidad de Timoteo (jefe): "+Timoteo.getEspecialidad());
		System.out.println("1) Especialidad de Ale (empleado): "+Ale.getEspecialidad());
		System.out.println("---------------------");
        System.out.println("2) Lista empleados Leon: "+Leon.listarEmpleadosOrdenados(new ComparadorCompuesto(
                                                                        new ComparadorNombre(),
                                                                        new ComparadorApellido()
                                                            )));
		System.out.println("---------------------");
		System.out.println("2) Lista empleados Ciro: "+Ciro.listarEmpleadosOrdenados(new ComparadorCompuesto(
					new ComparadorNombre(),
					new ComparadorApellido()
		)));
		System.out.println("------------------------------------------------------");
		System.out.println("3) Gasto en sueldo de Timoteo(jefe): "+Timoteo.gastoEnSueldo());
		System.out.println("3) Gasto en sueldo de Sole(programador) sueldo fijo: "+Sole.gastoEnSueldo());
		System.out.println("3) Gasto en sueldo de Maria(programador) sueldo fijo + hs extras: "+Sole.gastoEnSueldo());
		System.out.println("3) Gasto en sueldo de Ale(programador) sueldo x hs: "+Ale.gastoEnSueldo());
		System.out.println("----------------------------------------------------------------");
		System.out.println("4) Empleados a cargo de Leon:"+ Leon.getCantidadEmpleadosACargo());
		System.out.println("4) Empleados a cargo de Andres:"+ Andres.getCantidadEmpleadosACargo());
		System.out.println("4) Empleados a cargo de Ciro:"+ Ciro.getCantidadEmpleadosACargo());
		System.out.println("4) Empleados a cargo de Timoteo:"+ Timoteo.getCantidadEmpleadosACargo());







    }
}
