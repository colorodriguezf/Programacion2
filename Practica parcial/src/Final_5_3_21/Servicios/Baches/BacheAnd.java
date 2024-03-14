package Final_5_3_21.Servicios.Baches;

import Final_5_3_21.Registro;

public class BacheAnd extends Bache {
    private Bache bache1;
    private Bache bache2;

    public BacheAnd(Bache bache1, Bache bache2) {
        this.bache1 = bache1;
        this.bache2 = bache2;
    }

    public Bache getBache1() {
        return bache1;
    }

    public void setBache1(Bache bache1) {
        this.bache1 = bache1;
    }

    public Bache getBache2() {
        return bache2;
    }

    public void setBache2(Bache bache2) {
        this.bache2 = bache2;
    }

    @Override
    public boolean generadoPorBache(Registro r) {
        return bache1.generadoPorBache(r) && bache2.generadoPorBache(r);
    }
    

}
