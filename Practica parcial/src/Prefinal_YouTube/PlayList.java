package Prefinal_YouTube;
import java.util.ArrayList;
import Prefinal_YouTube.filtros.Filtro;

public class PlayList extends ElementoYoutube { //PlayList engloba otras Playlist, grupos y subgrupos
    private ArrayList<ElementoYoutube> elementos;
    private int demoraCarga; // es la demora que tiene al cargar cada grupo o playlist. Puede cambiar

    public PlayList(String titulo, int demoraCarga) {
        super(titulo);
       this.elementos = new ArrayList<ElementoYoutube>();
       this.demoraCarga = demoraCarga;
    }

    public void addElemento(ElementoYoutube elemento) {
        elementos.add(elemento);
    }

    public void setDemoraCarga(int demoraCarga) {
        this.demoraCarga = demoraCarga;
    }

    public int getDemoraCarga() {
        return this.demoraCarga;
    }

    @Override //1
    public ArrayList<Video> buscarVideos(Filtro f) {
        ArrayList<Video> videos = new ArrayList<Video>();
        for (ElementoYoutube elemento : elementos) {
            videos.addAll(elemento.buscarVideos(f));
        }
        return videos;
    }

    @Override //2
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> palabras = new ArrayList<String>();
        for (ElementoYoutube elemento : elementos) {
            ArrayList<String> palabrasH = elemento.getPalabrasClaves();
            for (String p : palabrasH) {
                if(!palabras.contains(p)) {
                    palabras.add(p);
                }
            }
        }
        return palabras;
    }

    @Override //3
    public int getCantidadVideos() {
        int total = 0;
        for (ElementoYoutube elemento : elementos) {
            total+= elemento.getCantidadVideos();
        }
        return total;
    }

    @Override //4
    public int getDuracionTotal() {
        int duracion = 0;
        for (ElementoYoutube elemento : elementos) {
            duracion += elemento.getDuracionTotal();
        }
        return duracion + demoraCarga;
    }
    
}
