package br.com.alura.desafio.application.principal;

import br.com.alura.desafio.application.models.Serie;
import br.com.alura.desafio.application.models.SerieRecord;
import br.com.alura.desafio.application.repository.FraseRepository;
import br.com.alura.desafio.application.services.ConsumoApi;
import br.com.alura.desafio.application.services.ConverterJson;

import java.util.Scanner;

public class Principal {
    Scanner leitura = new Scanner(System.in);
    ConsumoApi consumo = new ConsumoApi();
    ConverterJson converte = new ConverterJson();
    String serie = "";
    String frase = "";
    String autorFrase = "";
    int opcao = -1;
    private FraseRepository fraseRepository;

    public Principal(FraseRepository fraseRepository) {
        this.fraseRepository = fraseRepository;
    }


    public void exibeMenu(){
        while (opcao !=  0){
        System.out.println("Digite uma serie");
        serie = leitura.nextLine();
        String json = consumo.obterDados(serie);
        SerieRecord serieOMDB = converte.obterDados(json, SerieRecord.class);
        System.out.println(serieOMDB);
        System.out.println("Digite uma frase");
        frase = leitura.nextLine();
        System.out.println("Quem disse essa frase");
        autorFrase = leitura.nextLine();

        Serie serie = new Serie(serieOMDB, autorFrase, frase);
        fraseRepository.save(serie);
        System.out.println(serie);

        System.out.println("digite 0 se deseja parar");
        opcao = leitura.nextInt();
        leitura.nextLine();

}

    }
}
