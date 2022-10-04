package Ejercicio_1;
public class MainAlarma {
    public static void main(String[] args) {
        Alarma a1 = new Alarma();
        a1.activarAlarma();
        System.out.println("----------------------");
        a1.setAbertura_abierta(true);
        a1.activarAlarma();
        System.out.println("----------------------");
    }
}
