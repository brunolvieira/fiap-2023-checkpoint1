package br.com.fiap.checkpoint1.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.checkpoint1.Service.EmpregadoService;
import br.com.fiap.checkpoint1.Model.EmpregadoModel;
import br.com.fiap.checkpoint1.dto.AtualizarEmpregadoDTO;
import br.com.fiap.checkpoint1.dto.EmpregadoDTO;

@RestController
@RequestMapping("/empregados")
public class EmpregadoController {
    
    @Autowired
    private EmpregadoService service;

    @PostMapping
    public EmpregadoDTO saveEmpregado(@RequestBody AtualizarEmpregadoDTO empregadoDto) {

        EmpregadoModel empregadoModel = new EmpregadoModel();

        empregadoModel.setNome(empregadoDto.getNome());
        empregadoModel.setEndereco(empregadoDto.getEndereco());

        return service.saveEmpregado(empregadoModel);
    }

    @GetMapping
    public List<EmpregadoDTO> getAllEmpregados() {
        return service.getAllEmpregados();
    }

    @PutMapping("/{codigoEmpregado}")
    public EmpregadoDTO updateEmpregado(@RequestBody AtualizarEmpregadoDTO empregadoDto, @PathVariable Long codigoEmpregado) {

        EmpregadoModel empregadoModel = new EmpregadoModel();

        empregadoModel.setCodigoEmpregado(codigoEmpregado);
        empregadoModel.setNome(empregadoDto.getNome());
        empregadoModel.setEndereco(empregadoDto.getEndereco());
        
        return service.updateEmpregado(empregadoModel);
    }
}
