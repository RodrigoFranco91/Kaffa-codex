package br.com.rodrigo.restclientclock;

import br.com.rodrigo.restclientclock.client.WorldClockClient;
import br.com.rodrigo.restclientclock.dto.WorldClockDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestClientClockApplication implements CommandLineRunner {

	private WorldClockClient client;

	public RestClientClockApplication(WorldClockClient client) {
		this.client = client;
	}

	public static void main(String[] args) {
		SpringApplication.run(RestClientClockApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		WorldClockDTO response = client.consultaHorario();
		System.out.println();
		System.out.println();
		System.out.println("A response ao consultar o Serviço de http://worldclockapi.com/api/json/utc/now é: ");
		System.out.println();
		System.out.println(response);
	}
}
