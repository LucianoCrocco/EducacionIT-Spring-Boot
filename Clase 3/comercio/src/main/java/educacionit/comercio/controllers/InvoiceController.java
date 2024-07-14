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
}
