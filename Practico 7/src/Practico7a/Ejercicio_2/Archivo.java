package Practico7a.Ejercicio_2;

import java.util.ArrayList;

import Practico7a.Ejercicio_2.Condicion.Condicion;

public class Archivo {
    private ArrayList<Documento> documentos;

    public Archivo(){
        documentos = new ArrayList<>();
    }

    public void agregarDocumento(Documento nuevoDocumento){
         if((nuevoDocumento != null) && (!documentos.contains(nuevoDocumento))){
            documentos.add(nuevoDocumento);
            }
    }

    /**
   * Dada una condicion, devuelve todos documentos que cumplan la condicion.
   * @param condicion a cumplir.
   * @return (ArrayList<Documento>).
   */
  public ArrayList<Documento> getDocumentosQueCumplen(Condicion condicion){
    ArrayList<Documento> resultados = new ArrayList<>();
    for (Documento documento : documentos) {
      if(condicion.cumple(documento))
        resultados.add(documento);
    }

    return resultados;
  }

}
