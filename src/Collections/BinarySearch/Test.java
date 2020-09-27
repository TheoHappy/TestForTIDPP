package Collections.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Vasile", 12000);
        Employee emp2 = new Employee(5, "Andrei", 14000);
        Employee emp3 = new Employee(3, "Dima" , 9999);
        Employee emp4 = new Employee(3, "Ana" , 9999);
        List <Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index = Collections.binarySearch(employeeList, new Employee(3, "Dima" , 9999));
        System.out.println(index);

    }
}
