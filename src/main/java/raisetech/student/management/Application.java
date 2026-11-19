package raisetech.student.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class Application {

	private Map<String, Integer> people = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/people")
	public Map<String, Integer> getPeople() {
		return people;
	}

	@PostMapping("/people")
	public void addPerson(
			@RequestParam String name,
			@RequestParam Integer age) {
		people.put(name, age);
	}
}