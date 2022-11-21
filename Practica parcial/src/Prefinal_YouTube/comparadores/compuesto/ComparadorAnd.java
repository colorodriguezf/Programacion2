package Prefinal_YouTube.comparadores.compuesto;
import java.util.Comparator;
import Prefinal_YouTube.Video;

public class ComparadorAnd implements Comparator<Video>{
    private Comparator<Video> c1;
    private Comparator<Video> c2;

    public ComparadorAnd(Comparator<Video> c1, Comparator<Video> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Video v1, Video v2) {
        int res = c1.compare(v1, v2);
        if (res == 0) {
            c2.compare(v1, v2);
        }
        return res;
    }
    
}
