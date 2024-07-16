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

   @GetMapping("/getAll")
   public String getAllInvoiceModel(Model model){
      model.addAttribute("message", "Página de Inicio");
      //* El retorno tiene que ser el nombre del HTML que este en la carpeta resources/templates */
      return "index";
   }

   @GetMapping("/all") //indica el verbo http con el que realiza la request y tambien le pasamos aprte de la ruta
   public String getAllInvoice(Model model){ //Se puede usar un Map<String, Object> en lugar de model tambien
       List<Invoice> invoices = invoiceService.invoices();
       model.addAttribute("invoices", invoices);
       return "invoiceList"; // el retorno debe ser el nombre de un archivo html que se encuentre dentro de la carpeta resources/templates
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
