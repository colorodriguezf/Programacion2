package Ejercicio_2;

public class MainFabrica {
    public static void main(String[] args) {
        Fabrica fabrica1 = new Fabrica("De Roble Muebleria");

        Producto producto1 = new Producto("Silla",10,1000,"roble","rojo",10);
        Producto producto2 = new Producto("Mesa",150,50000,"pino","verde",25);
        Producto producto3 = new Producto("Banco",100,25000,"roble","marron",30);

        fabrica1.setProductos_disponibles(producto1);
        fabrica1.setProductos_disponibles(producto2);
        fabrica1.setProductos_disponibles(producto3);    

        fabrica1.getInfo();
        producto1.getInfo();
        producto2.getInfo();
        producto3.getInfo();       
    }
}
