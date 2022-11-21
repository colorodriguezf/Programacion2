package Prefinal_YouTube;

import java.util.ArrayList;

import Prefinal_YouTube.filtros.Filtro;

public class PlayListSponsoreada extends PlayList {
    private ArrayList<ElementoYoutube> elementos;
    private Video video;

    public PlayListSponsoreada(String titulo, int demoraCarga, Video video) {
        super(titulo, demoraCarga);
        this.video = video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }

     @Override //1
    public ArrayList<Video> buscarVideos(Filtro f) {
        ArrayList<Video> videos = new ArrayList<Video>();
        videos.add(video);
        for (ElementoYoutube elemento : elementos) {
            videos.addAll(elemento.buscarVideos(f));
        }
        return videos;
    }
    
}
