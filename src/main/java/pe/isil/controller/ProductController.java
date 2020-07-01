package pe.isil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.isil.model.Product;
import pe.isil.service.CarritoService;
import pe.isil.service.ProductServ;

import java.util.List;

@Controller
public class ProductController {

    final ProductServ productServ;
    final CarritoService carritoService;

    public ProductController(ProductServ productServ, CarritoService carritoService)
    {
        this.productServ = productServ;
        this.carritoService = carritoService;
    }

    @GetMapping("/products")
    public String getProductList(Model model)
    {
        List<Product> productList = productServ.getAll();
        int list = carritoService.list();
        model.addAttribute("products", productList);
        model.addAttribute("carrito",list);

        return "products";
    }
/*

    @GetMapping("/products/add")
    public String addProduct(Model model)
    {
        model.addAttribute("product", new Product());

        return "product-add";
    }

    @PostMapping("/products/save")
    public String toSaveProduct(Product product)
    {
        productService.saveProduct(product);

        return "redirect:/products";
    }

    @GetMapping("/products/edit/{codigo_pro}")
    public String editProduct(@PathVariable String codigo_pro, Model model)
    {
        Product currentProduct = productService.findProductByCod(codigo_pro);

        model.addAttribute("product", currentProduct);

        return "product-edit";
    }

    @PostMapping("/products/update/{codigo_pro}")
    public String toUpdateProduct(@PathVariable String codigo_pro, Product product)
    {
        productService.updateProduct(product);

        return "redirect:/products";
    }

    @GetMapping("/products/delete/{codigo_pro}")
    public String toDeleteProduct(@PathVariable String codigo_pro)
    {
        Product currentProduct = productService.findProductByCod(codigo_pro);

        if(currentProduct != null)
        {
            productService.deleteProduct(currentProduct);
        }

        return "redirect:/products";
    }

*/

}
