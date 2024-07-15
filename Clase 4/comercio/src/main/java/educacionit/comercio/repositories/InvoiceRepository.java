package educacionit.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import educacionit.comercio.entities.Invoice;

@Repository
// El generico de JpaRepository es <ENTIDAD, TIPO_CLAVE_PRIMARIA)
public interface InvoiceRepository extends JpaRepository<Invoice, Long>{
   
}
