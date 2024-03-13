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
import al.infnet.edu.br.diegooliveiradacruzprojeto.service.EnderecoService;
import al.infnet.edu.br.diegooliveiradacruzprojeto.service.FilialService;
import al.infnet.edu.br.diegooliveiradacruzprojeto.service.LocalidadeSevice;

@Component 
public class FilialLoader implements ApplicationRunner{
	
	@Autowired
	private FilialService filialService;
	
	@Autowired
	private LocalidadeSevice localidadeSevice;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
	    Endereco endFilial01 = localidadeSevice.obterPorCep("01153000");
	    Endereco endFilial02 = localidadeSevice.obterPorCep("16303290");
	    Endereco endFuncTest = localidadeSevice.obterPorCep("16305516");



	    Filial filial01 = new Filial(01,"São Paulo","00.000.000/0001-01", endFilial01);
	    Filial filial02 = new Filial(02, "Penápolis","00.000.000/0002-02", endFilial02);

	 // filial 01
	    List<Funcionario> funcionariosFilial01 = new ArrayList<>();
	    funcionariosFilial01.add(new Funcionario(1, "Alice", 12000, true, endFuncTest, filial01));
	    funcionariosFilial01.add(new Funcionario(2, "Bob", 11000, true, endFuncTest, filial01));
	    funcionariosFilial01.add(new Funcionario(3, "Carol", 10500, true, endFuncTest, filial01));
	    funcionariosFilial01.add(new Funcionario(4, "David", 12500, true, endFuncTest, filial01));
	    funcionariosFilial01.add(new Funcionario(5, "Eva", 11500, true, endFuncTest, filial01));

	    // filial 02
	    List<Funcionario> funcionariosFilial02 = new ArrayList<>();
	    funcionariosFilial02.add(new Funcionario(6, "Frank", 13000, true, endFuncTest, filial02));
	    funcionariosFilial02.add(new Funcionario(7, "Gina", 12500, true, endFuncTest, filial02));
	    funcionariosFilial02.add(new Funcionario(8, "Hector", 12200, true, endFuncTest, filial02));
	    funcionariosFilial02.add(new Funcionario(9, "Iris", 13500, true, endFuncTest, filial02));
	    funcionariosFilial02.add(new Funcionario(10, "Jack", 12800, true, endFuncTest, filial02));

	    filialService.incluir(filial01);
	    filialService.incluir(filial02);
	    
	    System.out.println(filialService.obterLista());
	    
//	    System.out.println(filialService.obter("Penápolis"));

	}

	
}


