package br.com.rodrigo.restserverclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestServerClockApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServerClockApplication.class, args);
	}

}
