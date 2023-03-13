package br.com.fiap.checkpoint1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.checkpoint1.Model.EmpregadoModel;

@Repository
public interface EmpregadoRepository extends JpaRepository<EmpregadoModel, Long> {
    
}
