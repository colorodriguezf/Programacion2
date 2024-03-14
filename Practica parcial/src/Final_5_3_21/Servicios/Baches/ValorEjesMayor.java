package Final_5_3_21.Servicios.Baches;

import Final_5_3_21.Registro;

public class ValorEjesMayor extends Bache {
    private int valor;
    
    public ValorEjesMayor(int valor) {
        this.valor = valor;
    } 
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean generadoPorBache(Registro r) {
        return ((r.getX() + r.getY() + r.getZ()) > valor);
    }

    
}
