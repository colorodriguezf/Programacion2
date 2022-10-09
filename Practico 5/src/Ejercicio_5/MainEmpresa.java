package Ejercicio_5;

public class MainEmpresa {
    public static void main(String[] args){

        Empresa empresa1 = new Empresa("Garbarino");

        Empleado e1 = new Empleado("Juan", "Perez", 20345541, 35000);
        Empleado e2 = new EmpleadoVenta("Martin", "Dominguez", 35982786, 45000, 10, 35);
        Empleado e3 = new EmpleadoBono("Juana", "Ramirez", 25935781, 28000, 25, 20, 25, 10000);
        Empleado e4 = new EmpleadoBono("Lio", "Messi", 30498219, 50000, 30, 35, 25, 10000);


        empresa1.setEmpleado(e1);
        empresa1.setEmpleado(e2);
        empresa1.setEmpleado(e3);
        empresa1.setEmpleado(e4);

        System.out.println("Empleado comun: "+e1.toString());
        System.out.println("Empleado Venta "+e2.toString());
        System.out.println("Empleado Bono "+e3.toString());
        System.out.println("Empleado Bono "+e4.toString());
        System.out.println("--------------------------------");
        System.out.println("Total de gastos en sueldo: $"+ empresa1.getMontoSueldoTotales());

    }
}
