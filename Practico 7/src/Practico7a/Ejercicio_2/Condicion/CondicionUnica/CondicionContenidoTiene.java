package Practico7a.Ejercicio_2.Condicion.CondicionUnica;

import Practico7a.Ejercicio_2.Documento;
import Practico7a.Ejercicio_2.Condicion.Condicion;

public class CondicionContenidoTiene extends Condicion{
    private int minimo_palabras;

    public CondicionContenidoTiene(int minimo_palabras) {
        this.minimo_palabras = minimo_palabras;
    }

    @Override
    public boolean cumple(Documento documento) {
      return tieneMasPalabras(documento.getContenidoTextual());
    }

    private boolean tieneMasPalabras(String contenidoDelDocumento){
       //Se borran los espacios
        String contenidoCortado = contenidoDelDocumento.trim();
        /**
         * split divide el contenido en base a una expresion regular.
         * \s busca todos los espacios, tabs y saltos de linea, y el + 
         * especifica que junta aquellos que esten juntos.
         */
        return (contenidoCortado.split("\s+").length >= this.minimo_palabras);    
      }
    
}
