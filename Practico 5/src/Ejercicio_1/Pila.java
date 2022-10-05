package Ejercicio_1;

import java.util.ArrayList;

public class Pila {

    private ArrayList<Elemento> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }

    public void push(Elemento elemento) {
        this.elementos.add(elemento);
    }

    public void pop() {
        this.elementos.remove(top());
    }

    public ArrayList<Elemento> getElementos() {
        return new ArrayList<Elemento>(this.elementos);
    }

    //Devuelve la ultima posicion, se la retornamos a pop, y este la elimina
    public int top() {
        return this.elementos.size()-1;
    }

    //Metodos adicionales: size(), copy() y reverse()
    public int size() {
        return this.elementos.size();
    }

    public ArrayList<Elemento> copy() {
        return new ArrayList<Elemento>(this.elementos);
    }

    public ArrayList<Elemento> reverse() {
        ArrayList<Elemento> elementos_reverse = new ArrayList<>();

        for(int i = this.elementos.size()-1; i > 0; i--) {
            elementos_reverse.add(this.elementos.get(i));
        }

        return elementos_reverse;
    }
    
}
