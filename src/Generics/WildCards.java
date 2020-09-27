package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(14);
        intList.add(24);
        showListElements(intList);
        System.out.println("Sum -> " + summ(intList));
        List<String> strList = new ArrayList<>();
        strList.add("Vasile");
        strList.add("merge");
        strList.add("bine");
        showListElements(strList);
    }
    static void showListElements(List<?> list){
        System.out.println("Elements in list are: " + list.toString());
    }
    public static double summ(ArrayList<? extends Number> list){
        double sum = 0;
        for (Number n: list){
            sum += n.doubleValue();
        }
        return sum;
    }
}

