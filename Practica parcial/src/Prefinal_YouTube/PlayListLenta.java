package Prefinal_YouTube;

public class PlayListLenta extends PlayList { //no se si se crea o directamente se settea 35 en la PlayList padre;
    private String titulo;
    private static final int DEMORA = 35;

    public PlayListLenta(String titulo) {
        super(titulo, DEMORA);
    }


    
}
