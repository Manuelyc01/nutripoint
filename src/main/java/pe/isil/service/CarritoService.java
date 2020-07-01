package pe.isil.service;

import org.springframework.stereotype.Service;
import pe.isil.model.Carrito;
import pe.isil.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarritoService {
    List<Carrito> carritoList=new ArrayList<>();
    int item;
    int cantidad=1;
    public void addProduct(Product product) {
        item=item+1;
        Carrito car=new Carrito();
        car.setItem(item);
        car.setId_producto(product.getId_pro());
        car.setProducto(product.getName_pro());
        car.setDes_producto(product.getDescription_pro());
        car.setPrecio(product.getPrice_pro());
        car.setCantidad(cantidad);
        car.setSubTotal(cantidad*product.getPrice_pro());
        carritoList.add(car);
    }

    public List<Carrito> getList() {
    return carritoList;
    }
    public int list(){
        return carritoList.size();
    }
}
