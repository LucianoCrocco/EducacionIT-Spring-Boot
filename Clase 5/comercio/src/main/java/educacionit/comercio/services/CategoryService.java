package educacionit.comercio.services;

import educacionit.comercio.entities.Category;

import java.util.List;

public interface CategoryService {
     List<Category> findAllCategories();

     Category findById(Long id);
}