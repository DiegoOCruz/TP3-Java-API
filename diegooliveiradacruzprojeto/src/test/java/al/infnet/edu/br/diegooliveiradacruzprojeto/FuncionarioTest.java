package al.infnet.edu.br.diegooliveiradacruzprojeto;

import static org.junit.jupiter.api.Assertions.assertEquals;	


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Endereco;
import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Filial;
import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Funcionario;

@SpringBootTest
class FuncionarioTest {
	
	private Funcionario funcionarioTest;
	Endereco endFuncTest = new Endereco("16303290", "Rua 02", "Sao Paulo", "Penapolis", "SP");
	//Funcionario funcTest = new Funcionario(001, "Diego", 10000, true, endFuncTest, filialTest);
	Filial filialTest = new Filial();
    

	
	@BeforeEach
	void setUp() {
		funcionarioTest = new Funcionario(001, "Diego");
		
		
	}
	
	@Test
	void salarioLiquido() {
		funcionarioTest.setSalario(1000);
		funcionarioTest.setCursoSuperior(true);
		funcionarioTest.getSalario();
		assertEquals(1100, funcionarioTest.salarioLiquido());

	}
	
	@Test
	void salarioLiquido2() {
		funcionarioTest.setSalario(1000);
		funcionarioTest.setCursoSuperior(false);
		funcionarioTest.getSalario();
		assertEquals(1000, funcionarioTest.salarioLiquido());

	}
	
	@Test
	void registro() {
		funcionarioTest.setRegistro(123);
		assertEquals(123, funcionarioTest.getRegistro());
	}
	
	@Test
	void nome() {
		funcionarioTest.setNome("Liam");
		assertEquals("Liam", funcionarioTest.getNome());
	}
	
	@Test
	void cursoSuperior() {
		funcionarioTest.setCursoSuperior(true);
		assertEquals(true, funcionarioTest.isCursoSuperior());
	}
	
	@Test
	void bonus() {
		funcionarioTest.setBonus(10);
		assertEquals(10, funcionarioTest.getBonus());
	}
	
	@Test
	void endereco() {
		funcionarioTest.setEndereco(endFuncTest);
		assertEquals(endFuncTest, funcionarioTest.getEndereco());
	}
	
	@Test
	void filial() {
		funcionarioTest.setFilial(filialTest);
		assertEquals(filialTest, funcionarioTest.getFilial());
	}
	
}
