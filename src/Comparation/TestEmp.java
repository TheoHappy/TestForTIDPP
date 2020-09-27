package Comparation;

import java.util.*;

public class TestEmp {
    public static void main(String[] args) {
        Employee emp1 = new Employee(2,"Andrei","Sidorov",12999);
        Employee emp2 = new Employee(1,"Alexei","Golubi",15999);
        Employee emp3 = new Employee(5,"Andrei","Petrov",10999);

        List <Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(emp1);
        listOfEmployees.add(emp2);
        listOfEmployees.add(emp3);
        Collections.sort(listOfEmployees, new SalaryComparator());
        System.out.println(listOfEmployees);


    }
}

class Employee  implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
    // Vom compara lucratorii nostri dupa id
    @Override
    public int compareTo(Employee anotherEmployee) {
        //  first implementation
        if (this.id == anotherEmployee.id) {
            return 0;
        } if (this.id > anotherEmployee.id)
        {
            return 1;
        } else {
            return -1;
        }

        //  second implementation
        //return this.id - anotherEmployee.id;
        //  third implementation
        // return this.id.compareTo(anotherEmployee.id); //Pentru a folosi asta trebuie sa folosim tipuri de date obiect, in cazul dat Integer
        //implementation for names
//        int res = this.name.compareTo(anotherEmployee.name);
//        if (res == 0) { //daca persoanele au acelasi nume le comparam dupa prenume
//            res = this.surname.compareTo(anotherEmployee.surname);
//        }
//        return res;


    }
}

class IdComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
          if (emp1.id == emp2.id) {
            return 0;
        } if (emp1.id > emp2.id) {
            return 1;
        } else {
            return -1;
        }

    }
}

class SalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}

