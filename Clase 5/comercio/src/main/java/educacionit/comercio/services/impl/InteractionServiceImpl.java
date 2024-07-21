package educacionit.comercio.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import educacionit.comercio.entities.RecordInteraction;
import educacionit.comercio.repositories.InteractionRepository;
import educacionit.comercio.services.InteractionService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class InteractionServiceImpl implements InteractionService{
    @Autowired
    private InteractionRepository repository;

    @Override
    public RecordInteraction save(RecordInteraction interaction) {
        return repository.save(interaction);
    }
}
