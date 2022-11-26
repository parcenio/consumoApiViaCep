package br.com.arcenio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class DesignpatternsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternsSpringApplication.class, args);
	}

}
