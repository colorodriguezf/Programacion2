package Parcial_2023.filtros.noLogicos;

import Parcial_2023.Empresa;
import Parcial_2023.filtros.Filtro;

public class MenosDeGrPla extends Filtro {
    private int gr_pla;
    
    public MenosDeGrPla(int gr_pla) {
        this.gr_pla = gr_pla;
    }

    public int getGr_pla() {
        return gr_pla;
    }

    public void setGr_pla(int gr_pla) {
        this.gr_pla = gr_pla;
    }

    @Override
    public boolean cumple(Empresa p) {
      return p.getPla() < gr_pla;
    }
    
}
