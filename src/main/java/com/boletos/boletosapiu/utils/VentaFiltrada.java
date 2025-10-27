/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boletos.boletosapiu.utils;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author AMD 5600G
 */
public class VentaFiltrada {
    BigDecimal total;
    String fecha_venta;
    String tipo_partido;

    public VentaFiltrada(BigDecimal total, String fecha_venta, String tipo_partido) {
        this.total = total;
        this.fecha_venta = fecha_venta;
        this.tipo_partido = tipo_partido;
    }
    
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getTipo_partido() {
        return tipo_partido;
    }

    public void setTipo_partido(String tipo_partido) {
        this.tipo_partido = tipo_partido;
    }

    @Override
    public String toString(){
        return "Fecha: " + fecha_venta + "Tipo partido: "+ tipo_partido + "Total: " + total;
    }
    
}
