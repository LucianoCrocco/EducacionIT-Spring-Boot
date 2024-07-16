package educacionit.comercio.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import educacionit.comercio.entities.Product;
import educacionit.comercio.repositories.ProductRepository;
import educacionit.comercio.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository repository;


    @Override
    public List<Product> findAllProducts() {
        return repository.findAll();
    }
}
