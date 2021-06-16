package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Producto implements Serializable {

    @Id
    private int cod_prod;
    @Basic
    private String nombre;
    private int cantidad;
    private String marca;
    private String tipo;
    private int precio;
    @Temporal(TemporalType.DATE)
    private Date fecha_venc;

    public Producto() {
    }

    public Producto(int cod_prod, String nombre, int cantidad, String marca, String tipo, int precio, Date fecha_venc) {
        this.cod_prod = cod_prod;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.fecha_venc = fecha_venc;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_venc() {
        return fecha_venc;
    }

    public void setFecha_venc(Date fecha_venc) {
        this.fecha_venc = fecha_venc;
    }

}
