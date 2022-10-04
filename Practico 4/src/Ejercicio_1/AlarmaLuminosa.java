package Ejercicio_1;

public class AlarmaLuminosa extends Alarma {
    
    public void dispararAlarma() {
		super.dispararAlarma();
		Luz.encender();
	}
 

}
