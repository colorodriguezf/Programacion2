package Aseguradora_Strategy.filtros;
import Aseguradora_Strategy.SeguroSimple;

public abstract class Filtro {
    public abstract boolean cumple(SeguroSimple s);
}
