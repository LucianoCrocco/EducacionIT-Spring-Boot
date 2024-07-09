package educacionit.comercio.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "INVOICE")
public class Invoice {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;
   
   public static List<Invoice> detailsDB = new ArrayList<>();
   private List<Product> details;
}
