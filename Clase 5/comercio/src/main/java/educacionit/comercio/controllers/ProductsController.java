package educacionit.comercio.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import educacionit.comercio.entities.Category;
import educacionit.comercio.entities.Product;
import educacionit.comercio.services.CategoryService;
import educacionit.comercio.services.ProductService;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/productos")
public class ProductsController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @GetMapping
    public String getProducts(@RequestParam(value = "categoryId", required = false) Long categoryId, Model model) {
        List<Category> categories = categoryService.findAllCategories();
        List<Product> products = productService.productFilterd(categoryId);
        model.addAttribute("categories", categories);
        model.addAttribute("products", products);
        model.addAttribute("selectedCategoryId", categoryId);
        return "productos";
    }
}
