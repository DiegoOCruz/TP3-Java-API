package al.infnet.edu.br.diegooliveiradacruzprojeto.service;

import java.util.ArrayList;		
import java.util.Collection;	
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Filial;
import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Funcionario;


@Service
public class FuncionarioService {
	private static Map<String, Funcionario> funcionarios = new HashMap<String, Funcionario>(); 
	
	public void incluir(Funcionario funcionario) {
		funcionarios.put(funcionario.getNome(), funcionario);
	}
	
	public void excluir(String nome) {
		funcionarios.remove(nome);
	}
	
	public Collection<Funcionario> obterLista(){
		return funcionarios.values();
	}
	
	public Funcionario obter(String nome){
		return funcionarios.get(nome);
	}
	
    public Collection<Funcionario> obterFuncionariosPorFilial(int idFilial) {
        HashMap<String, Funcionario> funcionariosPorFilial = new HashMap<String, Funcionario>();
        for (Funcionario funcionario : funcionarios.values()) {
            if (funcionario.getFilial().getId() == idFilial) {
                funcionariosPorFilial.put(funcionario.getNome(), funcionario);
            }
        }
        return funcionariosPorFilial.values();
    }
    
    public void excluirFuncionarioPorFilial(int idFilial, String nome) {
    	Collection<Funcionario> funcionarios = obterFuncionariosPorFilial(idFilial);
    	for (Funcionario funcionario : funcionarios) {
			if(funcionario.getNome().equals(nome)) {
				excluir(nome);
			}
		}
    }
    
    @Autowired
    private FilialService filialService;
    private Filial filial;
    
    public void incluirFuncionarioPorFilial(String nome, Funcionario funcionario){
    	filial =filialService.obter(nome);
    	Funcionario func = funcionario;
    	func.setFilial(filial);
    	incluir(func);
    }
}
