package Ejercicio_4;

import java.util.ArrayList;

public class Celular {
    private String duenio;
    private ArrayList<Contacto> contactos;
    private ArrayList<Contacto> contactos_repetidos;
    private ArrayList<Contacto> contactos_mismo_numero;

    public Celular(String duenio) {
        this.duenio = duenio;
        this.contactos = new ArrayList<>();
        this.contactos_repetidos = new ArrayList<>();
        this.contactos_mismo_numero = new ArrayList<>();
    }

 

    
    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }




    public ArrayList<Contacto> getContactos() {
        return new ArrayList<Contacto>(this.contactos);
    }


    public void setContactos(Contacto contacto) {
        if ((contacto != null) && (!contactos.contains(contacto))) {
            contactos.add(contacto);
        }
    }


    public ArrayList<Contacto> getContactosRepetidos() {
        return new ArrayList<Contacto>(this.contactos_repetidos);
    }

    public void setContactosMismoNnumero(Contacto contacto) {
        if ((contacto != null) && (!contactos_mismo_numero.contains(contacto))) {
            contactos_mismo_numero.add(contacto);
        }
    }

    public ArrayList<Contacto> getContactosMismoNroTelefono() {
		return new ArrayList<Contacto>(this.contactos_mismo_numero);
	}

    public boolean esContactoRepetido(Contacto contacto) {
        for (Contacto c : this.contactos) {
            if(c.contactoRepetido(contacto)) {
                return true;
            }
        }
         return false;
    }

    public boolean tieneMismoNumeroTelefono(Contacto contacto) {

		for (Contacto c : this.contactos) {
			if (c.mismoNumero(contacto)) {
				return true;
			}
		}

		return false;
	}


    public double getPromedio_edad() {
        int cantidad_contactos = 0;
        int edad_total = 0;

        for (Contacto c : this.contactos) {
            edad_total += c.getEdad();
            cantidad_contactos++;
        }
         
        return  ( edad_total / cantidad_contactos);
    }

    


    
}
