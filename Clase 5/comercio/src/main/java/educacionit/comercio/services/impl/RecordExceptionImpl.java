package educacionit.comercio.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import educacionit.comercio.entities.RecordException;
import educacionit.comercio.repositories.RecordExceptionRepository;
import educacionit.comercio.services.RecordExceptionService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class RecordExceptionImpl implements RecordExceptionService{
    @Autowired
    private RecordExceptionRepository repository;

    @Override
    public RecordException save(RecordException exception) {
        return repository.save(exception);
    }
}
