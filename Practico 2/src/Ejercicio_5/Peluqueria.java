package Ejercicio_5;

import java.util.ArrayList;
import java.time.LocalDate;


public class Peluqueria {
    private String nombre;
    private ArrayList<Turno> turnos;
	private int descuento;
	private int cantMinTurnosSacados;
	private int cantMesesParaSerFrecuente;

	public Peluqueria(String nombre) {
		this.nombre = nombre;
		this.descuento = 10;
		this.cantMinTurnosSacados = 1;
		this.cantMesesParaSerFrecuente = 1;
		this.turnos = new ArrayList<>();
	}
    public Peluqueria(String nombre, int descuento, int minTurnos, int cantDiasFrecuente) {
		this.nombre = nombre;
		this.descuento = descuento;
		this.cantMinTurnosSacados = minTurnos;
		this.cantMesesParaSerFrecuente = cantDiasFrecuente;
		this.turnos = new ArrayList<>();
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Turno> getTurnos() {
        return new ArrayList<Turno>(this.turnos);
    }

    public void agregarTurno(Turno turno) {
        if (!this.turnos.contains(turno)) {
            this.turnos.add(turno);
        }
    }

    public void asignarTurno(Turno turno) {
		if (!turno.peluqueroDisponible(turno)) {
			for (int i = 0; i < this.turnos.size() - 1; i++) {
				this.turnos.get(i + 1).setCliente(turno.getCliente());
				if (this.turnos.get(i) == null) {
					System.out.println(
							"No se puede asignar el turno porque el peluquero tiene todos sus turnos ocupados");
				} else {
					System.out.println("Funciono");
				}

			}
		}
	}

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getCantMinTurnosSacados() {
        return cantMinTurnosSacados;
    }

    public void setCantMinTurnosSacados(int cantMinTurnosSacados) {
        this.cantMinTurnosSacados = cantMinTurnosSacados;
    }
    
    public int getCantMesesParaSerFrecuente() {
        return cantMesesParaSerFrecuente;
    }
    
    public void setCantMesesParaSerFrecuente(int cantMesesParaSerFrecuente) {
        this.cantMesesParaSerFrecuente = cantMesesParaSerFrecuente;
    }
    
}
