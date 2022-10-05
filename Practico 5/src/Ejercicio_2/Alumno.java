package Ejercicio_2;

import java.util.ArrayList;

    public class Alumno extends Persona {

        private ArrayList<String> cualidades;
        private ArrayList<Persona> familiares;
        private Casa casa;
    
        public Alumno(String nombre) {
            super(nombre);
            this.cualidades = new ArrayList<String>();
            this.familiares = new ArrayList<Persona>();
        }
    
        public ArrayList<String> getCualidades() {
            return new ArrayList<String>(this.cualidades);
        }
    
        public void setCualidad(String cualidad) {
            if (!this.cualidades.contains(cualidad)) {
                this.cualidades.add(cualidad);
            }
        }

        private ArrayList<Persona> getFamiliares() {
            return new ArrayList<Persona>(this.familiares);
        }
    
        public void agregarFamiliar(Persona persona) {
            if (!this.familiares.contains(persona)) {
                this.familiares.add(persona);
            }
        }    
        
        public boolean perteneceAalgunaCasa() {
            
            if(this.casa!=null) {
                return true;
            }
            return false;
        }
    
        public boolean familiarPermaneceMismaCasaQueAlumno(Casa casa) {
    
            for (int i = 0; i < this.getFamiliares().size(); i++) {
                if (casa.getFamiliares().contains(this.familiares.get(i))) {
                    return true;
                }
            }
            return false;
        }
    
        public boolean estuvoEnCasaEnemiga(CasaEnemistada casa) {
    
            for (int i = 0; i < this.getCasasEnLaQueEstuvo().size(); i++) {
                for (int j = 0; j < casa.getCasasEnemigas().size(); j++) {
    
                    if (this.getCasasEnLaQueEstuvo().get(i).equals(casa.getCasasEnemigas().get(j))) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        public void asignarCasa(Casa casa) {
            if(this.casa!=null) {
                this.casa = casa;
            }
        }
    
        public void setCasa(Casa casa) {
            this.casa = casa;
        }

}
