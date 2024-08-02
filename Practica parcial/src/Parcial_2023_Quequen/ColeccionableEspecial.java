package Parcial_2023_Quequen;
import Parcial_2023_Quequen.filtros.Filtro;

public class ColeccionableEspecial extends Coleccionable{
    private Filtro f;
    
    public ColeccionableEspecial(String nombre, Filtro f) {
        super(nombre);
        this.f = f;
    }
    
    public Filtro getF() {
        return f;
    }    
    
    public void setF(Filtro f) {
        this.f = f;
    }
    
    @Override
    public void setElementos(SistemaCollections elemento) {
        if(f.cumple(this)) {
            elementos.add(elemento);
        }
    }
}
