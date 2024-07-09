package educacionit.comercio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "INVOICE_DETAILS")
public class InvoiceDetail{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;

   @ManyToOne
   @JoinColumn(name = "product_id")
   private Product product;
   
   //* Toma como valor por defecto el nombre y lo hace mayusculas
   @Column
   private Integer quantity;

   public Double getDetailTotal(){
      return product.getPrice() * quantity;
   }
}
