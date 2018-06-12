package trs.front.end.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("trs.front.end")
@SpringBootApplication
public class StarterApplication {

	
	public static void main(String[] args) {
		
	
		SpringApplication.run(StarterApplication.class, args);
		
	}
}
