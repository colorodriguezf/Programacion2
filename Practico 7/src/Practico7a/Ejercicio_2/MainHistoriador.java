package Practico7a.Ejercicio_2;
import Practico7a.Ejercicio_2.Condicion.CondicionCombinada.*;
import Practico7a.Ejercicio_2.Condicion.CondicionUnica.*;

public class MainHistoriador {
    public static void main(String[] args) {
        Documento doc1 = new Documento("Don quijote", "un caballero andante que sale al mundo a cumplir su alta misión de justicia, pero en una época en la que su ideal había muerto. Don Quijote, mejor conocido como Alonso Quijano, ha perdido la razón leyendo libros de caballería. Como consecuencia, él se inventa en su mente una vida imaginaria que es relatada a lo largo de la obra con sus tres salidas, llenas de aventuras, viajes, peripecias y algo de humor y romance.");
        doc1.addAutor("Autor 1");
        doc1.addPalabraClave("aventura");
        doc1.addPalabraClave("romance");
        
        Documento doc2 = new Documento("Los juegos del hambre", "Los juegos del hambre se desarrolla en un país llamado Panem, lo que es en realidad una civilización postapocalíptica ubicada en lo que antes era América del Norte. El territorio se comprende de El Capitolio, que es la central del país, y trece estados que están bajo su control, los cuales son llamados distritos. Se buscara justicia");
        doc2.addAutor("Autor 2");
        doc2.addPalabraClave("accion");
        doc2.addPalabraClave("aventuras");
        doc2.addPalabraClave("muerte");

        Documento doc3 = new Documento("Conquistadores del Mundo", "Se cumplen 500 años de la caída de México (Tenochtitlán) y 200 años de la independencia de México, Colón, Cortés, Pizarro.... fueron glorificados como aventureros heroicos que evangelizaron y construyeron un imperio como nunca se había visto.");
        doc2.addAutor("Autor 3");
        doc2.addPalabraClave("accion");
        doc2.addPalabraClave("conquistadores");
        doc2.addPalabraClave("muerte");

        Archivo archivo = new Archivo();
        archivo.agregarDocumento(doc1);
        archivo.agregarDocumento(doc2);
        archivo.agregarDocumento(doc3);
        

    System.out.println("Titulo igual a 'Don quijote': ");
    System.out.println(archivo.getDocumentosQueCumplen(new CondicionTituloExacto("Don quijote")));
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("Titulo contiene palabra 'del': ");
    System.out.println(archivo.getDocumentosQueCumplen(new CondicionTituloContengaPalabra("del")));
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("Palabras claves contiene la palabra 'thriller': ");
    System.out.println(archivo.getDocumentosQueCumplen(new CondicionTienePalabraClave("justicia")));
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("Palabras claves NO contiene la palabra clave 'justicia': ");
    System.out.println(archivo.getDocumentosQueCumplen(new CondicionNot(new CondicionTienePalabraClave("justicia"))));
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("Contenido almenos 100 palabras: ");
    System.out.println(archivo.getDocumentosQueCumplen(new CondicionContenidoTiene(80)));
    }
}
