package Ejercicio_1;
public class Capitulo {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;
    private final static String DEFAULT_TITULO = "Titulo sin asignar";
    private final static String DEFAULT_DESCRIPCION = "Descripcion sin asignar";
    private final static int DEFAULT_CALIFICACION_NO_VISTO = -1;
    private final static int MENOR_CALIFICACION_POSIBLE = 1;
    private final static int MAYOR_CALIFICACION_POSIBLE = 5;

    public Capitulo(String titulo, String descripcion, boolean visto, int calificacion) {
        setTitulo(titulo);
        setDescripcion(descripcion);
        setVisto(visto);
        setCalificacion(calificacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = (titulo != null ? titulo : DEFAULT_TITULO);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = (descripcion != null ? descripcion : DEFAULT_DESCRIPCION);
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        //Si el capitulo fue visto, se checkea si se puede o no asignar la calificacion
        if(this.getVisto()) {
            if((calificacion >= MENOR_CALIFICACION_POSIBLE) && (calificacion <= MAYOR_CALIFICACION_POSIBLE)){
                this.calificacion = calificacion;
            }
        }
        else {
            System.out.println("Para poder puntuar, debe ver el capitulo.");
            this.calificacion = DEFAULT_CALIFICACION_NO_VISTO;
        }
    }

    public boolean getVisto(){
        return this.visto;
    }

    
    
}
