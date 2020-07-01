package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_compra")
public class Compra {
    @Id
    private Long codigoCompra;
    private Long codigoCliente;
    private LocalDate fecha;







}
