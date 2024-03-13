package al.infnet.edu.br.diegooliveiradacruzprojeto;


import org.springframework.beans.factory.annotation.Autowired;	
import org.springframework.boot.ApplicationArguments;		
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import al.infnet.edu.br.diegooliveiradacruzprojeto.client.IEnderecoClient;
import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Endereco;
import al.infnet.edu.br.diegooliveiradacruzprojeto.service.EnderecoService;


@Component 
public class EnderecoLoader implements ApplicationRunner{
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	@Autowired
	private EnderecoService enderecoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		

		Endereco endTest = new Endereco();
		endTest.setCep("16303290");
		endTest.setLogradouro("Rua 01");
		endTest.setBairro("Vila Formosa");
		endTest.setLocalidade("Penapolis");
		endTest.setUf("SP");
		
		Endereco endTest2 = new Endereco("16305516", "Rua 02", "Jd. do Lago", "Penápolis", "SP");
		
//		System.out.println(endTest);
//		System.out.println(endTest2);
		
		Endereco teste = enderecoClient.obterPorCep("20010020");
		
		enderecoService.incluir(teste);
		System.out.println(enderecoService.obterLista());
	}
	
}


