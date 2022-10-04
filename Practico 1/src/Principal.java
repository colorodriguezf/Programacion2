public class Principal {
    public static void main(String[] args){
        //PERSONA:
        Persona sujeto_1 = new Persona(40455361,"Julian","Rodriguez","1997-09-05",'m',71, 179);
        System.out.println("\nInformacion del sujeto1: ");
        //dejo comentado porque falla
        //sujeto_1.mostrarDatos();

        //ELECTRODOMESTICOS:
        Electrodomestico electrodomestico_1 = new Electrodomestico("Lavarropas", "blanco", 55, 1500, 62);
        Electrodomestico electrodomestico_2 = new Electrodomestico("Plancha", "verde", 32, 500, 2);

        System.out.println("\nInformacion del Electrodomestico:");
        electrodomestico_1.mostrarDatos();
        electrodomestico_2.mostrarDatos();
    }
}
