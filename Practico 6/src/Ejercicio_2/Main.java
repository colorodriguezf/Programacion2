package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        CentroComputo centro = new CentroComputo();

        Computadora compu1 = new Computadora("lab1", 2560);
        Computadora compu2 = new Computadora("lab2", 5564);
        Computadora compu3 = new Computadora("lab3", 3453);

        centro.addComputadora(compu1);
        centro.addComputadora(compu2);
        centro.addComputadora(compu3);

        System.out.println(centro);
        //Comparaciones
        System.out.println(compu1.esMayor(compu3));
        System.out.println(compu3.esMayor(compu2));
        System.out.println(compu2.esMayor(compu1));



    }
    
}
