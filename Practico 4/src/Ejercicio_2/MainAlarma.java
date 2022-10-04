package Ejercicio_2;
public class MainAlarma {
    public static void main(String[] args) {

        //Funciona si a la alarma le preguntas por x sensor, no por todos
        Alarma a1 = new Alarma();
        Sensor s1 = new Sensor("Living", false);
        Sensor s2 = new Sensor("Comedor",false);
        Sensor s3 = new Sensor("Habitacion",false);
        Sensor s4 = new Sensor("Baño",false);

        a1.setSensores(s1);
        a1.setSensores(s2);
        a1.setSensores(s3);
        a1.setSensores(s4);


        System.out.println("Sensores: "+ a1.getSensores());
        s1.setActivado(true);
        System.out.println("Sensores: "+ a1.getSensores());
        a1.comprobar(s1);
    }
}
