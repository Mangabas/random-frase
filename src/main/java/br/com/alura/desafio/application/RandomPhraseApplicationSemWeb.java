//package br.com.alura.desafio.application;
//
//import br.com.alura.desafio.application.principal.Principal;
//import br.com.alura.desafio.application.repository.FraseRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//
//@SpringBootApplication
//public class RandomPhraseApplicationSemWeb implements CommandLineRunner {
//
//	@Autowired
//	FraseRepository fraseRepository;
//
//	public static void main(String[] args) {
//		SpringApplication.run(RandomPhraseApplicationSemWeb.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		Principal principal = new Principal(fraseRepository);
//		principal.exibeMenu();
//	}
//}
