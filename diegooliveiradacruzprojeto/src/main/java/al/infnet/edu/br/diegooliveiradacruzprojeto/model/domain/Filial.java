package al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain;

import java.util.List;

public class Filial {
	
	private int id;
	private String nome;
	private String cnpj;
	private List<Funcionario> funcionarios;
	private Endereco endereco;
	
	public Filial() {

	}
	
	public Filial(int id, String nome, String cnpj, Endereco endereco) {
		this();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		
	}
	
	public Filial(int id,String nome, String cnpj, List<Funcionario> funcionarios, Endereco endereco) {
		this(id, nome, cnpj, endereco);
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = funcionarios;
		this.endereco = endereco;
	}
	
	
	@Override
	public String toString() {
		return "Filial [nome=" + nome + ", CNPJ=" + cnpj + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
