package Ejercicio_1;

import java.util.ArrayList;

import Filtros.Filtro;

public class Categoria extends AdministradorContenido {
    private String descripcion;
    private String img;
    private ArrayList<AdministradorContenido> elementos;

    public Categoria(String descripcion, String img) {
        this.descripcion = descripcion;
        this.img = img;
        this.elementos = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void addElemento(AdministradorContenido elemento) {
		elementos.add(elemento);
	}

    @Override
    public int cantidadNoticias() {
      int cantidad = 0;
      for (AdministradorContenido ac : elementos) {
        cantidad = ac.cantidadNoticias();
      }
      return cantidad;
    }

    @Override
    public AdministradorContenido copiaFiltro(Filtro filtro) {
        Categoria copia_filtrada = new Categoria(this.getDescripcion(),this.getImg());
		
		for(AdministradorContenido a : elementos) {
			AdministradorContenido copiaH = a.copiaFiltro(filtro);
			if(copiaH!=null) {
				copia_filtrada.addElemento(copiaH);
			}
		}
		return copia_filtrada;
    }

    @Override
    public ArrayList<Noticia> buscarSegunFiltro(Filtro filtro) {
        ArrayList<Noticia> resultado = new ArrayList<>();
		
		for(AdministradorContenido ac : elementos) {
			resultado.addAll(ac.buscarSegunFiltro(filtro));		
		}
		return resultado;
    }

    @Override
    public AdministradorContenido copia() {
        Categoria copia = new Categoria(this.getDescripcion(), this.getImg());
		
		for(AdministradorContenido ac  : elementos) {
			copia.addElemento(ac.copia());
		}
		
		return copia;
    }

    @Override
    public String getMapeoSitio() {
        String mapeo= " ";
		
		for(AdministradorContenido ac: elementos) {
			mapeo += this.getDescripcion() + " / ";
			mapeo += ac.getMapeoSitio();
		}
		return mapeo;
    }

    @Override
	public String toString() {
		return "Categoria " + getDescripcion() + ",  " + getImg() ;
	}
    

    
}
