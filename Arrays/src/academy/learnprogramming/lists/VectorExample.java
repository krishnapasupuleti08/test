package academy.learnprogramming.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Krishna","Mohan",123));
        employeeList.add(new Employee("Aruna","Kumari",234));
        employeeList.add(new Employee("Bala","Subramanyam",345));

    }
}
