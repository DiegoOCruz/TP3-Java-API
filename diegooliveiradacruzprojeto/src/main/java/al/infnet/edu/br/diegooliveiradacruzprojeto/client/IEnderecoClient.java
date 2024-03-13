package al.infnet.edu.br.diegooliveiradacruzprojeto.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import al.infnet.edu.br.diegooliveiradacruzprojeto.model.domain.Endereco;


@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")

public interface IEnderecoClient {

	@GetMapping(value = "/{cep}/json/")
	Endereco obterPorCep(@PathVariable String cep);
}
