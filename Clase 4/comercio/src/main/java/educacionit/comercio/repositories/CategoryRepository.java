package educacionit.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import educacionit.comercio.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>  {
   
}
