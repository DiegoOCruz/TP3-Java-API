package al.infnet.edu.br.diegooliveiradacruzprojeto;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;	
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Endereco;
import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Filial;
import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Funcionario;
import al.infnet.edu.br.diegooliveiradacruzprojeto.service.FuncionarioService;
import al.infnet.edu.br.diegooliveiradacruzprojeto.service.LocalidadeSevice;

@Component 
public class FuncionarioLoader implements ApplicationRunner{
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@Autowired
	private LocalidadeSevice localidadeSevice;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	    Endereco endFilial01 = localidadeSevice.obterPorCep("01153000");
	    Endereco endFilial02 = localidadeSevice.obterPorCep("16303290");
	    Endereco endFuncTest = localidadeSevice.obterPorCep("16305516");



	    Filial filial01 = new Filial(01,"São Paulo","00.000.000/0001-01", endFilial01);
	    Filial filial02 = new Filial(02, "Penápolis","00.000.000/0002-02", endFilial02);


	    Funcionario f1 = new Funcionario(1, "Alice", 12000, true, endFuncTest, filial01);
	    Funcionario f2 = new Funcionario(2, "Bob", 11000, true, endFuncTest, filial01);
	    Funcionario f3 = new Funcionario(3, "Carol", 10500, true, endFuncTest, filial01);
	    Funcionario f4 = new Funcionario(4, "David", 12500, true, endFuncTest, filial01);
	    Funcionario f5 = new Funcionario(5, "Eva", 11500, true, endFuncTest, filial01);


	    Funcionario f6 = new Funcionario(6, "Frank", 13000, true, endFuncTest, filial02);
	    Funcionario f7 = new Funcionario(7, "Gina", 12500, true, endFuncTest, filial02);
	    Funcionario f8 = new Funcionario(8, "Hector", 12200, true, endFuncTest, filial02);
	    Funcionario f9 = new Funcionario(9, "Iris", 13500, true, endFuncTest, filial02);
	    Funcionario f10 = new Funcionario(10, "Jack", 12800, true, endFuncTest, filial02);
	    
	    funcionarioService.incluir(f1);
	    funcionarioService.incluir(f2);
	    funcionarioService.incluir(f3);
	    funcionarioService.incluir(f4);
	    funcionarioService.incluir(f5);
	    funcionarioService.incluir(f6);
	    funcionarioService.incluir(f7);
	    funcionarioService.incluir(f8);
	    funcionarioService.incluir(f9);
	    funcionarioService.incluir(f10);
		
		
	    System.out.println(funcionarioService.obterFuncionariosPorFilial(2));
		
	}
	
}


