package Streams;

import java.util.ArrayList;
import java.util.List;

public class FlatMapEx {
    public static void main(String[] args) {
        Student st1 = new Student("Andrei", 'm', 22, 3, 9.4);
        Student st2 = new Student("Ina", 'f', 32, 3, 5.4);
        Student st3 = new Student("Dima", 'm', 19, 1, 6.8);
        Student st4 = new Student("Diana", 'f', 25, 2, 7.2);
        Student st5 = new Student("Sergiu", 'm', 26, 4, 8.8);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Informatics");

        f1.addStudentOnFaculty(st1);
        f1.addStudentOnFaculty(st3);
        f1.addStudentOnFaculty(st5);
        f2.addStudentOnFaculty(st2);
        f2.addStudentOnFaculty(st4);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().filter(e -> e.name == "Informatics")
                .flatMap(element -> element.getStudentsOnFaculty().stream())
                .forEach(System.out::println);


    }
}

class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentOnFaculty(Student student){
        studentsOnFaculty.add(student);
    }
}
