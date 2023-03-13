package br.com.fiap.checkpoint1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empregados")
public class EmpregadoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEmpregado;

    @Column(name = "nome")
    private String nome;

    @Column(name = "endereco")
    private String endereco;

    public Long getCodigoEmpregado() {
        return codigoEmpregado;
    }

    public void setCodigoEmpregado(Long codigoEmpregado) {
        this.codigoEmpregado = codigoEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
