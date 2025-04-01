package com.market.java.domain.repository;

import com.market.java.domain.Product;
import java.util.List;
import java.util.Optional;

public interface productRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int idCategory);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
