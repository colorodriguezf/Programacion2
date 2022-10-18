package Practico7a.Ejercicio_1;

import Practico7a.Ejercicio_1.Filtro.CondicionAnd;
import Practico7a.Ejercicio_1.Filtro.CondicionCultivo;
import Practico7a.Ejercicio_1.Filtro.CondicionEnfermedad;

public class MainAgroquimicos {
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();

        Enfermedad enfermedad1 = new Enfermedad("enfermedad1");
        enfermedad1.addEstadoPatologico("destruccion de plantas");
        Enfermedad enfermedad2 = new Enfermedad("enfermedad2");
        enfermedad2.addEstadoPatologico("pudricion de raíz");
        enfermedad2.addEstadoPatologico("muerte de plántulas");
        Enfermedad enfermedad3 = new Enfermedad("enfermedad3");
        enfermedad3.addEstadoPatologico("pudricion de raíz");
        Enfermedad enfermedad4 = new Enfermedad("enfermedad4");
        enfermedad4.addEstadoPatologico("hojas carcomidas");
        

        Cultivo cultivo1 = new Cultivo("cultivo1");
        cultivo1.agregarEnfermedad(enfermedad1);
        cultivo1.agregarEnfermedad(enfermedad4);
        Cultivo cultivo2 = new Cultivo("cultivo2");
        cultivo2.agregarEnfermedad(enfermedad2);
        cultivo2.agregarEnfermedad(enfermedad3);
        Cultivo cultivo3 = new Cultivo("cultivo3");
        cultivo3.agregarEnfermedad(enfermedad1);
        cultivo3.agregarEnfermedad(enfermedad3);
        Cultivo cultivo4 = new Cultivo("cultivo4");
        cultivo4.agregarEnfermedad(enfermedad4);
        cultivo4.agregarEnfermedad(enfermedad1);
        Cultivo cultivo5 = new Cultivo("cultivo5");
        cultivo5.agregarEnfermedad(enfermedad3);
        cultivo5.agregarEnfermedad(enfermedad2);
        
        ProductoQuimico productoQuimico1 = new ProductoQuimico("producto 1");
        productoQuimico1.setEstados_patologicos("destruccion de plantas");
        productoQuimico1.setEstados_patologicos("pudriciones de raíz");
        productoQuimico1.addCultivo_prohibido(cultivo1);
        productoQuimico1.addCultivo_prohibido(cultivo2);
        
        ProductoQuimico productoQuimico2 = new ProductoQuimico("producto 2");
        productoQuimico2.setEstados_patologicos("destruccion de plantas");
        productoQuimico2.addCultivo_prohibido(cultivo2);
        productoQuimico2.addCultivo_prohibido(cultivo3);

        ProductoQuimico productoQuimico3 = new ProductoQuimico("producto 3");
        productoQuimico3.setEstados_patologicos("muerte de plántulas");
        productoQuimico3.setEstados_patologicos("pudriciones de raíz");
        productoQuimico3.addCultivo_prohibido(cultivo5);
        productoQuimico3.addCultivo_prohibido(cultivo4);

        ProductoQuimico productoQuimico4 = new ProductoQuimico("producto 4");
        productoQuimico4.setEstados_patologicos("hojas carcomidas");
        productoQuimico4.setEstados_patologicos("muerte de plántulas");
        productoQuimico4.addCultivo_prohibido(cultivo2);
        productoQuimico4.addCultivo_prohibido(cultivo4);


        empresa.addProductoQuimico(productoQuimico1);
        empresa.addProductoQuimico(productoQuimico2);
        empresa.addProductoQuimico(productoQuimico3);
        empresa.addProductoQuimico(productoQuimico4);
        


        System.out.println("Condicion enfermedad: ");
        System.out.println("Productos que pueden tratar la enfermedad " + enfermedad1.getNombre() + ": ");
        System.out.println(empresa.getAgroquimicos(new CondicionEnfermedad(enfermedad1)));
        System.out.println("------------------------------------------------------------");
        System.out.println("Productos que pueden tratar la enfermedad " + enfermedad4.getNombre() + ": ");
        System.out.println(empresa.getAgroquimicos(new CondicionEnfermedad(enfermedad4)));
        System.out.println("------------------------------------------------------------");
        System.out.println("condicion doble (cultivo y enfermedad): ");
        System.out.println("Productos que pueden tratar la enfermedad " + enfermedad2.getNombre() + " sobre el cultivo " + cultivo2.getNombre() + ": ");
        System.out.println(empresa.getAgroquimicos(new CondicionAnd(new CondicionCultivo(cultivo2), new CondicionEnfermedad(enfermedad3))));
        System.out.println("------------------------------------------------------------");
        System.out.println("Productos que pueden tratar la enfermedad " + enfermedad2.getNombre() + " sobre el cultivo " + cultivo4.getNombre() + ": ");
        System.out.println(empresa.getAgroquimicos(new CondicionAnd(new CondicionCultivo(cultivo4), new CondicionEnfermedad(enfermedad2))));
    }
}