package in.fundemental.funde;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("in.fundemental.funde.entity")
@SpringBootApplication
public class FundeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundeApplication.class, args);
	}

}
