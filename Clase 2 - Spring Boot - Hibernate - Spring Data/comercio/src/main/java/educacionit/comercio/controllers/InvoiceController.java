package educacionit.comercio.controllers;

import org.springframework.web.bind.annotation.RestController;

import educacionit.comercio.entities.Invoice;
import educacionit.comercio.entities.Product;
import educacionit.comercio.services.InvoiceService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

   @Autowired
   @Qualifier("implementacionMejorada")
   private InvoiceService invoiceService;
   
   @GetMapping("/getAll")
   public String getAll(){
      // llenarFactura();
      return invoiceService.invoices().toString();
   }

   @GetMapping("/getOne")
   public String findById(Long id){
      return "";
   }

   @GetMapping("/deleteOne")
   public String deleteById(Long id){
      return "";
   }

   
   // public void llenarFactura(){
   //    Invoice newInvoice = new Invoice();
   //    Invoice newInvoice2 = new Invoice();
   //    Product newProduct = new Product(1L, "Mouse", 5000.0);
   //    Product newProduct2 = new Product(2L, "Monitor", 22000.0);
   //    Product newProduct3 = new Product(3L, "Teclado", 2500.0);
   //    Product newProduct4 = new Product(1L, "Mouse1", 5000.0);
   //    Product newProduct5 = new Product(2L, "Monitor2", 22000.0);
   //    Product newProduct6 = new Product(3L, "Teclado3", 2500.0);


   //    List<Product> details = new ArrayList<Product>();
   //    details.add(newProduct);
   //    details.add(newProduct2);
   //    details.add(newProduct3);

   //    List<Product> details2 = new ArrayList<Product>();
   //    details.add(newProduct4);
   //    details.add(newProduct5);
   //    details.add(newProduct6);

   //    newInvoice.setDetails(details);
   //    newInvoice2.setDetails(details2);
   //    Invoice.detailsDB.add(newInvoice);
   //    Invoice.detailsDB.add(newInvoice2);
   // }
}
