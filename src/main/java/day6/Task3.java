package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ольга Петровна", "Математика");
        Student student1 = new Student("Василий Петров");
        teacher1.evaluate(student1);
    }
}

class Teacher{
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student) {
        Random random = new Random();
        int mark = random.nextInt(2,5);
        String markString;
        switch (mark) {
            case 2:
                markString = "неудовлетворительно";
                break;
            case 3:
                markString = "удовлетворительно";
                break;
            case 4:
                markString = "хорошо";
                break;
            case 5:
                markString = "отлично";
                break;
            default:
                markString = "";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку " + markString);
    }
}

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}