package al.infnet.edu.br.diegooliveiradacruzprojeto.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Filial;
import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Funcionario;
import al.infnet.edu.br.diegooliveiradacruzprojeto.service.FilialService;
import al.infnet.edu.br.diegooliveiradacruzprojeto.service.FuncionarioService;

@RestController
@RequestMapping(value ="/api/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioservice;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Funcionario funcionario) {
		funcionarioservice.incluir(funcionario);
		System.out.println("Funcionário " + funcionario.getNome() + " incluído com sucesso!");
	}
	
	@DeleteMapping(value = "/{nome}/excluir")
	public void excluir(@PathVariable String nome) {
		funcionarioservice.excluir(nome);
		System.out.println("Funcionário " + nome + " excluído com sucesso!");
	}
	
	@GetMapping(value = "/listar")
	public Collection<Funcionario> obterLista(){
		return funcionarioservice.obterLista();
	}
	
	@GetMapping(value = "/{nome}/listar")
	public Funcionario obter(@PathVariable String nome){
		return funcionarioservice.obter(nome);
	}
	
	//----
	@GetMapping(value = "/filial/{id}/listar")
	public Collection<Funcionario> obterFuncionariosPorFilial(@PathVariable int id) {
	    return funcionarioservice.obterFuncionariosPorFilial(id);
	}
	
	
	@DeleteMapping(value = "/filial/{idFilial}/{nomeFuncionario}/excluir")
	public void excluirFuncionarioPorFilial(@PathVariable int idFilial, @PathVariable String nomeFuncionario) {
		funcionarioservice.excluirFuncionarioPorFilial(idFilial, nomeFuncionario);
		System.out.println("Funcionário "+ nomeFuncionario + " excluído com sucesso.");
	}
	
	@PostMapping(value = "/filial/{nomeFilial}/incluir")
	public void incluirFuncionarioPorFilial(@PathVariable String nomeFilial, @RequestBody Funcionario funcionario) {
		funcionarioservice.incluirFuncionarioPorFilial(nomeFilial, funcionario);
	}

}
