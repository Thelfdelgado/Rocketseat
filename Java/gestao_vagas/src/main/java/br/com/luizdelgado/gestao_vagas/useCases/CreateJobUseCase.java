package br.com.luizdelgado.gestao_vagas.useCases;

import br.com.luizdelgado.gestao_vagas.Entity.JobEntity;
import br.com.luizdelgado.gestao_vagas.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity){
        return this.jobRepository.save(jobEntity);
    }

}
