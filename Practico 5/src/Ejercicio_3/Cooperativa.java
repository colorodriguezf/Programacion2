package Ejercicio_3;

import java.util.ArrayList;

public class Cooperativa {
   private String nombre;
   private ArrayList<Agricultor> agricultores;
   private ArrayList<Cereal> cereales;
   private ArrayList<Lote> lotes;
   private ArrayList<String> minerales_interes_primario;
   private ArrayList<String> minerales_secundarios;

   public Cooperativa(String nombre) {
    this.nombre = nombre;
    this.cereales = new ArrayList<Cereal>();
    this.lotes = new ArrayList<Lote>();
    this.minerales_interes_primario = new ArrayList<String>();
    this.minerales_secundarios = new ArrayList<String>();

   }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public ArrayList<Agricultor> getAgricultores() {
    return new ArrayList<Agricultor>(this.agricultores);
}

public void setAgricultor(Agricultor agricultor) {
    this.agricultores.add(agricultor);
}

public ArrayList<Cereal> getCereales() {
    return new ArrayList<Cereal>(this.cereales);
}

public void setCereales(Cereal cereal) {
    this.cereales.add(cereal);
}

public ArrayList<Lote> getLotes() {
    return new ArrayList<Lote>(this.lotes);
}

public void setLotes(Lote lote) {
    if (!this.lotes.contains(lote)) {
        this.lotes.add(lote);
    }
}

public ArrayList<String> getMinerales_interes_primario() {
    return new ArrayList<String>(this.minerales_interes_primario);
}

public void setMinerales_interes_primario(String mineral) {
    this.minerales_interes_primario.add(mineral);
}

public ArrayList<String> getMinerales_secundarios() {
    return new ArrayList<String>(this.minerales_secundarios);
}

public void setMinerales_secundarios(String mineral) {
    this.minerales_secundarios.add(mineral);
}


   
}
