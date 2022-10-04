package Ejercicio_3;

public class MainEmpresa {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Coca Cola");
        Empleado empleado1 = new Empleado("Juan", "Perez", 20000);
        Empleado empleado2 = new EmpleadoHsExtras("Tomas", "Agua", 20000, 10, 1000);
        Empleado empleado3 = new EmpleadoComision("Lio", "Messi", 20000, 25, 1000);

        empresa1.setEmpleados(empleado1);
        empresa1.setEmpleados(empleado2);
        empresa1.setEmpleados(empleado3);

        System.out.println(empresa1.getEmpleados());
        System.out.println("(EMPRESA) Sueldo empleado 1 " +empleado1.getNombre() +": "+empresa1.getSueldoEmpleado(empleado1));
        System.out.println("(EMPLEADO) Sueldo empleado " +empleado1.getNombre() +": "+empleado1.getSueldo());
        System.out.println("---------------");
        System.out.println("(EMPRESA) Sueldo empleado 2 " +empleado2.getNombre() +": "+empresa1.getSueldoEmpleado(empleado2));
        System.out.println("(EMPLEADO) Sueldo empleado " +empleado2.getNombre() +": "+empleado2.getSueldo());
        System.out.println("---------------");
        System.out.println("(EMPRESA) Sueldo empleado 3 " +empleado3.getNombre() +": "+empresa1.getSueldoEmpleado(empleado3));
        System.out.println("(EMPLEADO) Sueldo empleado " +empleado3.getNombre() +": "+empleado3.getSueldo());
        System.out.println("---------------");
    }
}
