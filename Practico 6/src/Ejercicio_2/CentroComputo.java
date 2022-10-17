package Ejercicio_2;

public class CentroComputo {
   private ColaEspera computadoras;
   private ColaEspera procesos;
   
   public CentroComputo() {
    this.computadoras = new ColaEspera();
    this.procesos = new ColaEspera();
   }

   public void addComputadora(Computadora compu) {
    if (compu == null) {
        return;
    }
    if(procesos.tieneElementos()) {
        Proceso proc = (Proceso) procesos.getSiguiente();
        compu.ejecutarProceso(proc);
    }
    else {
        computadoras.addElemento(compu);
    }
   }

   public void addProceso(Proceso proc) {
    if (proc == null){
        return;
    } 
    if (computadoras.tieneElementos()) {
        Computadora libre = (Computadora) computadoras.getSiguiente();
        libre.ejecutarProceso(proc);
    }
    else {
        procesos.addElemento(proc);
    }
   }

   public Computadora getSiguienteCompu() {
    return (Computadora) computadoras.getSiguiente();
   }

   public Proceso getSiguienteProceso() {
    return (Proceso) procesos.getSiguiente();
   }


}
