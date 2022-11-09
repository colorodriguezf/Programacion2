package Parcial2022;

import java.util.ArrayList;

import Parcial2022.filtros.Filtro;

public class NoticiaCompuesta extends ElementoPortal {
    private ArrayList<ElementoPortal> elementos;
    private int pos;

    public NoticiaCompuesta(int pos) {
        this.pos = pos;
    }

    
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }



    @Override
    public String getCategoria() {
        if (pos > elementos.size()) {
            return "Sin definir";
        }
        else {
            return elementos.get(pos).getCategoria();
        }
        
    }


    @Override
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> pal_claves = new ArrayList<String>();
        for(ElementoPortal elemento : elementos) {
           ArrayList<String> pal_hijas = elemento.getPalabrasClaves();
           for(String pal : pal_hijas) {
             if (!pal_claves.contains(pal)) {
                 pal_claves.add(pal);
             }
           }
         }
         return pal_claves;
    }


    @Override
    public ArrayList<Noticia> buscarNoticias(Filtro f1) {
        ArrayList<Noticia> noticias = new ArrayList<Noticia>();
        for(ElementoPortal elemento : elementos) {
           noticias.addAll(elemento.buscarNoticias(f1));             
        }
        
        return noticias;
    }
    
}
