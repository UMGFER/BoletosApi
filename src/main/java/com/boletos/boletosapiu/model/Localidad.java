package com.boletos.boletosapiu.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Localidad {
    int id_localidad;
    String nombre;
    BigDecimal precio;

    public int getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(int id_localidad) {
        this.id_localidad = id_localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    
@Override
public String toString() {
    // Format the date to a readable string

    
    return "Localidad{" +
            "id_localidad=" + id_localidad +
            ", nombre='" + nombre + '\'' +
            ", precio='" + precio + '\'' +
            '}';
    }

}
