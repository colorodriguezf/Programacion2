package Prefinal_YouTube;
import java.time.LocalDate;
import java.util.ArrayList;

import Prefinal_YouTube.filtros.Filtro;

public class Video extends ElementoYoutube {
    private String titulo;
    private Usuario usuarioCreador;
    private int duracion; //en segundos
    private int cantVisualizaciones;
    private int cantMg;
    private int cantNoMg;
    private LocalDate anioCreacion;
    private ArrayList<String> palabrasClave;

    public Video(String titulo, Usuario usuarioCreador, int duracion, int cantVisualizaciones, int cantMg,
            int cantNoMg, LocalDate fecha) {
        super(titulo);
        this.usuarioCreador = usuarioCreador;
        this.duracion = duracion;
        this.cantVisualizaciones = cantVisualizaciones;
        this.cantMg = cantMg;
        this.cantNoMg = cantNoMg;
        this.anioCreacion = fecha;
        this.palabrasClave = new ArrayList<String>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getUsuarioCreador() {
        return usuarioCreador;
    }

    public void setUsuarioCreador(Usuario usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantVisualizaciones() {
        return cantVisualizaciones;
    }

    public void setCantVisualizaciones(int cantVisualizaciones) {
        this.cantVisualizaciones = cantVisualizaciones;
    }

    public int getCantMg() {
        return cantMg;
    }

    public void setCantMg(int cantMg) {
        this.cantMg = cantMg;
    }

    public int getCantNoMg() {
        return cantNoMg;
    }

    public void setCantNoMg(int cantNoMg) {
        this.cantNoMg = cantNoMg;
    }

    public int getAnio() {
        int anio = anioCreacion.getYear();
        return anio;
    }

    public void setAnio(LocalDate fecha) {
        this.anioCreacion = fecha;
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<String>(this.palabrasClave);
    }

    public void setPalabrasClave(String palabra) {
        if(palabra != "" && !palabrasClave.contains(palabra)) {
            this.palabrasClave.add(palabra);
        }
    }

    @Override //1
    public ArrayList<Video> buscarVideos(Filtro f) {
       ArrayList<Video> video = new ArrayList<Video>();
       if(f.cumple(this)) {
           video.add(this);
        }
        return video;
    }

    @Override //2
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> palabras = this.getPalabrasClave();

        return palabras;
    }

    @Override //3
    public int getCantidadVideos() {
        return 1;
    }

    @Override //4
    public int getDuracionTotal() { 
        return this.getDuracion();
    }

    @Override
    public String toString() {
        return "{Video: " +super.getTitulo()+ ", usuario creador: "+this.getUsuarioCreador().getNombre()+ ", cantidad visualizaciones: "+getCantVisualizaciones()+
               " cantidad mg: "+this.getCantMg()+ ", cantidad no mg: "+this.getCantNoMg()+" creado en el año "+ getAnio()+ ".\n [Palabras claves: "+ getPalabrasClaves()+" ]}\n";
    }

    
}
