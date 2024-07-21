package educacionit.comercio.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import educacionit.comercio.entities.RecordInteraction;

@Repository
public interface InteractionRepository extends JpaRepository<RecordInteraction, Long> {
   
}
