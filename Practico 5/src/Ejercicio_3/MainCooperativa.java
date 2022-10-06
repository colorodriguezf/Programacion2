package Ejercicio_3;

public class MainCooperativa {
    public static void main(String[] args) {
        Cooperativa c1 = new Cooperativa("Coop Agricola");

        Agricultor a1 = new Agricultor("Juan");
        Agricultor a2 = new Agricultor("Pedro");
       
                // c1.setAgricultor(a1);
                // c1.setAgricultor(a2);
        
        Lote l1 = new Lote("Lote 1", 40);
        Lote l2 = new Lote("Lote 2", 34);
        Lote l3 = new Lote("Lote 3", 23);

                c1.setLotes(l1);
                c1.setLotes(l2);
                c1.setLotes(l3);
            

        CerealGranoCosechaFina trigo = new CerealGranoCosechaFina("Trigo");
        CerealGranoCosechaGruesa maiz = new CerealGranoCosechaGruesa("Maiz");
        CerealPastura alfalfa = new CerealPastura("Alfalfa",30);

        trigo.setMineralesRequeridos("mineral 1");
        trigo.setMineralesRequeridos("mineral 2");
        maiz.setMineralesRequeridos("mineral 3");
        maiz.setMineralesRequeridos("mineral 5");
        alfalfa.setMineralesRequeridos("mineral 1");
        alfalfa.setMineralesRequeridos("mineral 2");

        l1.setMineralesLote("mineral 1");
        l1.setMineralesLote("mineral 2");
        l2.setMineralesLote("mineral 3");
        l2.setMineralesLote("mineral 5");
        l3.setMineralesLote("mineral 1");
        l3.setMineralesLote("mineral 3");
        

        System.out.println("Cereales que pueden plantarse en " + l1.getNombre());



    }
}
