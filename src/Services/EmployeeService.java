package Services;

import Domain.Employee;
import Domain.PersonComparator;

import java.util.ArrayList;
import java.util.List;


public class EmployeeService implements iPersonService<Employee>{
    private int countEmployee;
    private List<Employee> employeeList;


    public EmployeeService() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public void create(String name, int age) {
        Employee employee = new Employee(name, age, "basic");
        employeeList.add(employee);
        countEmployee++;
    }

    public void sortByFIO() {
        PersonComparator<Employee> personComparator = new PersonComparator<>();
        employeeList.sort(personComparator);
    }
}
