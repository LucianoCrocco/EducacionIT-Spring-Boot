package educacionit.comercio.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import educacionit.comercio.entities.Invoice;
import educacionit.comercio.services.InvoiceService;

@Service("implementacion")
public class InvoiceServiceImpl implements InvoiceService {

   @Override
   public List<Invoice> invoices() {
      return null;
   }
   
}
