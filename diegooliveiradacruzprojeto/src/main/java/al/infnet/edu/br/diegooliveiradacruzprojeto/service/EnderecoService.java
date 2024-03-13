package al.infnet.edu.br.diegooliveiradacruzprojeto.service;

import java.util.Collection;	
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Endereco;


@Service
public class EnderecoService {	
	private static Map<String, Endereco> enderecos = new HashMap<String, Endereco>(); 
	
	public void incluir(Endereco endereco) {
		enderecos.put(endereco.getCep(), endereco);
	}
	
	public void excluir(String cep) {
		enderecos.remove(cep);
	}
	
	public Collection<Endereco> obterLista(){
		return enderecos.values();
	}
	
	public Endereco obter(String cep){
		return enderecos.get(cep);
	}
}
