package Ejercicio_4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mesa extends ElementoElectoral{
    private ArrayList<Integer> padron;
    private ArrayList<Voto>votos;

    public Mesa(){
		this.padron = new ArrayList<>();
		this.votos = new ArrayList<>();
	}

    public void addDni(int dni){
		this.padron.add(dni);
	}
	
	
	public void addVoto(Voto voto, int dni){
		if (this.padron.contains(dni)){
			this.votos.add(voto);
		}
	}


    @Override
    public int cantidadVotos() {
        return this.votos.size();
    }

    @Override
    public double porcentajeVotosPorCandidato(Candidato candidato) {
       int cantidad = 0;
		for (Voto voto : votos) {
			if (voto.getCandidato().equals(candidato))
				cantidad++;
        }
		return (cantidad/cantidadVotos()*100);
    }

    @Override
    public double porcentajeVotosEnBlanco(Candidato candidato) {
       int cant_votos_blanco = 0;
		for (Voto voto : votos){
			if (candidato == null){
                cant_votos_blanco ++;
			}
		}
		return (cant_votos_blanco/cantidadVotos()*100);
    }
    @Override
    public double porcentajeVotosPorHora(LocalDate inicio, LocalDate fin) {
        int cantidad = 0;
		for (Voto voto : votos) {
			if (voto.getHora().isAfter(inicio) && voto.getHora().isBefore(fin)){
				cantidad++;
            }
        }
		return (cantidad/cantidadVotos()*100);
    }

}
