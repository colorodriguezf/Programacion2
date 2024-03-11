package Final_17_03_23;
import java.util.ArrayList;
import Final_17_03_23.filtros.Filtro;

public abstract class ElementoEntrenamiento {





    public abstract int getDuracion(); //a
    public abstract int getCosto_energia(); //b
    public abstract String getActividad(); //c

    public abstract ArrayList<ElementoEntrenamiento> buscar (Filtro f); //d

 

 
}
