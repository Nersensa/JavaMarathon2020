package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("ВОВА", "IA-92");
        Teacher teacher = new Teacher("Sasha", "Math");
        System.out.println(student1.getGroup());
        System.out.println(teacher.getSubject());
        student1.printInfo();
        teacher.printInfo();
    }
}
