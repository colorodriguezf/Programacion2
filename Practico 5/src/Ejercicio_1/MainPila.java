package Ejercicio_1;

public class MainPila {
    public static void main(String[] args) {
        Elemento e1 = new Elemento("Elemento 1");
        Elemento e2 = new Elemento("Elemento 2");
        Elemento e3 = new Elemento("Elemento 3");
        Elemento e4 = new Elemento("Elemento 4");
        Elemento e5 = new Elemento("Elemento 5");

        Pila p1 = new Pila();
        p1.push(e1);
        p1.push(e2);
        p1.push(e3);
        p1.push(e4);
        p1.push(e5);

        System.out.println("Array: "+p1.getElementos());
        System.out.println("--------------------");
        System.out.println("Copia: "+p1.copy());
        System.out.println("--------------------");
        p1.pop();
        System.out.println("Copia luego de hacer el pop: "+p1.copy());
        System.out.println("--------------------");
        System.out.println("Copia reversa: "+p1.reverse());

  

    }
}
