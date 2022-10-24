package Ejercicio_1;

import java.util.ArrayList;

import Filtros.Filtro;

public class Noticia extends AdministradorContenido {
    private String titulo;
    private ArrayList<String> palabras_claves;
    private String introduccion;
    private String texto;
    private String autor;
    private String link_asociado;

    
    public Noticia(String titulo, String introduccion, String texto, String autor, String link_asociado) {
        this.titulo = titulo;
        this.palabras_claves = new ArrayList<>();
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link_asociado = link_asociado;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getPalabrasClaves() {
        return palabras_claves;
    }
    public void setPalabrasClaves(String palabra) {
        if ((palabra != "") && (palabras_claves.contains(palabra))) {
                palabras_claves.add(palabra);
        }
    }

    public String getIntroduccion() {
        return introduccion;
    }
    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLinkAsociado() {
        return link_asociado;
    }
    public void setLinkAsociado(String link) {
        this.link_asociado = link;
    }


    @Override
    public int cantidadNoticias() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public AdministradorContenido copiaFiltro(Filtro f) {
        if(f.cumple(this)) {
            return new	Noticia(this.getTitulo(), this.getIntroduccion(), this.getTexto(), this.getAutor(), this.getLinkAsociado());
            }else {
                return null;
            }
    }


    @Override
    public ArrayList<Noticia> buscarSegunFiltro(Filtro f) {
        ArrayList<Noticia> cumplenCriterio = new ArrayList<>();
		
		if(f.cumple(this)) {
			cumplenCriterio.add(this);
		}
		return cumplenCriterio;
    }


    @Override
    public AdministradorContenido copia() {
        return   new Noticia(this.getTitulo(), this.getIntroduccion(), this.getTexto(), this.getAutor(), this.getLinkAsociado()) ;
    }


    @Override
    public String getMapeoSitio() {
        return  this.getLinkAsociado()  + "\n";
    }

    @Override
	public String toString() {
		return "Noticias " + getTitulo() + ", " + getIntroduccion() + " ,"
				+ getTexto() + " , " + getAutor() + " , " + getLinkAsociado() ;
	}

    
}
