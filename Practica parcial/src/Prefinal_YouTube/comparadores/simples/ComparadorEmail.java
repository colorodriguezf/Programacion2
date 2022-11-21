package Prefinal_YouTube.comparadores.simples;
import java.util.Comparator;
import Prefinal_YouTube.Video;

public class ComparadorEmail implements Comparator<Video>  {

    @Override
    public int compare(Video v1, Video v2) {
        return v1.getUsuarioCreador().getMail().compareTo(v2.getUsuarioCreador().getMail());
    }
    
}
