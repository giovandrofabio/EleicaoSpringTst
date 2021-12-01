package br.edu.unoesc.java.eleicao.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.edu.unoesc.java.eleicao.model.Eleitor;
import br.edu.unoesc.java.eleicao.model.Partido;
import br.edu.unoesc.java.eleicao.repository.EleitorRepository;
import br.edu.unoesc.java.eleicao.repository.PartidoRepository;

/**
 * Executa a aplica��o da Elei��o
 * 
 * @author Roberson Alves
 *
 */
@SpringBootApplication
//@ComponentScan(basePackages = "br.edu.unoesc.java.eleicao")
@EnableJpaRepositories(basePackages = {"br.edu.unoesc.java.eleicao.repository"})
@EntityScan(basePackages = {"br.edu.unoesc.java.eleicao.model"})
public class EleicaoApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApp.class, args);
	}
	
	@Autowired
	private PartidoRepository partidoRepository;
	private EleitorRepository eleitorRepository;

	@Override
	public void run(String... args) throws Exception {
		/// aqui podemos programar normalmente o restante
		Partido p = new Partido();
		p.setNome("Partido Spring Data");
		p.setSigla("PSD");

		partidoRepository.save(p);
		
		Eleitor e = new Eleitor();
		e.setNome("Giovandro");
		e.setNumeroTitulo(123456789);
		e.setNomeMae("Edenir Brito Cabral dos Santos");
		e.setSecao(null);
		e.setZonaEleitoral(null);
		eleitorRepository.save(e);
		
		
	}

}
