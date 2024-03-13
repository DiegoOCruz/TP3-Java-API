package al.infnet.edu.br.diegooliveiradacruzprojeto.service;

import java.util.Collection;	
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Filial;


@Service
public class FilialService {
	private static Map<String, Filial> filiais = new HashMap<String, Filial>(); 
	
	public void incluir(Filial filial) {
		filiais.put(filial.getNome(), filial);
	}
	
	public void excluir(String nome) {
		filiais.remove(nome);
	}
	
	public Collection<Filial> obterLista(){
		return filiais.values();
	}
	
	public Filial obter(String nome){
		return filiais.get(nome);
	}
}
