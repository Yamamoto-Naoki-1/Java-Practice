package raisetech.student.management.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.student.management.data.StudentCourse;

@Mapper
public interface StudentCourseRepository {

  @Select("SELECT * FROM students_courses")
  List<StudentCourse> findAll();

  // Javaコースを検索
  @Select("SELECT * FROM students_courses WHERE course_name = 'Javaコース'")
  List<StudentCourse> searchStudentCourse();
}