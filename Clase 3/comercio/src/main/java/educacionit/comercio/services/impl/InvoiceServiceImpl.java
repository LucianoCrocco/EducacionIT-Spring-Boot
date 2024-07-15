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

   @Override
   public void deleteById(Long Id) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
   }

   @Override
   public Invoice findById(Long Id) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'findById'");
   }
   
}
