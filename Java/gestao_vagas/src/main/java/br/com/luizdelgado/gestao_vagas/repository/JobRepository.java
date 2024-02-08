package br.com.luizdelgado.gestao_vagas.repository;

import br.com.luizdelgado.gestao_vagas.Entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {

}
