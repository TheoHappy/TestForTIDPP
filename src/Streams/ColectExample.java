package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ColectExample {
    public static void main(String[] args) {
        Student st1 = new Student("Andrei", 'm', 22, 3, 9.4);
        Student st2 = new Student("Ina", 'f', 32, 3, 5.4);
        Student st3 = new Student("Dima", 'm', 19, 1, 6.8);
        Student st4 = new Student("Diana", 'f', 25, 2, 7.2);
        Student st5 = new Student("Sergiu", 'm', 26, 4, 8.8);

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        Map<Integer,List<Student>> map = list.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        }).collect(Collectors.groupingBy(el -> el.getCourse()));

        for (Map.Entry<Integer,List<Student>> element: map.entrySet()){
            System.out.println(element.getKey() + " " + element.getValue().toString());
        }

        Map<Boolean, List<Student>> map2 =
                list.stream().
                collect(Collectors.partitioningBy(el -> el.getAvgGrade()>7));



        for (Map.Entry<Boolean, List<Student>> element: map2.entrySet()){
            System.out.println(element.getValue().toString());
        }
    }
}
