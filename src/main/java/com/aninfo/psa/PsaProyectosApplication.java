package com.aninfo.psa;

import com.aninfo.psa.excepciones.ErrorNoExisteElProyectoParaAsignar;
import com.aninfo.psa.Services.ProyectoService;
import com.aninfo.psa.modelo.Proyecto;
import com.aninfo.psa.modelo.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@SpringBootApplication
public class PsaProyectosApplication {

	@Autowired
	ProyectoService proyectoService;
	public static void main(String[] args) {
		SpringApplication.run(PsaProyectosApplication.class, args);
	}



//	@Bean
//	public Docket swaggerSpringMvcPlugin(){
//		return new Docket( DocumentationType.SWAGGER_2 )//
//				.select().apis( RequestHandlerSelectors.basePackage( "com.aninfo.psa.controller" ) )//
//				.build();
//	}

}
