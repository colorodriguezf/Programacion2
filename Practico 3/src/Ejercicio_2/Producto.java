package Ejercicio_2;

public class Producto {
    private String nombre;
    private double peso;
    private double precio_fabricacion;
    private String tipo_madera;
    private String color;
    private int cantidad;
    public static final double PORCENTAJE = 35;

    public Producto(String nombre, double peso, double precio_fabricacion, String tipo_madera, String color, int cantidad) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio_fabricacion = precio_fabricacion;
        this.tipo_madera = tipo_madera;
        this.cantidad = cantidad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio_fabricacion + (precio_fabricacion * PORCENTAJE)/100;
    }
    public double getPrecio_fabricacion() {
        return precio_fabricacion;
    }

    public void setPrecio_fabricacion(double precio_fabricacion) {
        this.precio_fabricacion = precio_fabricacion;
    }

    public String getTipo_madera() {
        return tipo_madera;
    }

    public void setTipo_madera(String tipo_madera) {
        this.tipo_madera = tipo_madera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void getInfo() {
        System.out.println("Producto: " + getNombre());
        System.out.println("Tipo de madera: " + getTipo_madera());
        System.out.println("Peso: " + getPeso()+ "kg");
        System.out.println("Precio de fabricacion: $"+getPrecio_fabricacion()+ " por lo que su precio de venta es de: $" + getPrecio());
        System.out.println("Color:" + getColor());
        System.out.println("Stock disponible: "+getCantidad());
        System.out.println("-------------");
    }

    

    
}
