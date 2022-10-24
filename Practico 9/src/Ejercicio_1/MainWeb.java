package Ejercicio_1;

import Filtros.Filtro;
import Filtros.FiltroPalabraClave;

public class MainWeb {
    public static void main(String[] args) {        
		Categoria deportes = new Categoria("deportes", "messi.jpg");
		Categoria puterio = new Categoria("puterio", "wanda.jpg");
		Categoria politica = new Categoria("politica", "politica.jpg");
		Categoria economia = new Categoria("economia", "dolar.jpg");

        Categoria subSeccion1= new Categoria("tenis","del otro.jpg");
		Categoria subSeccion2= new Categoria("espetaculos","del otro.jpg");
		Categoria subSeccion3= new Categoria("elecciones","del otro.jpg");
		Categoria subSeccion4= new Categoria("criptomonedas","del otro.jpg");
		Categoria subSeccion5= new Categoria("futbol","messi.jpg");
		Categoria subSeccion6= new Categoria("boxeo","maravilla artinez.jpg");
		Categoria subSeccion7= new Categoria("natacion","delfinapignatielo.jpg");

        deportes.addElemento(subSeccion1);
		deportes.addElemento(subSeccion5);
		deportes.addElemento(subSeccion6);
		deportes.addElemento(subSeccion7);
		puterio.addElemento(subSeccion2);
		politica.addElemento(subSeccion3);
		economia.addElemento(subSeccion4);

        Noticia n1 = new Noticia("del potro se retira", "delpotrout", "el tenista tandilense se retira", "cacho", "link 1");
		Noticia n2 = new Noticia("icardi separado", "se separo de wandita", "la 3ra en discordia seria la china suarez", "jorge rial", "link 2");
		Noticia n3 = new Noticia("elecciones", "encuestas", "el plan del gobierno suma pocos votos", " boneli ", "link 3");
		Noticia n4 = new Noticia("sube el bitcoin", "bitcoin en alza", "la moneda virtual alcanza los 65k", "kevin", "link 4");
		Noticia n5 = new Noticia("river sigue puntero", "river ", "river gana y estira la ventaja", "farinella", "link 4");
		Noticia n6 = new Noticia("maravilla martinez va por el titulo", "maravilla cinturon", "maravilla martinez peleara contra el chino chin chu lin por el titulo ", "pagani", "link 5");
		Noticia n7 = new Noticia("pignatielo vuelve a stremear", "stream pignatiello", "la nadadora olimpica vuelve a stremear despues de las duras criticas por su desempenio en los JJOO", "pez", "link 6");

        subSeccion1.addElemento(n1);
		subSeccion2.addElemento(n2);
		subSeccion3.addElemento(n3);
		subSeccion4.addElemento(n4);
		subSeccion5.addElemento(n5);
		subSeccion6.addElemento(n6);
		subSeccion7.addElemento(n7);


        n1.setPalabrasClaves("delpotrout");
		
		Filtro f1 = new FiltroPalabraClave("delpotrout");
		
		System.out.println(deportes.buscarSegunFiltro(f1));
		System.out.println(subSeccion1.getMapeoSitio());
		System.out.println(deportes.getMapeoSitio());
		System.out.println(deportes.cantidadNoticias());

    }
}
