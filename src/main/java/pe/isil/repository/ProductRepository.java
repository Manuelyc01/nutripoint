package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.isil.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
