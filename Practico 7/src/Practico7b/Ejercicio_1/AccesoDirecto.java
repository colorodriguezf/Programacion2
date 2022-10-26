package Practico7b.Ejercicio_1;

public class AccesoDirecto extends ElementoFS {
    private static final int TAMANIO = 1;
    private static final String PREFIJO = "Acceso directo a ";
    private ElementoFS loQueApunta;

    public AccesoDirecto(ElementoFS loQueApunta) {
        super(PREFIJO+loQueApunta.getNombre());
        this.loQueApunta = loQueApunta;
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
    }

    @Override
    public int cantArchivos() {
        return 0;
    }
    
}
