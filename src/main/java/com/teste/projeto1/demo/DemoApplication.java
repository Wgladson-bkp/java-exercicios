package com.teste.projeto1.demo;

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
    }
}
