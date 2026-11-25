package raisetech.student.management.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentCourse;
import raisetech.student.management.service.StudentService;

@RestController
public class StudentController {

  private final StudentService service;

  @Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }

  // 今回の課題：30代の受講生一覧
  @GetMapping("/studentList")
  public List<Student> getStudentList() {
    return service.searchStudentList();
  }

  // 今回の課題：Javaコース一覧
  @GetMapping("/studentsCourseList")
  public List<StudentCourse> getStudentCourseList() {
    return service.searchStudentCourseList();
  }

  // 以前のCRUD課題：全受講生
  @GetMapping("/students")
  public List<Student> getStudents() {
    return service.findAll();
  }

  // 以前のCRUD課題：全コース
  @GetMapping("/students-courses")
  public List<StudentCourse> getStudentCourses() {
    return service.findAllStudentCourses();
  }

  // 以前のCRUD課題：名前で検索
  @GetMapping("/student")
  public Student getStudent(@RequestParam String name) {
    return service.searchByName(name);
  }

  // 以前のCRUD課題：登録
  @PostMapping("/student")
  public void registerStudent(
      @RequestParam String name,
      @RequestParam int age
  ) {
    service.registerStudent(name, age);
  }

  // 以前のCRUD課題：更新
  @PutMapping("/student")
  public void updateStudent(
      @RequestParam int id,
      @RequestParam String name,
      @RequestParam int age
  ) {
    service.updateStudent(id, name, age);
  }

  // 以前のCRUD課題：削除
  @DeleteMapping("/student")
  public void deleteStudent(@RequestParam int id) {
    service.deleteStudent(id);
  }
}
