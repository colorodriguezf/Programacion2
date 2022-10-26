package Practico7b.Ejercicio_1;
import java.time.LocalDate;
import java.util.ArrayList;

public class Carpeta extends ElementoFS {
    private ArrayList<ElementoFS> elementos;

    
     public Carpeta(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
   }

   @Override
   public int cantArchivos() {
    //return elementos.size();//Retorna la cantidad de hijos, no de archivos
                            //Solo mira hijos directos (no mas hijos)
        int total = 0;
        for (ElementoFS elemento : elementos) {
            total += elemento.cantArchivos();        
        }
        return total;
   }

   @Override
   public double getTamanio() {
        double total =0;
        for(ElementoFS elemento : elementos) {
            total += elemento.getTamanio();
        }
        return total;
   }

    
}
