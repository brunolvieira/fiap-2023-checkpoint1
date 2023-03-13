package br.com.fiap.checkpoint1.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.checkpoint1.Service.EmpregadoService;
import br.com.fiap.checkpoint1.Model.EmpregadoModel;
import br.com.fiap.checkpoint1.dto.EmpregadoDTO;

@RestController
@RequestMapping("/empregados")
public class EmpregadoController {
    
    @Autowired
    private EmpregadoService service;

    @PostMapping("")
    public EmpregadoModel saveEmpregado(@RequestBody EmpregadoDTO empregadoDto) {

        EmpregadoModel empregadoModel = dtoToEmpregadoModel(empregadoDto);

        return service.saveEmpregado(empregadoModel);
    }

    @PutMapping
    public EmpregadoModel updateEmpregado(@RequestBody EmpregadoModel empregadoModel) {
        return service.saveEmpregado(empregadoModel);
    }

    @GetMapping
    public List<EmpregadoModel> getAllEmpregados() {
        return service.getAllEmpregados();
    }

    public EmpregadoModel dtoToEmpregadoModel(EmpregadoDTO empregadoDto) {

        EmpregadoModel empregadoModel = new EmpregadoModel();

        empregadoModel.setNome(empregadoDto.getNome());
        empregadoModel.setEndereco(empregadoDto.getEndereco());

        return empregadoModel;
    }
}
