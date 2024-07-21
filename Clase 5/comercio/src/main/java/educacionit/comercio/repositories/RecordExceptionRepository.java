package educacionit.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import educacionit.comercio.entities.RecordException;

@Repository
public interface RecordExceptionRepository extends JpaRepository<RecordException, Long> {
    
}
