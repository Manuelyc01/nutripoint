package pe.isil.service;

import pe.isil.model.Product;

import java.util.List;

public interface ProductServ {
    List<Product> getAll();

    void create(Product product);

    Product getProduct(Integer id);
}
