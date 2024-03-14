package Final_16_02_24.filtros.noLogicos;

import Final_16_02_24.Capitulo;
import Final_16_02_24.filtros.Filtro;

public class FiltroPaginasMenor extends Filtro {
    private int pag;

    public FiltroPaginasMenor(int pag) {
        this.pag = pag;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    @Override
    public boolean cumple(Capitulo c) {
       return c.getCantPag() < pag;
    }

    
}
