package Practico7a.Ejercicio_1;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo> cultivos_prohibidos;
    private ArrayList<String> estados_patologicos;

    

    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.cultivos_prohibidos = new ArrayList<Cultivo>();
        this.estados_patologicos = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cultivo> getCultivos_prohibidos() {
        return new ArrayList<Cultivo>(this.cultivos_prohibidos);
    }

    public void addCultivo_prohibido(Cultivo cultivo_prohibido) {
       if ((cultivo_prohibido != null) && (cultivos_prohibidos.contains(cultivo_prohibido))) {
        this.cultivos_prohibidos.add(cultivo_prohibido);
       }
    }

    public ArrayList<String> getEstados_patologicos() {
        return new ArrayList<String>(this.estados_patologicos);
    }

    public void setEstados_patologicos(String estado_patologico) {
       if((estado_patologico != "") && (!estados_patologicos.contains(estado_patologico))) {
        this.estados_patologicos.add(estado_patologico);
       }
    }


      /**
   * Verifica que el cultivo NO esté dentro de los cultivos desaconsejados del producto químico.
   * @param cultivo a verificar.
   * @return true / false.
   */
    public boolean sePuedeAplicar(Cultivo cultivo) {
        return !cultivos_prohibidos.contains(cultivo);
    }

    /**
   * Verifica que el producto quimico sea capaz de tratar todos los estados patologicos de la enfermedad
   * @param enfermedad a verificar sus estados patologicos
   * @return true / false
   */
    public boolean puedeTratarEnfermedad(Enfermedad enfermedad) {
        return estados_patologicos.containsAll(enfermedad.getEstadosPatologicosATratar());
    }


     /**
   * Dado un ArrayList De enfermedades, verifica si el producto quimico es 
   * eficaz contra almenos 1 de las enfermedades frecuentes.
   * @param enfermedadesFrecuentes a evaluar.
   * @return true / false.
   */
  public boolean trataAlgunaEnfermedadFrecuente(ArrayList<Enfermedad> enfermedadesFrecuentes){
    for (Enfermedad enfermedadActual : enfermedadesFrecuentes) {
      if(puedeTratarEnfermedad(enfermedadActual)){
          return true;
      }
    }
    return false;
  }


    @Override
    public String toString() {
      return "Nombre: " + this.nombre + ", cultivos desaconsejados: " + this.cultivos_prohibidos + ", estados patologicos: " + this.estados_patologicos + "\n";
    }
    
}
