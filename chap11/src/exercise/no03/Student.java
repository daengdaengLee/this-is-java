package exercise.no03;

public class Student {
  private String studentNum;

  public Student(String studentNum) {
    this.studentNum = studentNum;
  }

  public String getStudentNum() {
    return studentNum;
  }

  @Override
  public int hashCode() {
    return studentNum.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    Student student = (Student) obj;
    return studentNum.equals(student.getStudentNum());
  }
}
