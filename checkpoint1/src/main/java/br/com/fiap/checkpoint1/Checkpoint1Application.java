package br.com.fiap.checkpoint1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Checkpoint1Application implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(Checkpoint1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Checkpoint1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Starting Application");
	}
}
