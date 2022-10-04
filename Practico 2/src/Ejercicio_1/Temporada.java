package Ejercicio_1;
import java.text.DecimalFormat;
public class Temporada {
    private Capitulo[] capitulos;
    private final static DecimalFormat FORMATO_DECIMAL = new DecimalFormat("#.00");

    //El constructor es un array de tipo Capitulo, el cual contiene todos los capitulos
    public Temporada(Capitulo[] capitulos) {
    //Declaramos que el tamaño de la temporada sea igual que el length del array de capitulos
    this.capitulos = new Capitulo[capitulos.length];
    setCapitulos(capitulos);
    }


    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        for (int i = 0; i < capitulos.length; i++) {
            this.capitulos[i] = capitulos[i];
        }
    }

    //Metodos
    public int contarCapitulosVistos() {
        int cap_vistos = 0;
        for (Capitulo c : this.capitulos) {
            cap_vistos += (c.getVisto()) ? 1 : 0;
        }
        return cap_vistos;
    }

    //Calcula el promedio de puntuacion de la temporada.
    public float promedioCalificacionTemporada() {
        int cap_vistos = 0;
        int acumulador = 0;
        float promedio;

        for (Capitulo c : this.capitulos) {
            if(c.getVisto()) {
                acumulador += c.getCalificacion();
                cap_vistos ++;
            }
        }
        //Se calcula el promedio eniendo en cuenta la division por 0
        promedio = ((cap_vistos == 0) ? 0 : (acumulador/cap_vistos));
        return (Float.parseFloat(FORMATO_DECIMAL.format(promedio)));
    }

    //Retorna si vieron o no todos los capitulos de la temporada
    public boolean vioTodosLosCapitulos() {
        for (Capitulo capitulo : capitulos) {
            if(!capitulo.getVisto()) {
                return false;
            }
        }
        return true;
    }

    public boolean vioTodosLosCaps(){
        for (Capitulo capitulo : capitulos) {
          if(!capitulo.getVisto()){return false;}
        }
    
        return true;
      }
}
