package educacionit.comercio.controllers;

import org.springframework.web.bind.annotation.RestController;

import educacionit.comercio.entities.Invoice;
import educacionit.comercio.services.InvoiceService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

   @Autowired
   @Qualifier("implementacionMejorada")
   private InvoiceService invoiceService;
   
   //* Metodo antes de tener el JPA de Hibernate */
   // @GetMapping("/getAll")
   // public String getAll(){
   //    return invoiceService.invoices().toString();
   // }

   //* Metodo si queremos un REST en vez de una vista - Tiene que ser RestController el tipo de Bean*/
   // @GetMapping("/getAll")
   // public List<Invoice> getAll(){
   //    return invoiceService.invoices();
   // }

   @GetMapping("/getAll")
   public String getAllInvoiceModel(Model model){
      model.addAttribute("message", "Página de Inicio");
      //* El retorno tiene que ser el nombre del HTML que este en la carpeta resources/templates */
      return "index";
      // return invoiceService.invoices();
   }

   @GetMapping("/getOne")
   public String findById(Model model, Long id){
      invoiceService.findById(id);
      return "index";
   }

   @DeleteMapping("/deleteOne")
   public String deleteById(Model model, Long id){
      invoiceService.deleteById(id);
      return "index";
   }
}
