package br.com.fiap.checkpoint1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.checkpoint1.Model.EmpregadoModel;

public interface EmpregadoRepository extends JpaRepository<EmpregadoModel, Long> {
    
}
