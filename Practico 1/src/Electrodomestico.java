public class Electrodomestico {
    private String nombre;
    private String color;
    private int consumo_energetico;
    private int precio_base;
    private double peso;
    private double balance;

    public Electrodomestico(String nombre) {
        this(nombre,"gris plata", 10, 100, 2);
    }
    public Electrodomestico(String nombre, String color, int consumo_energetico, int precio_base, double peso) {
        this.setNombre(nombre);
        this.color = "gris claro";
        this.setColor(color);
        this.consumo_energetico = 10;
        this.setConsumoEnergetico(consumo_energetico);
        this.precio_base = 100;
        this.setPrecioBase(precio_base);
        this.peso = 2;
        this.setPeso(peso);
        balance = precio_base / (double)peso;
    }

    //SETERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setConsumoEnergetico(int consumo_energetico){
        this.consumo_energetico = consumo_energetico;
    }
    public void setPrecioBase(int precio_base) {
        this.precio_base = precio_base;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        balance = (double)precio_base / (double)peso;
    }
    //GETERS
    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }
    public int getConsumoEnergetico() {
        return consumo_energetico;
    }
    public double getPrecio() {
        return precio_base;
    }
    public double getPeso() {
        return peso;
    }

    //Metodos publicos:
    public boolean esDeBajoConsumo() {
        final int bajo_consumo = 45;
        if (consumo_energetico < bajo_consumo) {
            return true;
        }
        else {
            return false;
        }
        //sino se puede hacer un if en linea como en js:
            //return (consumo_energetico < bajo_consumo)? true : false;
    }
    public boolean esDeAltaGama(){
        final int alta_gama = 3;
        if (balance > alta_gama) {
            return true;
        }
        else {
            return false;
        }
        //sino se puede hacer un if en linea como en js:
            //return (balance > alta_gama)? true : false;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Color: " + this.getColor());
        System.out.println("Consumo energetico: " + this.getConsumoEnergetico()+"kw");
        System.out.println("Precio base: $" + this.getPrecio());
        System.out.println("Peso: " + this.getPeso()+" kg");
        System.out.println("Informacion importante:");
        System.out.println("El electrodomestico es de bajo consumo?:" + this.esDeBajoConsumo());
        System.out.println("El balance es de: " + this.balance);
        System.out.println("es de alta gama?:"  + this.esDeAltaGama());
    }
}
