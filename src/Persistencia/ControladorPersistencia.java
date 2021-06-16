package Persistencia;

import Logica.Producto;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {

    ProductoJpaController jpaProducto = new ProductoJpaController();

    public void altaProducto(Producto produ) {

        try {
            jpaProducto.create(produ);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
