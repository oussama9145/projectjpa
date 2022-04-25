package ma.emsi.projetjpa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.emsi.projetjpa.repos.LivreRepo;
import ma.emsi.projetjpa.entities.Livre;


@SpringBootApplication
public class ProjetjpaApplication implements CommandLineRunner {
	
	@Autowired
	private LivreRepo livreRepository; 

	public static void main(String[] args) {
		SpringApplication.run(ProjetjpaApplication.class, args);
	}

	@Override
	public void run(String... args ) throws Exception{
		
		
		livreRepository.save(
				new Livre(null, "Le bourgeois gentilhomme", "Minuit",new Date(), "Molière", 1670,"1-2345-5289-1639",null,false));
		
	}

}
