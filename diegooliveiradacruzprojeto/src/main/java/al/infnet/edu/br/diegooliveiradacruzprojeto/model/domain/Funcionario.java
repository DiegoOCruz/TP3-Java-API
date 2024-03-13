package al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain;


public class Funcionario {
	
	private int registro;
	private String nome;
	private float salario;
	private boolean cursoSuperior;
	private Endereco endereco;
	private float bonus;
	private Filial filial;
	
	public float salarioLiquido() {
		if (cursoSuperior) {
			bonus = (float) (salario * 0.1);
			return salario + bonus;
		}else {
			return salario;
		}
	}
	
	public Funcionario() {
		
	}

	public Funcionario(int registro, String nome) {
		this();
		this.registro = registro;
		this.nome = nome;
	}
	
	public Funcionario(int registro, String nome, float salario, boolean cursoSuperior, Endereco endereco, Filial filial) {
		this(registro, nome);
		this.registro = registro;
		this.nome = nome;
		this.salario = salario;
		this.cursoSuperior = cursoSuperior;
		this.endereco = endereco;
		this.filial = filial;
	}

	

	@Override
	public String toString() {
		return "Funcionario [registro=" + registro + ", nome=" + nome + "]";
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public boolean isCursoSuperior() {
		return cursoSuperior;
	}

	public void setCursoSuperior(boolean cursoSuperior) {
		this.cursoSuperior = cursoSuperior;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	
	
}
