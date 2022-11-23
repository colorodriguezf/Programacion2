package Parcial_2022_Plus;
import java.util.ArrayList;

public class PortalNoticias {
    ArrayList<Clasificador> clasificadores;

    public PortalNoticias() {
        this.clasificadores = new ArrayList<Clasificador>();
    }

    
    public void setClasificadores(Clasificador clasificador) {
        if(!this.clasificadores.contains(clasificador)) {
            clasificadores.add(clasificador);
        }
    }

    public void clasificarNoticia(Noticia n) {
        for(Clasificador clasificador : clasificadores) {
            clasificador.clasificar(n);
        }
    }



}
