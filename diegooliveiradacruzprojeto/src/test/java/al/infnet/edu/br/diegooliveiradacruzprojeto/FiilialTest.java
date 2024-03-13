package al.infnet.edu.br.diegooliveiradacruzprojeto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Endereco;
import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Filial;
import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Funcionario;

@SpringBootTest
class FiilialTest {
	
	private Filial filialTest;
	Endereco endFuncTest = new Endereco("16303290", "Rua 02", "Sao Paulo", "Penapolis", "SP");
	Endereco endFilialTest = new Endereco("16303290", "Rua 02", "Sao Paulo", "Penapolis", "SP");
	Funcionario funcTest = new Funcionario(001, "Diego", 10000, true, endFuncTest, filialTest);
    List<Funcionario> funcionariosFilialTest = new ArrayList<>(); 
    

	
	@BeforeEach
	void setUp() {
		filialTest = new Filial();
		filialTest.setNome("Penapolis");
		filialTest.setCnpj("00.000.000.0001.00");
		filialTest.setEndereco(endFilialTest);
		funcionariosFilialTest.add(funcTest);
		filialTest.setFuncionarios(funcionariosFilialTest);
		
	}
	
	@Test
	void recuperarNome() {
		filialTest.getNome();
		assertEquals("Penapolis", filialTest.getNome());
	}
	
	@Test
	void recuperarCnpj() {
		filialTest.getCnpj();
		assertEquals("00.000.000.0001.00", filialTest.getCnpj());
	}
	
	@Test
	void recuperarListaFuncionarios() {
		filialTest.getFuncionarios();
		assertEquals(funcionariosFilialTest, filialTest.getFuncionarios());
	}

}
