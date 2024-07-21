package educacionit.comercio.services.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import educacionit.comercio.entities.Product;
import educacionit.comercio.repositories.ProductRepository;
import educacionit.comercio.services.ProductService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository repository;


    @Override
    public List<Product> findAllProducts() {
        throw  new RuntimeException("Error al buscar los productos - Prueba", new Exception());
        //return repository.findAll();
    }

    @Override
    public List<Product> productFilterd(Long categoryId ) {
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("El metdo findById se ejecuto : " + date);
        List<Product> products = new ArrayList<>();
        try{
                products = findAllProducts();
        }catch (RuntimeException e){
            //e.printStackTrace();
        }
        List<Product> productsFiltered = new ArrayList<>();
        if(categoryId != null && categoryId > 0){
            products.forEach(item -> {
                if(item.getCategory().getId().equals(categoryId)){
                    productsFiltered.add(item);
                }
            });
        }else{
            productsFiltered.addAll(products);
        }
        return productsFiltered;
    }
}
