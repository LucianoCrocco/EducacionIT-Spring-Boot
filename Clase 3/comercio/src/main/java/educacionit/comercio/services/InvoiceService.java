package educacionit.comercio.services;

import java.util.List;

import educacionit.comercio.entities.Invoice;

public interface InvoiceService {
   List<Invoice> invoices();
   void deleteById(Long Id);
   Invoice findById(Long Id);
}
