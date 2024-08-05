package Parcial_2023_TresArroyos.filtro.noLogico;

import Parcial_2023_TresArroyos.Empresa;
import Parcial_2023_TresArroyos.filtro.FiltroEmpresa;

public class FiltroMaterial extends FiltroEmpresa {
    private String material;

    public FiltroMaterial(String material) {
        this.material = material;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean cumple(Empresa e) {
        return e.getMateriales().contains(material);
    }
    
  
}
