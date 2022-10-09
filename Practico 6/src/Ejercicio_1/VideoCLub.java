package Ejercicio_1;

import java.util.ArrayList;

public class VideoCLub {
    private ArrayList<Cliente>clientes;
	private ArrayList<String>clientesVencidos;


	public VideoCLub() {
		this.clientes = new  ArrayList<Cliente>();
		this.clientesVencidos = new ArrayList<String>();
	}
	
	public void addCliente(Cliente c1) {
		this.clientes.add(c1);
	}
	
	
	public ArrayList<String> clientesVencido(){		
		return new ArrayList<String>(this.clientesVencidos);
	}
	public void addClienteVencido() {
		for(int i=0;i<clientes.size();i++ ) {
			if(this.clientes.get(i).estaVencido()) {
				clientesVencidos.add(this.clientes.get(i).getNombre());
			}
		}
	}
	
    
}
