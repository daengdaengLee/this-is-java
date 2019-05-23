package sec06;

public class Student implements Comparable<Student> {
  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  // score 기준 오름차순 정렬
  @Override
  public int compareTo(Student student) {
    return Integer.compare(score, student.getScore());
  }
}
