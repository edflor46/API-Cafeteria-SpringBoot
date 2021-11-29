package com.edflor.cafeteria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cafe")
public class Cafe {
    @Id
    private Long id;

    @Column(nullable = false)
    private String nombre_cafe;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private double precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_cafe() {
        return nombre_cafe;
    }

    public void setNombre_cafe(String nombre_cafe) {
        this.nombre_cafe = nombre_cafe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
