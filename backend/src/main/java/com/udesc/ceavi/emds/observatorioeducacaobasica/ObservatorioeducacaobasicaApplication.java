package com.udesc.ceavi.emds.observatorioeducacaobasica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.mongo.config.annotation.web.reactive.EnableMongoWebSession;

@SpringBootApplication
@EnableMongoWebSession
public class ObservatorioeducacaobasicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObservatorioeducacaobasicaApplication.class, args);
	}
}
