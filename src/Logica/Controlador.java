package Logica;

import Persistencia.ControladorPersistencia;
import java.util.Date;

public class Controlador {

    ControladorPersistencia controlPersi = new ControladorPersistencia();
    
    public void altaProducto(int cod_prod,String nombre,int cantidad,String marca,String tipo,int precio,Date fecha_venc){
    Producto produ = new Producto ();
    produ.setCod_prod(cod_prod);
    produ.setNombre(nombre);
    produ.setCantidad(cantidad);
    produ.setMarca(marca);
    produ.setTipo(tipo);
    produ.setPrecio(precio);
    produ.setFecha_venc(fecha_venc);
    
    controlPersi.altaProducto(produ);
    
    }
    
}
