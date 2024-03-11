package Final_17_03_23;

import java.util.ArrayList;
import java.util.List;

import Final_17_03_23.efectos.Efecto;
import Final_17_03_23.efectos.EfectoCalorias;
import Final_17_03_23.efectos.EfectoFrecuenciaMaxima;
import Final_17_03_23.efectos.EfectoHsRecuperacion;
import Final_17_03_23.filtros.Filtro;
import Final_17_03_23.filtros.logicos.FiltroAnd;
import Final_17_03_23.filtros.noLogicos.FiltroDuracionMayor;
import Final_17_03_23.filtros.noLogicos.FiltroEnergiaMenor;
import Final_17_03_23.filtros.noLogicos.FiltroInstruccionContiente;
import Final_17_03_23.filtros.noLogicos.FiltroIntensidadMenor;

public class MainEntrenamiento {
    public static void main(String[] args) {
        //Parte 1
        Entrenamiento entrenamiento1 = new Entrenamiento("Correr 5 km", 30, 100, 80, "Correr 5 km a ritmo moderado");
        Entrenamiento entrenamiento2 = new Entrenamiento("Levantamiento de pesas", 45, 300, 90, "Hacer levantamiento de pesas");
        Entrenamiento entrenamiento3 = new Entrenamiento("Estiramiento", 15, 100, 50, "Estiramiento de todo el cuerpo");
        Entrenamiento entrenamiento4 = new Entrenamiento("Levantamiento de pesas", 15, 100, 50, "Estiramiento de todo el cuerpo");
        
        EntrenamientoCompuesto ec1 = new EntrenamientoCompuesto("Entrenamiento compuesto 1", 2);
        ec1.setElementos(entrenamiento1);
        ec1.setElementos(entrenamiento2);
        ec1.setElementos(entrenamiento3);
        
        Filtro costoEnergia = new FiltroEnergiaMenor(200);
        Filtro filtroDuracion = new FiltroDuracionMayor(30);
        Filtro instruccion = new FiltroInstruccionContiente("Levantamiento de pesas");
        Filtro intensidad = new FiltroIntensidadMenor(100);
        
        System.out.println("Parte 1: ");
        System.out.println("1)a- Entrenamientos cuyo costo de energia menor a 200: " + ec1.buscar(costoEnergia));
        System.out.println("1)b- Entrenamientos cuya duracion sea mayor a 30 minutos: " + ec1.buscar(filtroDuracion));
        System.out.println("1)c- Entrenamientos cuya inturccion contenga 'Levantamiento de pesas': " + ec1.buscar(instruccion));
        System.out.println("1)d- Entrenamientos cuya intensidad sea mayor a 100: " + ec1.buscar(intensidad));
        System.out.println("1)e- COMBINACION LOGICA: duracion > 30 y  energia < a 200: " + ec1.buscar(new FiltroAnd(filtroDuracion, costoEnergia)));
        



        // Parte 2
        Atleta atleta = new Atleta("Juan", 70, 1500, 5000, 8);
        
        atleta.setEntrenamientos(entrenamiento1);
        atleta.setEntrenamientos(entrenamiento2);
        atleta.setEntrenamientos(entrenamiento3);

        // Definir algunos efectos de salud para el atleta
        Efecto efectoFCMax = new EfectoFrecuenciaMaxima(intensidad, 1.01);
        Efecto efectoCalorias = new EfectoCalorias(costoEnergia);
        Efecto efectoRecuperacion = new EfectoHsRecuperacion(filtroDuracion, 2.2);

        atleta.setEfectos(efectoFCMax);
        atleta.setEfectos(efectoCalorias);
        atleta.setEfectos(efectoRecuperacion);

        System.out.println(" ");
        System.out.println("Parte 2: ");
        System.out.println("2)a- Frecuencia cardiaca maxima: " + atleta.getFrecuencia_cardiaca_maxima());
        System.out.println("2)b- Cantidad calorias: " + atleta.getCant_calorias_gastadas_dia());
        System.out.println("2)c- Cantidad de hs de recuperacion: " + atleta.getCant_hs_recuperacion());
        atleta.ejecutarEntrenamiento();
        System.out.println(" ");
        System.out.println("2)a- Frecuencia luego de ejecutar entrenamiento: "+ atleta.getFrecuencia_cardiaca_maxima());
        System.out.println("2)b- Calorias luego de ejecutar entrenamiento: "+ atleta.getCant_calorias_gastadas_dia());
        System.out.println("2)c- Hs de recuperacion luego de ejecutar entrenamiento: "+ atleta.getCant_hs_recuperacion());

    }

}
