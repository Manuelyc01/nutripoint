package pe.isil.service;

import org.springframework.stereotype.Service;
import pe.isil.model.Product;
import pe.isil.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService implements ProductServ {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    @Override
    public void create(Product product){
        productRepository.save(product);
    }

    @Override
    public Product getProduct(Integer id){
        return productRepository.getOne(id);
    }
}
