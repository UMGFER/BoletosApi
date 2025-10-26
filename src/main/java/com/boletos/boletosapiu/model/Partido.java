package com.boletos.boletosapiu.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Partido {
    int id_partido;
    String equipo_visitante;
    String equipo_local;             
    Date fecha_partido; 
    String hora_inicio; 
    String tipo_partido;
    String estadio;
    String estado;
    String categoria;
                                        
    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public String getEquipo_visitante() {
        return equipo_visitante;
    }

    public void setEquipo_visitante(String equipo_visitante) {
        this.equipo_visitante = equipo_visitante;
    }

    public String getEquipo_local() {
        return equipo_local;
    }

    public void setEquipo_local(String equipo_local) {
        this.equipo_local = equipo_local;
    }

    public Date getFecha_partido() {
        return fecha_partido;
    }

    public void setFecha_partido(Date fecha_partido) {
        this.fecha_partido = fecha_partido;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_partido() {
        return tipo_partido;
    }

    public void setTipo_partido(String tipo_partido) {
        this.tipo_partido = tipo_partido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
