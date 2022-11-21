package Prefinal_YouTube;
import java.time.LocalDate;
import java.util.ArrayList;
import Prefinal_YouTube.filtros.Filtro;

public class VideoClaves extends Video {

    public VideoClaves(String titulo, Usuario usuarioCreador, int duracion, int cantVisualizaciones, int cantMg,
            int cantNoMg, LocalDate fecha) {
        super(titulo, usuarioCreador, duracion, cantVisualizaciones, cantMg, cantNoMg, fecha);
    }
    
    @Override //1
    public ArrayList<Video> buscarVideos(Filtro f) {
       ArrayList<Video> video = new ArrayList<Video>();     
           video.add(this);
     
        return video;
    }
}
