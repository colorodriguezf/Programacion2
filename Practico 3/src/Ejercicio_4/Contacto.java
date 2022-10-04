package Ejercicio_4;

import java.time.LocalDate;

public class Contacto {
    private String nombre;
    private String apellido;
    private int numero_telefono;
    private LocalDate fecha_nacimiento;
    private String mail;
    private String ciudad;


    public Contacto(String nombre, String apellido, int numero_telefono, LocalDate fecha_nacimiento, String mail,
            String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_telefono = numero_telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.mail = mail;
        this.ciudad = ciudad;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getNumero_telefono() {
        return numero_telefono;
    }


    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }


    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public int getEdad() {
		int edad = 0;
		LocalDate hoy = LocalDate.now();
		int diferencia = hoy.getYear() - fecha_nacimiento.getYear();

		if (hoy.getYear() > fecha_nacimiento.getYear()) {
			if (hoy.getMonthValue() > fecha_nacimiento.getMonthValue()) {
				if (hoy.getDayOfMonth() > fecha_nacimiento.getDayOfMonth()) {
					edad = diferencia;
				} else {
					edad = diferencia + 1;
				}
			} else {
				edad = diferencia + 1;
			}
		}
		return edad;
	}


    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }


    public String getMail() {
        return mail;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public boolean contactoRepetido(Contacto contacto) {
        if(this.equals(contacto)) {
			return true;
		}
		return false;
    }

    public boolean mismoNumero (Contacto contacto) {

		if(this.getNumero_telefono()==contacto.getNumero_telefono()) {
			return true;
		}
		return false;
		
	}

    @Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", nroTelefono=" + numero_telefono + ", Edad: " + this.getEdad()+ ", ciudad: "+ this.getCiudad() +"]";
	}

    


}
