package Ejercicio_4.comparadores;

import java.util.Comparator;
import Ejercicio_4.Candidato;

public class ComparadorPartidoPolitico implements Comparator<Candidato>{

    @Override
    public int compare(Candidato c1, Candidato c2) {
        return c1.getPartido_politico().compareTo(c2.getPartido_politico());
    }
    
}
