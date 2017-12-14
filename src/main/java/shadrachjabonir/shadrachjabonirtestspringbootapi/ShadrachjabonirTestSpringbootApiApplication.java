package shadrachjabonir.shadrachjabonirtestspringbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ShadrachjabonirTestSpringbootApiApplication {

	@RequestMapping("/")
	public String greeting() {
		return "Hello From Shadrach Jabonir";
	}

	public static void main(String[] args) {
		SpringApplication.run(ShadrachjabonirTestSpringbootApiApplication.class, args);
	}
}
