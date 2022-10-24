package Ejercicio_1;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean ultima_cuota_paga;
    private ArrayList<Alquiler> alquileres;

    public Socio( String nombre, String apellido, int edad, boolean ultima_cuota_paga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultima_cuota_paga = ultima_cuota_paga;
        this.alquileres = new ArrayList<>();
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
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isUltimaCuotaPpaga() {
        return ultima_cuota_paga;
    }

    public void setUltimaCuotaPaga(boolean ultima_cuota_paga) {
        this.ultima_cuota_paga = ultima_cuota_paga;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<Alquiler>(this.alquileres);
    }

    public void setCanchas_alquiladas(Alquiler alquiler) {
        alquileres.add(alquiler);
    }


    //Metodos filtros

    public boolean alquiloCancha(String cancha) {
        boolean result = false;
        for(Alquiler allquiler : alquileres) {
            result = allquiler.getCancha().equals(cancha);
        }
        return result;
    }

    public int cantidadDeVecesSeAlquiloCancha(String cancha) {
        int total = 0;
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getCancha().equals(cancha)) {
                total++;
            }
        }
        return total;
    }

    public boolean pagoPrecioMayor(double precio) {
        for (Alquiler alquiler : alquileres) {
            if(alquiler.getPrecio() > precio) {
                return true;
            }
        }
        return false;
    }



    @Override
	public boolean equals(Object obj) {
		try{
			Socio otro = (Socio)obj;
			return this.getNombre().equals(otro.getNombre()) && this.getApellido().equals(otro.getApellido());
		}
		catch (Exception e){
		return false;
		}
	}




    
}
