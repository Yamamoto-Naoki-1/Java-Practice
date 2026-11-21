package raisetech.student.management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// 全学生の一覧表示
	@GetMapping("/students")
	public List<Student> getStudents() {
		return repository.findAll();
	}

	// 名前で学生を検索
	@GetMapping("/student")
	public Student getStudent(@RequestParam String name) {
		return repository.searchByName(name);
	}

	// 学生を登録
	@PostMapping("/student")
	public void registerStudent(
			@RequestParam String name,
			@RequestParam int age) {
		repository.registerStudent(name, age);
	}

	// 学生情報を更新
	@PutMapping("/student")
	public void updateStudent(
			@RequestParam int id,
			@RequestParam String name,
			@RequestParam int age) {
		repository.updateStudent(id, name, age);
	}

	// 学生を削除
	@DeleteMapping("/student")
	public void deleteStudent(@RequestParam int id) {
		repository.deleteStudent(id);
	}
}