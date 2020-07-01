package pe.isil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.isil.model.Product;
import pe.isil.service.CarritoService;
import pe.isil.service.ProductServ;

@Controller
public class CarritoController {

    final ProductServ productServ;
    final CarritoService carritoService;
    public CarritoController(ProductServ productServ, CarritoService carritoService) {
        this.productServ = productServ;
        this.carritoService = carritoService;
    }

    @GetMapping("/addCarrito/{id_pro}")
    public String addCarrito(@PathVariable Integer id_pro, Model model){
        Product product= productServ.getProduct(id_pro);
        carritoService.addProduct(product);
        System.out.println(carritoService.getList());
        return "redirect:/products";
    }
}

