public class Student {
    String name;
    int age;
    String grade;
    int coursegrade;

    public Student(String name, int age, String grade, int coursegrade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.coursegrade = (char) coursegrade;
    }
    //This helps the main java run//
}
