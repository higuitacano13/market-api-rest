package com.market.java.persistence;

import com.market.java.persistence.crud.ProductoCrudRepository;
import com.market.java.persistence.entities.Producto;
import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return (List<Producto>) productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad, Boolean estado){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }
}
