package raisetech.student.management.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentCourse;
import raisetech.student.management.repository.StudentCourseRepository;
import raisetech.student.management.repository.StudentRepository;

@Service
public class StudentService {

  private final StudentRepository studentRepository;
  private final StudentCourseRepository studentCourseRepository;

  @Autowired
  public StudentService(
      StudentRepository studentRepository,
      StudentCourseRepository studentCourseRepository
  ) {
    this.studentRepository = studentRepository;
    this.studentCourseRepository = studentCourseRepository;
  }

  // 30代の受講生を検索
  public List<Student> searchStudentList() {
    return studentRepository.search();
  }

  // Javaコースの受講生コース情報を検索
  public List<StudentCourse> searchStudentCourseList() {
    return studentCourseRepository.searchStudentCourse();
  }

  // 以前のCRUD課題：全受講生
  public List<Student> findAll() {
    return studentRepository.findAll();
  }

  // 以前のCRUD課題：名前で検索
  public Student searchByName(String name) {
    return studentRepository.searchByName(name);
  }

  // 以前のCRUD課題：登録
  public void registerStudent(String name, int age) {
    studentRepository.registerStudent(name, age);
  }

  // 以前のCRUD課題：更新
  public void updateStudent(int id, String name, int age) {
    studentRepository.updateStudent(id, name, age);
  }

  // 以前のCRUD課題：削除
  public void deleteStudent(int id) {
    studentRepository.deleteStudent(id);
  }

  // 以前のCRUD課題：全コース
  public List<StudentCourse> findAllStudentCourses() {
    return studentCourseRepository.findAll();
  }
}