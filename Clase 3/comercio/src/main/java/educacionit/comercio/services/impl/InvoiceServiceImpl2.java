package educacionit.comercio.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import educacionit.comercio.entities.Invoice;
import educacionit.comercio.repositories.InvoiceRepository;
import educacionit.comercio.services.InvoiceService;

@Service("implementacionMejorada")
public class InvoiceServiceImpl2 implements InvoiceService {

   //* Le indico que es una bean */
   @Autowired
   public InvoiceRepository repository;

   @Override
   public List<Invoice> invoices() {
      return repository.findAll();
   }

   @Override
   public void deleteById(Long Id){
      repository.deleteById(Id);
   }

   @Override
   public Invoice findById(Long Id){
      return repository.findById(Id).orElse(null);
   }
}
