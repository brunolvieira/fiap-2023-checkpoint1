package br.com.fiap.checkpoint1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.Repository.EmpregadoRepository;
import br.com.fiap.checkpoint1.Model.EmpregadoModel;

@Service
public class EmpregadoService {
    
    @Autowired
    private EmpregadoRepository repository;

    public EmpregadoModel saveEmpregado(EmpregadoModel newEmpregado) {
        return repository.save(newEmpregado);
    }

    public List<EmpregadoModel> getAllEmpregados() {

        List<EmpregadoModel> listEmpregados = repository.findAll();

        return listEmpregados;
    }
}
