package com.boletos.boletosapiu.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Venta {
    int id_venta;
    int id_usuario; //Se refiere al vendedor
    String nombre_comprador;
    String correo_comprador;
    String tipo_pago;
    Date fecha_venta;
    BigDecimal total_venta;

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_comprador() {
        return nombre_comprador;
    }

    public void setNombre_comprador(String nombre_comprador) {
        this.nombre_comprador = nombre_comprador;
    }

    public String getCorreo_comprador() {
        return correo_comprador;
    }

    public void setCorreo_comprador(String correo_comprador) {
        this.correo_comprador = correo_comprador;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public BigDecimal getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(BigDecimal total_venta) {
        this.total_venta = total_venta;
    }
    
@Override
public String toString() {
    // Format the date to a readable string

    
    return "Venta{" +
            "id_venta=" + id_venta +
            ", id_usuario='" + id_usuario + '\'' +
            ", nombre_comprador='" + nombre_comprador + '\'' +
            ", correo_comprador=" + correo_comprador +
            ", tipo_pago='" + tipo_pago + '\'' +
            ", fecha_venta='" + fecha_venta + '\'' +
            ", total_venta='" + total_venta + '\'' +
            '}';
    }

}
