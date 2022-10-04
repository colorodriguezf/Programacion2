package Ejercicio_2;

public class Agenda {
    private Usuario duenio;
    private Reunion[] reuniones;


    public Agenda(Usuario duenio, Reunion[] reuniones) {
        setDuenio(duenio);
        this.reuniones = new Reunion[reuniones.length];
        setReuniones(reuniones);
    }


    public Usuario getDuenio() {
        return duenio;
    }


    public void setDuenio(Usuario duenio) {
        if(duenio != null) {
            this.duenio = duenio;
        }
    }


    public int getReuniones() {
        return reuniones.length;
    }


    public void setReuniones(Reunion[] reuniones) {
        if(reuniones != null) {
            for(int i = 0; i <reuniones.length; i++) {
                reuniones[i] = reuniones[i];    
            }
        }
    }

    
}
