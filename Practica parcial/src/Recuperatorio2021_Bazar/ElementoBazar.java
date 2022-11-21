package Recuperatorio2021_Bazar;
import java.util.ArrayList;
import Recuperatorio2021_Bazar.filtros.Filtro;

public abstract class ElementoBazar {
    

    public abstract double getPrecio(); //1-a
    public abstract double getPeso();//1-b
    public abstract ArrayList<String> getCategorias();//1-c
    public abstract int getCantidadProductosCombo(); //2-a
    public abstract Producto getProductoMasLivianoCombo();
    public abstract ElementoBazar getCopiaRestringida(Filtro f);

    
}
