package Ejercicio_2;
import java.io.*;

public class Reunion {
    Usuario[] participantes;
    Usuario[] asistentes;
    private String lugar;
    private String tema;
    private int hs_comienzo;
    private String duracion_reunion;

public Reunion(Usuario[] participantes, Usuario[] asistentes, String lugar, String tema, int hs_comienzo, String duracion_reunion){
    setParticipantes(participantes);
    setAsistentes(asistentes);
    setLugar(lugar);
    setTema(tema);
    setHsComienzo(hs_comienzo);
    setDuracion_reunion(duracion_reunion);
}

public Usuario[] getParticipantes() {
    return participantes;
}

public void setParticipantes(Usuario[] participantes) {
    for (int i = 0; i <participantes.length; i++) {
        participantes[i] = participantes[i];
    }
}

public Usuario[] getAsistentes() {
    return asistentes;
}

public void setAsistentes(Usuario[] asistentes) {
    for (int i = 0; i <asistentes.length; i++) {
        asistentes[i] = asistentes[i];
    }
}

public String getLugar() {
    return lugar;
}

public void setLugar(String lugar) {
    this.lugar = lugar;
}

public String getTema() {
    return tema;
}

public void setTema(String tema) {
    this.tema = tema;
}

public int getHsComienzo() {
    return hs_comienzo;
}

public void setHsComienzo(int hs_comienzo) {
    this.hs_comienzo = hs_comienzo;
}

public String getDuracion_reunion() {
    return duracion_reunion;
}

public void setDuracion_reunion(String duracion_reunion) {
    this.duracion_reunion = duracion_reunion;
}

public void getTelefono(Usuario participante) {
        System.out.println(participante.getTelefono());
}

public void getMail(Usuario participante) {

    System.out.println(participante.getEmail());

}
}
