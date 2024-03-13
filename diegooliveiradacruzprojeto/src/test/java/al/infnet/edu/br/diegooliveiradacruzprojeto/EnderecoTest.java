package al.infnet.edu.br.diegooliveiradacruzprojeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Endereco;


@SpringBootTest
class EnderecoTest {
	
	private Endereco endTest;

    

	
	@BeforeEach
	void setUp() {
		endTest = new Endereco();
		endTest.setCep("16303290");
		endTest.setLogradouro("Rua 01");
		endTest.setLocalidade("Penapolis");
		endTest.setUf("SP");
	}
	
	@Test
	void testRetornos() {
		endTest.getCep();
		endTest.getLogradouro();
		endTest.getBairro();
		endTest.getLocalidade();
		endTest.getUf();
		
	}

}
