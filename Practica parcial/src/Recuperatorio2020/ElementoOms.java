package Recuperatorio2020;
import java.util.ArrayList;
import Recuperatorio2020.Filtros.Filtro;

public abstract class ElementoOms {
    public abstract int getCantidadVoluntarios(); //1-a
    public abstract int cantidadVoluntariosCondicion(Filtro f); //1-b, c, d
    public int porcentajeVacunados(Filtro f) { //1-e y f
        int total = this.getCantidadVoluntarios();
        int cantidadQueCumple = this.cantidadVoluntariosCondicion(f);
        return (cantidadQueCumple * 100) / total;
    }
    public abstract ArrayList<Voluntario> getVoluntariosCondicion(Filtro f);
}
