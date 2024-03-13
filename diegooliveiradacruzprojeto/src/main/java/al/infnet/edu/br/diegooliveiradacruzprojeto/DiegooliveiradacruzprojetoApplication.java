package al.infnet.edu.br.diegooliveiradacruzprojeto;

import org.springframework.boot.SpringApplication;	
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DiegooliveiradacruzprojetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiegooliveiradacruzprojetoApplication.class, args);
	}

}
