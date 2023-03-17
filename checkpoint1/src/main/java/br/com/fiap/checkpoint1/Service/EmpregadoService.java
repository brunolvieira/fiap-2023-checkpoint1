package br.com.fiap.checkpoint1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.Repository.EmpregadoRepository;
import br.com.fiap.checkpoint1.dto.EmpregadoDTO;
import br.com.fiap.checkpoint1.Model.EmpregadoModel;

@Service
public class EmpregadoService {
    
    @Autowired
    private EmpregadoRepository repository;

    public EmpregadoDTO saveEmpregado(EmpregadoModel empregadoModel) {        
        return modelToEmpregadoDTO(repository.save(empregadoModel));
    }

    public List<EmpregadoDTO> getAllEmpregados() {

        List<EmpregadoModel> listEmpregados = repository.findAll();
        List<EmpregadoDTO> empregadosDto = new ArrayList<>();

        for(EmpregadoModel model : listEmpregados) {
            EmpregadoDTO dto = new EmpregadoDTO();

            dto.setCodigoEmpregado(model.getCodigoEmpregado());
            dto.setNome(model.getNome());
            dto.setEndereco(model.getEndereco());

            empregadosDto.add(dto);
        }

        return empregadosDto;
    }

    public EmpregadoDTO updateEmpregado(EmpregadoModel empregadoModel) {

        if(!repository.existsById(empregadoModel.getCodigoEmpregado())) {
            throw new RuntimeException("Código de Empregado" + empregadoModel.getCodigoEmpregado() + "não encontrado");	
        }

        return modelToEmpregadoDTO(repository.save(empregadoModel));
    }

    public EmpregadoDTO modelToEmpregadoDTO(EmpregadoModel empregadoModel) {
        EmpregadoDTO empregadoDto = new EmpregadoDTO();

        empregadoDto.setCodigoEmpregado(empregadoModel.getCodigoEmpregado());
        empregadoDto.setNome(empregadoModel.getNome());
        empregadoDto.setEndereco(empregadoModel.getEndereco());

        return empregadoDto;
    }
}
