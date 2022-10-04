package Ejercicio_1;

public class Alarma {
    private boolean vidrio_roto;
    private boolean abertura_abierta;
    private boolean movimiento_interno;

    public Alarma() {
        this.vidrio_roto = false;
        this.abertura_abierta = false;
        this.movimiento_interno = false;
    }
    
    public void activarAlarma() {
        if (comprobar()) {
            dispararAlarma();
        }
        else {
            System.out.println("Todo correcto");
        }
    }

    public boolean comprobar() {
        if(this.vidrio_roto || this.abertura_abierta || this.movimiento_interno) {
            return true;
        }
        else {
            return false;
        }
    }

    public void dispararAlarma() {
        Timbre.hacerSonar();
        Luz.encender();
    }

    public boolean isVidrio_roto() {
        return vidrio_roto;
    }

    public void setVidrio_roto(boolean vidrio_roto) {
        this.vidrio_roto = vidrio_roto;
    }

    public boolean isAbertura_abierta() {
        return abertura_abierta;
    }

    public void setAbertura_abierta(boolean abertura_abierta) {
        this.abertura_abierta = abertura_abierta;
    }

    public boolean isMovimiento_interno() {
        return movimiento_interno;
    }

    public void setMovimiento_interno(boolean movimiento_interno) {
        this.movimiento_interno = movimiento_interno;
    }


    
}
