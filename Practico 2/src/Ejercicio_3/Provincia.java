package Ejercicio_3;

public class Provincia {
    String nombre;
    Ciudad[] ciudades;

    public Provincia(String nombre, Ciudad[] ciudades) {
        setNombre(nombre);
        this.ciudades = new Ciudad[ciudades.length];
        setCiudades(this.ciudades);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad[] getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudad[] ciudades) {
        for (int i = 0; i <ciudades.length; i++){
            this.ciudades[i] = ciudades[i];
        }
    }

    //Metodos
    public int contarCiudades(){
        return getCiudades().length;
      }

    public boolean tieneMasDeLaMitadEnDeficit(){
        int contador = 0;
        for(int i=0;i<getCiudades().length;i++){
          if(ciudades[i].gastaMasDeLoQueRecauda()){
            contador++;
          }
        }    
        return (contador == 0)? false : ((contarCiudades() / 2) <= contador);
      }

      public String obtenerCiudadesQueGastanMasDeLoQueRecaudan(){
        Ciudad[] ciudades = getCiudades();
        String nombres = "";
        
        for(int i=0; i<contarCiudades();i++){
          if(ciudades[i].gastaMasDeLoQueRecauda()){
            nombres += ciudades[i].getNombre() + " - ";
          }
        }
        return (nombres == "")? "Ninguna ciudad gasta mas de lo que recauda.": nombres;
      }

      public String obtenerNombresDeLasCiudades(){
        String nombres = "";
        for(int i=0; i<ciudades.length; i++) {
            nombres += ciudades[i].getNombre();
        }         
        
        return  nombres;
      }

    
}
