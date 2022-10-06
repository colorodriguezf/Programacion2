package Ejercicio_3;

public class CerealGranoCosechaFina extends Cereal {
    
    public CerealGranoCosechaFina(String nombre) {
		super(nombre);
	}

	@Override
	public boolean cumple(Lote lote) {

		return true;
	}
}
