package co.simplon.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("co.simplon.springboot.web")
public class SpringbootTp3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTp3Application.class, args);
	}
}
