package Recu2022;
import java.util.ArrayList;

public class Portal {
    private ElementoPortal categoriaRaiz;
    private ArrayList<Suscriptor> suscriptores;

    public Portal(ElementoPortal categoria) {
        this.suscriptores = new ArrayList<>();
        this.categoriaRaiz = categoria;
    }

    public ElementoPortal getCategoriaRaiz() {
        return categoriaRaiz;
    }

    public void setCategoriaRaiz(ElementoPortal categoriaRaiz) {
        this.categoriaRaiz = categoriaRaiz;
    }

    public ArrayList<Suscriptor> getSuscriptores() {
        return new ArrayList<Suscriptor>(this.suscriptores);
    }

    public void setSuscriptores(Suscriptor suscriptor) {
        if(!suscriptores.contains(suscriptor)) {
            this.suscriptores.add(suscriptor);
        }
    }

    public void repartirNoticia(Noticia n) {
        for(Suscriptor suscriptor : suscriptores) {
            suscriptor.recibirNoticia(n);
        }
    }
}
