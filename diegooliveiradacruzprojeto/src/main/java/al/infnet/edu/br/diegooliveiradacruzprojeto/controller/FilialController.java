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

@RestController
@RequestMapping(value ="/api/filial")
public class FilialController {

	@Autowired
	private FilialService filialService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Filial filial) {
		filialService.incluir(filial);
		System.out.println("Filial " + filial.getNome() + " incluída com sucesso!");
		System.out.println("teste");
	}
	
	@DeleteMapping(value = "/{nome}/excluir")
	public void excluir(@PathVariable String nome) {
		filialService.excluir(nome);
		System.out.println("Filial " + nome + " excluída com sucesso!");
	}
	
	@GetMapping(value = "/listar")
	public Collection<Filial> obterLista(){
		return filialService.obterLista();
	}
	
	@GetMapping(value = "/{nome}/listar")
	public Filial obter(@PathVariable String nome){
		return filialService.obter(nome);
	}


}
