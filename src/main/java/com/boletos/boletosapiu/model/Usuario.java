package com.boletos.boletosapiu.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Usuario {
    int id_usuario;
    String nombre_usuario;
    String contrasena_hash;
    String nombre_completo;
    String rol;
    Date fecha_creacion;
    boolean estado;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena_hash() {
        return contrasena_hash;
    }

    public void setContrasena_hash(String contrasena_hash) {
        this.contrasena_hash = contrasena_hash;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", contrasena_hash='" + contrasena_hash + '\'' +
                ", nombre_completo='" + nombre_completo + '\'' +
                ", rol='" + rol + '\'' +
                ", fecha_creacion=" + fecha_creacion +
                '}';
    }
}
