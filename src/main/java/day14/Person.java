package day14;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name:" + this.name +
                ", age:" + this.age +
                "}";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
