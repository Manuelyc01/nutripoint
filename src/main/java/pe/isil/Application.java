package pe.isil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.isil.model.Product;
import pe.isil.repository.RoleRepository;
import pe.isil.service.ProductService;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    RoleRepository roleRepository;
    @Autowired
    ProductService productService;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Product product = new Product(1,"BCAA 12000-Ultimate Nutrition","sad","https://www.demusculos.com/sitio/2259-thickbox_default/animal-pak.jpg",100,250.00);
        productService.create(product);
        Product product2 = new Product(2,"Gold Standard","ads","https://www.demusculos.com/sitio/2259-thickbox_default/animal-pak.jpg",200,145.00);
        productService.create(product2);
        Product product3 = new Product(3,"Biotech Isolate","asd","https://www.demusculos.com/sitio/2259-thickbox_default/animal-pak.jpg",50,150.00);
        productService.create(product3);
        Product product4 = new Product(4,"Clembuterol Pack","asd","https://www.demusculos.com/sitio/2259-thickbox_default/animal-pak.jpg",50,350.00);
        productService.create(product4);



    }
}