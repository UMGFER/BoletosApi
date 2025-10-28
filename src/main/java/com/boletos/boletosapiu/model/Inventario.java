package com.boletos.boletosapiu.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Inventario {
    int id_inventario;
    int id_partido;
    int id_localidad;
    int cantidad_total;
    int cantidad_disponible;

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public int getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(int id_localidad) {
        this.id_localidad = id_localidad;
    }

    public int getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(int cantidad_total) {
        this.cantidad_total = cantidad_total;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    @Override
public String toString() {
    // Format the date to a readable string

    
    return "Inventario{" +
            "id_inventario=" + id_inventario +
            ", id_partido='" + id_partido + '\'' +
            ", id_localidad='" + id_localidad + '\'' +
            ", cantidad_total=" + cantidad_total +
            ", cantidad_disponible='" + cantidad_disponible + '\'' +
            '}';
    }
}
