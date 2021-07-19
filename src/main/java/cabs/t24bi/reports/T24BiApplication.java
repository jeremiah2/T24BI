package cabs.t24bi.reports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class T24BiApplication {

	public static void main(String[] args) {
		SpringApplication.run(T24BiApplication.class, args);
	}

}
