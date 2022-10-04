package Ejercicio_1;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private Temporada [] temporadas;
    private final static String DEFAULT_TITULO = "Titulo de serie no asignado";
    private final static String DEFAULT_DESCRIPCION = "Descripcion de serie no asignada";
    private final static String DEFAULT_GENERO = "Sin genero asignado";
    private final static String DEFAULT_CREADOR = "Sin creador asignado";
    private final static DecimalFormat FORMATO_DECIMAL = new DecimalFormat("#.00");


    public Serie(String titulo, String descripcion, String creador, String genero, Temporada[] temporadas){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new Temporada[temporadas.length];
        setTemporadas(this.temporadas);
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo != null ? titulo : DEFAULT_TITULO;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion != null ? descripcion : DEFAULT_DESCRIPCION;
    }


    public String getCreador() {
        return creador;
    }


    public void setCreador(String creador) {
        this.creador = creador != null ? creador : DEFAULT_CREADOR;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero != null ? genero : DEFAULT_GENERO;
    }


    public Temporada[] getTemporadas() {
        return temporadas;
    }


    public void setTemporadas(Temporada[] temporadas) {
        if (temporadas.length > 0) {
            for (int i=0; i<temporadas.length; i++) {
                this.temporadas[i] = temporadas[i];
            }
        }
    }

    //Metodos
    public int contarCapitulosVistos() {
        int cap_vistos = 0;
        for (Temporada temporada : temporadas) {
            cap_vistos += temporada.contarCapitulosVistos();
        }
        return cap_vistos;
    }

    //Calcula el promedio de puntuacion de la serie
    public float calcularPromedio() {
        float acumulador = 0;
        for (Temporada temporada : temporadas) {
            acumulador += temporada.promedioCalificacionTemporada();
        }
        // Retorna el promedio de calificacion x temporada (una vez aplicado el formato decimal);
        return Float.parseFloat(FORMATO_DECIMAL.format(acumulador / temporadas.length));
    } 

    //retorna si vieron o no todos los capitulos de la serie
    public boolean vioTodosLosCapitulos() {
        for (Temporada temporada : temporadas) {
            if(!temporada.vioTodosLosCapitulos()) {
                return false;
            }              
        }
        return true;
    }


}
