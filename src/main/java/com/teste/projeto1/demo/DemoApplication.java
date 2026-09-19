package com.teste.projeto1.demo;

import Model.EpisodioDTO;
import Model.SerieDTO;
import service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.ConverteDados;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var busca = new ConsumoApi();
        var json = busca.obterDados("http://www.omdbapi.com/?t=breaking+bad&apikey=d041973d");
        System.out.println(json);

        System.out.println("==========================================");

        var converter = new ConverteDados();
        var dados = converter.converteDados(json, SerieDTO.class);
        System.out.println(dados);

        System.out.println("=================DADOS EPISODIO=========================");

        var jsonEpisode = busca.obterDados("http://www.omdbapi.com/?t=breaking+bad&season=1&episode=1&apikey=d041973d");
        var dadosEpisodio = converter.converteDados(jsonEpisode, EpisodioDTO.class);
        System.out.println(dadosEpisodio);

    }
}
