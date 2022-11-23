package Parcial_2022_Plus;
import java.util.ArrayList;
import Parcial_2022_Plus.filtros.Filtro;

public class NoticiaPaga extends Noticia {

        public NoticiaPaga(String contenido, String titulo, String autor, String categoria) {
            super(contenido, titulo, autor, categoria);
        }
    
    
        @Override
        public ArrayList<Noticia> getNoticiasQue(Filtro f1) {
            ArrayList<Noticia> resultado = new ArrayList<Noticia>();
            resultado.add(this);
            return resultado;
        }
    }
