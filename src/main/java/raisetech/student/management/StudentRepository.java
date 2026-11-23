package raisetech.student.management;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentRepository {

  @Select("SELECT * FROM student")
  List<Student> findAll();

  @Select("SELECT * FROM student WHERE name = #{name}")
  Student searchByName(@Param("name") String name);

  @Insert("INSERT INTO student (name, age) VALUES (#{name}, #{age})")
  void registerStudent(@Param("name") String name, @Param("age") int age);

  @Update("UPDATE student SET name = #{newName}, age = #{age} WHERE id = #{id}")
  void updateStudent(@Param("id") int id, @Param("newName") String newName, @Param("age") int age);

  @Delete("DELETE FROM student WHERE id = #{id}")
  void deleteStudent(@Param("id") int id);
}