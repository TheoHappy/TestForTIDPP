package Collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEX {
    public static void main(String[] args) {
        Student st1 = new Student("Valodea", "Ivanov", 30);
        Student st2 = new Student("Serghei", "Petrov", 12);
        Student st3 = new Student("Andrei", "Harlam", 34);
        Student st4 = new Student("Victor", "Lohas", 56);

        Student st5 = new Student("Valodea", "Ivanov", 30);

        Map <Student, Double> map = new HashMap<>();

        map.put(st1,1.1);
        map.put(st2,1.2);
        map.put(st3,1.3);
        map.put(st4,1.4);
        map.put(st5,1.5);

        System.out.println(map);

        for (Map.Entry<Student,Double> entry :map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

class Student{
    private String name;
    private String surName;
    private int age;

    public Student(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age);
    }
}
