package academy.learnprogramming.lists;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String secondName;
    private Integer id;

    public Employee(String firstName, String secondName, Integer id){
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) &&
                secondName.equals(employee.secondName) &&
                id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", id=" + id +
                '}';
    }
}
