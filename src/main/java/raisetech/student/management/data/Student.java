package raisetech.student.management.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
  private Integer id;
  private String name;
  private String furigana;
  private String nickname;
  private String email;
  private String city;
  private Integer age;
  private String gender;
}