package academy.learnprogramming.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Krishna","Mohan",123));
        employeeList.add(new Employee("Aruna","Kumari",234));
        employeeList.add(new Employee("Bala","Subramanyam",345));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.get(1));


    }
}
