package al.infnet.edu.br.diegooliveiradacruzprojeto.service;

import org.springframework.beans.factory.annotation.Autowired;	
import org.springframework.stereotype.Service;

import al.infnet.edu.br.diegooliveiradacruzprojeto.client.IEnderecoClient;
import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Endereco;

@Service
public class LocalidadeSevice {

	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterPorCep(cep);
	}
}


