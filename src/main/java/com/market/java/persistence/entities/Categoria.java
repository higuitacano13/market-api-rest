package com.market.java.persistence.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="categorias")
public class Categoria {

    /*
        ======== CLAVES ATRIBUTOS ==========
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private String estado;
    /*
            ======== CLAVES FORANEAS ==========
        */
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    /*
        ======== GETTER AND SETTER ==========
    */

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
