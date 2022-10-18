package Practico7a.Ejercicio_1;

import java.util.ArrayList;

import Practico7a.Ejercicio_1.Filtro.Condicion;

public class Empresa {
    private ArrayList<ProductoQuimico> productos_quimicos;

    public Empresa() {
        this.productos_quimicos = new ArrayList<ProductoQuimico>();
    }

    public void addProductoQuimico(ProductoQuimico producto) {
        if((producto != null) && (!productos_quimicos.contains(producto))) {
            productos_quimicos.add(producto);
        }
    }

    public ArrayList<ProductoQuimico> getProductosQuimicos() {
         return new ArrayList<ProductoQuimico>(this.productos_quimicos);
    }


    public ArrayList<ProductoQuimico> getAgroquimicos(Condicion condicion){
        ArrayList<ProductoQuimico> productosQuimicosValidos = new ArrayList<>();
        for (ProductoQuimico productoActual : productos_quimicos) {
          if(condicion.esValido(productoActual))
            productosQuimicosValidos.add(productoActual);
        }
    
        return productosQuimicosValidos;
      }


}
