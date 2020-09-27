package Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Vasile");
        listOfNames.add("Andrei");
        listOfNames.add("Dima");
        listOfNames.add("Alexei");

        List<Integer> lengthOfNames = listOfNames.stream().map(element -> element.length()).collect(Collectors.toList());

        System.out.println(listOfNames);
        System.out.println(lengthOfNames);

        int[] a = {1, 4, 8, 10, 56, 34, 767, 13, 29};

        int[] evenElements = Arrays.stream(a).map(element -> {
            if (element % 2 == 0){
                element = element+1;
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(evenElements));

        List<Integer> list = Arrays.asList(1, 4, 8, 10, 56, 34, 767, 13, 29);
        List<Integer> listOfEvenNumbers = list.stream().map(element ->{
            int number = -1;
            if (element % 2 == 0){
                number = element;
            }
            return number;
        }).collect(Collectors.toList());
        listOfEvenNumbers.removeIf( e ->( e == -1));
        System.out.println(listOfEvenNumbers);


    }
}
