package Comparation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Theo");
        listOfNames.add("Dima");
        listOfNames.add("Andrei");
        listOfNames.add("Petea");
        System.out.println(listOfNames);
        Collections.sort(listOfNames);
        System.out.println(listOfNames);
    }
}
