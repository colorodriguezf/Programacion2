package Practico7a.Ejercicio_3;

import java.util.ArrayList;

public class Planta {
    private String nombre_cientifico; //Ejemplo: Epipremnum aureum
    private ArrayList<String> nombres_vulgares; //Ejemplo: potus, pothos, potos
    private String clasificacion_superior; //Ejemplo: Epipremnum
    private String familia;
    private String clase;
    private String ubicacion; //Ejemplo: Planta de interior
    private int requerimiento_sol; //1 al 10 (1 para sombra, hasta 10 para sol pleno)
    private int riesgo_agua; //1 para riesgo escaso y 10 para riego abundante)

    public Planta(String nombre_cientifico, String clasificacion_superior, String familia, String clase,
        String ubicacion, int requerimiento_sol, int riesgo_agua) {
        this.nombre_cientifico = nombre_cientifico;
        this.clasificacion_superior = clasificacion_superior;
        this.familia = familia;
        this.clase = clase;
        this.ubicacion = ubicacion;
        this.requerimiento_sol = requerimiento_sol;
        this.riesgo_agua = riesgo_agua;
        this.nombres_vulgares = new ArrayList<>();
    }

    public String getNombreCientifico() {
        return nombre_cientifico;
    }

    public void setNombreCientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }    

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public ArrayList<String> getNombresVulgares() {
        return new ArrayList<String>(this.nombres_vulgares);
    }

    public void addNombreVulgar(String nombre) {
       if ((nombre != "") && (nombres_vulgares.contains(nombre))) {
            nombres_vulgares.add(nombre);
       }
    }

    public String getClasificacionSuperior() {
        return clasificacion_superior;
    }

    public void setClasificacionSuperior(String clasificacion_superior) {
        this.clasificacion_superior = clasificacion_superior;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getRequerimientoSol() {
        return requerimiento_sol;
    }

    public void setRequerimientoSol(int requerimiento_sol) {
        this.requerimiento_sol = requerimiento_sol;
    }

    public int getRiesgoAgua() {
        return riesgo_agua;
    }

    public void setRiesgoAgua(int riesgo_agua) {
        this.riesgo_agua = riesgo_agua;
    }

    
    @Override
    public String toString() {
        return "Planta "+nombre_cientifico +": { Clasificacion superior: "+clasificacion_superior+", familia: "+familia+" Clase:  "+clase
                                               +", Ubicacion: "+ubicacion+", Riego: "+riesgo_agua+", Sol: "+requerimiento_sol+
                                               ", Nombres vulgares: "+nombres_vulgares +"}\n";
    }    
}
