package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_det_compra")
public class DetalleCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigoProducto;
    private Integer item;
    private String name;
    private String description;
    private Double precioCompra;
    private Integer quantity;
    private Double total;
    @JoinColumn(name = "codProducto")
    @ManyToOne
    private Product product;
    @ManyToOne
    private Compra compra;


}
