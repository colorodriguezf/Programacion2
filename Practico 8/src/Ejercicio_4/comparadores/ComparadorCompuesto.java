package Ejercicio_4.comparadores;

import java.util.Comparator;
import Ejercicio_4.Candidato;

public class ComparadorCompuesto implements Comparator<Candidato>{
    private Comparator<Candidato> comparador1;
    private Comparator<Candidato> comparador2;
    private Comparator<Candidato> comparador3;

    public ComparadorCompuesto(Comparator<Candidato> comparador1, Comparator<Candidato> comparador2, Comparator<Candidato> comparador3) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
        this.comparador3 = comparador3;
    }


    @Override
    public int compare(Candidato candidato1, Candidato candidato2) {
        int resultado = comparador1.compare(candidato1, candidato2);
        if(resultado == 0) {
            resultado = comparador2.compare(candidato1, candidato2);
            if(resultado == 0) {
                resultado = comparador3.compare(candidato1, candidato2);
                if(resultado == 0) {
                    return 0;
                }
            }        
        }
        return resultado;

    }
    
}
