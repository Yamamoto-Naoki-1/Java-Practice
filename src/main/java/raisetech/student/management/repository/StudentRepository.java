package raisetech.student.management.repository;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import raisetech.student.management.data.Student;

@Mapper
public interface StudentRepository {

  // 以前のCRUD：全件検索
  @Select("SELECT * FROM student")
  List<Student> findAll();

  // 以前のCRUD：名前で検索
  @Select("SELECT * FROM student WHERE name = #{name}")
  Student searchByName(@Param("name") String name);

  // 以前のCRUD：登録
  @Insert("INSERT INTO student (name, age) VALUES (#{name}, #{age})")
  void registerStudent(@Param("name") String name, @Param("age") int age);

  // 以前のCRUD：更新
  @Update("UPDATE student SET name = #{newName}, age = #{age} WHERE id = #{id}")
  void updateStudent(
      @Param("id") int id,
      @Param("newName") String newName,
      @Param("age") int age
  );

  // 以前のCRUD：削除
  @Delete("DELETE FROM student WHERE id = #{id}")
  void deleteStudent(@Param("id") int id);

  // 今回の課題：30代の受講生を検索
  @Select("SELECT * FROM students WHERE age >= 30 AND age < 40")
  List<Student> search();

  // 受講生管理システム用：全受講生を検索
  @Select("SELECT * FROM students")
  List<Student> findAllStudents();
}
