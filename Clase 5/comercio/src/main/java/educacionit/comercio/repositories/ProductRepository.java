package educacionit.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import educacionit.comercio.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>  {
   
}
