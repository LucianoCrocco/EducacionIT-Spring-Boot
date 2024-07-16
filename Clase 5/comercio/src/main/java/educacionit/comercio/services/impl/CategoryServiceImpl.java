package educacionit.comercio.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import educacionit.comercio.entities.Category;
import educacionit.comercio.repositories.CategoryRepository;
import educacionit.comercio.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
   @Autowired
    private CategoryRepository repository;

    public List<Category> findAllCategories(){
        return repository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
